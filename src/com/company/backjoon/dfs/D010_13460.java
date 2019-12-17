package com.company.backjoon.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-16
 * Remark : https://www.acmicpc.net/problem/13460 구슬탈출2
 */
public class D010_13460 {
    public static void main(String[] args) throws Exception {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine(), " ");
        int rowCnt = Integer.parseInt(st1.nextToken());
        int colCnt = Integer.parseInt(st1.nextToken());

        //전후좌우 이동방향
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int[][] data = new int[rowCnt][colCnt];

        int brow = 0, bcol = 0, rrow = 0, rcol = 0;
        for (int i = 0; i < rowCnt; i++) {
            String str = bufferedReader.readLine();
            for (int j = 0; j < colCnt; j++) {
                // #:3 , .:0, R:1, B:2, O:4
                if (str.charAt(j) == '#') {
                    data[i][j] = 3;
                }
                if (str.charAt(j) == '.') {
                    data[i][j] = 0;
                }
                if (str.charAt(j) == 'R') {
                    data[i][j] = 1;
                    rrow = i;
                    rcol = j; // 빨강구슬위치

                }
                if (str.charAt(j) == 'B') {
                    data[i][j] = 2;
                    brow = i;
                    bcol = j; // 빨강구슬위치

                }
                if (str.charAt(j) == 'O') {
                    data[i][j] = 4;


                }

            }
        }


//
//
//
//        int[][] data ={
//                {3,3,3,3,3},
//                {3,0,0,2,3},
//                {3,0,3,0,3},
//                {3,1,4,0,3},
//                {3,3,3,3,3}
//        };

//        for(int i = 0;i<rowCnt;i++){
//            for(int j = 0 ; j< colCnt;j++){
//                System.out.printf("%d",data[i][j]);
//            }
//            System.out.println("");
//        }


        Queue<int[]> q = new LinkedList<>();
        //(depth,,파란볼ROW,파란볼COL,빨간볼ROW,빨간볼COL) 배열 을 큐에 넣는다.
        q.add(new int[]{0,  rrow, rcol,brow, bcol});


        int resultcnt = -1;
        loop:
        while (!q.isEmpty()) {
            int[] p = q.poll();
            int cnt = p[0];
            int rr = p[1];
            int rc = p[2];
            int br = p[3];
            int bc = p[4];


            if (cnt >= 10) break; // 반복문  종료

            //위,아래,좌,우로 움직이기
            for (int i = 0; i < 4; i++) {
                //빨간공 이동
                int rmovecnt = 0;
                boolean chkblue = false;
                boolean redend = false;
                int mr, mc;
                mr = rr + dr[i];
                mc = rc + dc[i];
                while (data[mr][mc] != 3) {
                    rmovecnt++;
                    //이동시 파란공을만나면 체크
                    if (mr == br && mc == bc) {
                        chkblue = true;
                    }
                    //빨간공이 가다가 구멍을 만나면
                    if (data[mr][mc] == 4) {
                        redend = true;

                    }
                    //같은방향으로 계속이동
                    mr = mr + dr[i];
                    mc = mc + dc[i];
                }
                //파란공 이동
                int bmovecnt = 0;
                boolean chkRed = false;
                boolean blueend = false;
                mr = br + dr[i];
                mc = bc + dc[i];
                while (data[mr][mc] != 3) {
                    bmovecnt++;
                    //이동시 빨간공을만나면 체크
                    if (mr == rr && mc == rc) {
                        chkRed = true;
                    }
                    //파란공 가다가 구멍을 만나면
                    if (data[mr][mc] == 4) {
                        blueend = true;

                    }
                    //같은방향으로 계속이동
                    mr = mr + dr[i];
                    mc = mc + dc[i];
                }
                // 빨간공과 파란공이 만나지않을경우
                if (!chkblue && !chkRed) {
                    //
                    if (redend) {
                        if (resultcnt < 0) {
                            resultcnt = cnt + 1;
                        } else {
                            if (resultcnt > cnt + 1) {
                                resultcnt = cnt + 1;
                            }
                        }
                        break;
                        //break loop;
                    } else if (blueend) { // 파랑이들어갔으므로 실패
                        continue;
                    } else {
                        q.add(new int[]{cnt + 1, rr + dr[i] * rmovecnt, rc + dc[i] * rmovecnt, br + dr[i] * bmovecnt, bc + dc[i] * bmovecnt});
                    }
                }
                //빨강보다 앞에 파랑이있으면
                else if (chkblue) {
                    //빨강만 구멍에 들어가고 파랑이안들어가면 성공
                    if (redend && !blueend) {

                        if (resultcnt < 0) {
                            resultcnt = cnt + 1;
                        } else {
                            if (resultcnt > cnt + 1) {
                                resultcnt = cnt + 1;
                            }
                        }
                        break;
                        //break loop;
                    } else if (!redend && !blueend) { //둘다구멍에안들어가면  빨랑 이동수 -1 후 큐호출
                        rmovecnt -= 1;
                        q.add(new int[]{cnt + 1, rr + dr[i] * rmovecnt, rc + dc[i] * rmovecnt, br + dr[i] * bmovecnt, bc + dc[i] * bmovecnt});

                    } else {//나머지경우는 실패이므로 continue
                        continue;
                    }
                }
                //파랑보다 빨강이 앞에있으면
                else {
                    //한개만들어가도 다들어가서 실패
                    if (redend) {
                        continue;
                    } else { //파랑이동수 -1 후 큐 호출
                        bmovecnt -= 1;
                        q.add(new int[]{cnt + 1, rr + dr[i] * rmovecnt, rc + dc[i] * rmovecnt, br + dr[i] * bmovecnt, bc + dc[i] * bmovecnt});

                    }
                }

            }
        }

        System.out.printf("%d", resultcnt);

    }


}
