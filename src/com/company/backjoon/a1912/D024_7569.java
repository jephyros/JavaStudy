package com.company.backjoon.a1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-26
 * Remark : https://www.acmicpc.net/problem/7569  토마토
 */
public class D024_7569 {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine(), " ");
        int colcnt = Integer.parseInt(st1.nextToken());
        int rowcnt = Integer.parseInt(st1.nextToken());
        int heicnt = Integer.parseInt(st1.nextToken());

        int resultCnt = 0;

        int[] dr ={-1,1,0,0,0,0};
        int[] dc ={0,0,-1,1,0,0};
        int[] dh ={0,0,0,0,-1,1};
        int [][][] data = new int[heicnt][rowcnt][colcnt];

        for (int i = 0; i < heicnt; i++) {
            for (int j = 0; j < rowcnt; j++) {

                StringTokenizer st2 = new StringTokenizer(bufferedReader.readLine(), " ");

                for (int k = 0; k < colcnt; k++) {
                    data[i][j][k] = Integer.parseInt(st2.nextToken());
                }
            }
        }


//        int[][][] data ={
//                {
//                        {0,0,0,0,0},
//                        {0,0,0,0,0},
//                        {0,0,0,0,0},
//                },
//                {
//                        {0,0,0,0,0},
//                        {0,0,1,0,0},
//                        {0,0,0,0,0},
//                },
//        };

        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<heicnt;i++) {
            for (int j = 0; j < rowcnt; j++){
                for(int k=0; k< colcnt;k++) {
                    if (data[i][j][k] == 1) {
                        data[i][j][k] = 3; //방문시 3 으로변경
                        q.add(new int[]{i, j, k, 0});
                    }
                }

            }
        }
        while(!q.isEmpty()){
            int[] poll = q.poll();
            int hei = poll[0];
            int row = poll[1];
            int col = poll[2];
            int cnt = poll[3];

            for (int i =0 ; i< 6;i++){
                int mr = row + dr[i];
                int mc = col + dc[i];
                int mh = hei + dh[i];
                //이동위치가 data 범위내에있을때만
                if(mr >= 0 && mr < rowcnt && mc >=0 && mc<colcnt && mh >=0 && mh<heicnt ){
                    if(data[mh][mr][mc] == 0  ){
                        data[mh][mr][mc] = 3; //방문시 3 으로변경
                        if (resultCnt < cnt +1) {
                            resultCnt = cnt + 1;
                        }

                        q.add(new int[]{mh,mr,mc,cnt+1});

                    }
                }
            }

        }
        loop1:
        for(int i = 0;i<heicnt;i++) {
            for (int j = 0; j < rowcnt; j++){
                for(int k=0; k< colcnt;k++) {
                    if (data[i][j][k] == 0) {
                        resultCnt = -1;
                        break loop1;
                    }
                }

            }
        }
        System.out.printf("%d",resultCnt);


    }
}
