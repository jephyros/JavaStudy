package com.company.backjoon.A1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-19
 * Remark : https://www.acmicpc.net/problem/7576 토마토
 */
public class D012_7576 {
    public static void main(String[] args) throws Exception {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine(), " ");
        int colCnt = Integer.parseInt(st1.nextToken());
        int rowCnt = Integer.parseInt(st1.nextToken());

        int resultCnt = 0;
        int[] dr ={-1,1,0,0};
        int[] dc ={0,0,-1,1};

        int[][] data = new int[rowCnt][colCnt];

        for (int i = 0; i < rowCnt; i++) {

            StringTokenizer st2 = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int j = 0; j < colCnt; j++) {
                data[i][j]= Integer.parseInt(st2.nextToken());
            }
        }


//        int[][] data ={
//                {0,0,0,0,0,0},
//                {0,0,0,0,0,0},
//                {0,0,0,0,0,0},
//                {0,0,0,0,0,1}
//        };
//        for(int i = 0;i<rowCnt;i++){
//            for(int j = 0 ; j< colCnt;j++){
//                System.out.printf("%d",data[i][j]);
//            }
//            System.out.println("");
//        }


        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<rowCnt;i++) {
            for (int j = 0; j < colCnt; j++){
                if(data[i][j]==1){
                    data[i][j] = 3; //방문시 3 으로변경
                    q.add(new int[]{i,j,0});
                }

            }
        }
        while(!q.isEmpty()){
            int[] poll = q.poll();
            int row = poll[0];
            int col = poll[1];
            int cnt = poll[2];



            for (int i =0 ; i< 4;i++){
                int mr = row + dr[i];
                int mc = col + dc[i];
                //이동위치가 data 범위내에있을때만
                if(mr >= 0 && mr < rowCnt && mc >=0 && mc<colCnt ){
                    if(data[mr][mc] == 0  ){
                        data[mr][mc] = 3; //방문시 3 으로변경
                        if (resultCnt < cnt +1) {
                            resultCnt = cnt + 1;
                        }

                        q.add(new int[]{mr,mc,cnt+1});

                    }
                }
            }
        }

        loop1:
        for(int i = 0;i<rowCnt;i++) {
            for (int j = 0; j < colCnt; j++){
                if(data[i][j]==0){
                    resultCnt = -1;
                    break loop1;
                }

            }
        }

        System.out.printf("%d",resultCnt);


    }

}
