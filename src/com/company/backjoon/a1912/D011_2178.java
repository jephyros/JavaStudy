package com.company.backjoon.a1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-18
 * Remark : https://www.acmicpc.net/problem/2178  미로 탐색
 */
public class D011_2178 {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine(), " ");
        int rowCnt = Integer.parseInt(st1.nextToken());
        int colCnt = Integer.parseInt(st1.nextToken());

        int resultCnt = 0;
        int[] dr ={-1,1,0,0};
        int[] dc ={0,0,-1,1};


        //int[][] visit = new int[rowCnt][colCnt];
        int[][] data = new int[rowCnt][colCnt];

        for (int i = 0; i < rowCnt; i++) {


            String str = bufferedReader.readLine();

            for (int j = 0; j < colCnt; j++) {
                data[i][j]= Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }


//        int[][] data ={
//                {1,0,1,1,1,1},
//                {1,0,1,0,1,0},
//                {1,0,1,0,1,1},
//                {1,1,1,0,1,1}
//        };
//        for(int i = 0;i<rowCnt;i++){
//            for(int j = 0 ; j< colCnt;j++){
//                System.out.printf("%d",data[i][j]);
//            }
//            System.out.println("");
//        }

        Queue<int[]> q = new LinkedList<>();
        //Queue에는 좌표 Row,좌표 Col, DepthCount 를 넣는다.
        data[0][0] = 3; //방문시 3 으로변경
        int[] param = {0,0,0};
        q.add(param);
        while(!q.isEmpty()){

            int[] poll = q.poll();

            int cr = poll[0];
            int cc = poll[1];
            int cnt = poll[2];
            //목표에도착하면 종료
            if(cr== rowCnt-1 && cc == colCnt -1){
                cnt = cnt + 1;
                resultCnt = cnt;
                break;
            }


            for(int i =0;i<4;i++){
                int mr = cr + dr[i];
                int mc = cc + dc[i];

                //이동위치가 data 범위내에있을때만
                if(mr >= 0 && mr < rowCnt && mc >=0 && mc<colCnt ){
                    if(data[mr][mc] == 1  ){
                        data[mr][mc] = 3; //방문시 3 으로변경
                        int[] param2 = {0,0,0};
                        param2[0]=mr;
                        param2[1]=mc;
                        param2[2]=cnt+1;
                        q.add(param2);
                        //q.add(new int[] {mr,mc,cnt+1});
                    }
                }
            }
        }
        System.out.printf("%d",resultCnt);
//        System.out.println("Total Memory : " + Runtime.getRuntime().totalMemory());
//        System.out.println("Free Memory : " + Runtime.getRuntime().freeMemory());
//        System.out.println("Used Memory : " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));


    }
}
