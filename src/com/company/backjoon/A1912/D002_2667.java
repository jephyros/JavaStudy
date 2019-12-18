package com.company.backjoon.A1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author InSeok
 * Date : 2019-12-04
 * Remark : https://www.acmicpc.net/problem/2667  단지번호붙이기
 */
public class D002_2667 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int matrixSize = Integer.parseInt(br.readLine());
        int[][] data = new int[matrixSize][matrixSize];

        for(int i=0;i<matrixSize;i++) {
            String s = br.readLine();
            for (int j=0;j<matrixSize;j++){
                data[i][j] = Integer.parseInt(s.substring(j,j+1));
            }

        }

//        int matrixSize=7;
//        int[][] data ={ {0,1,1,0,1,0,0},
//                        {0,1,1,0,1,0,1},
//                        {1,1,1,0,1,0,1},
//                        {0,0,0,0,1,1,1},
//                        {0,1,0,0,0,0,0},
//                        {0,1,1,1,1,1,0},
//                        {0,1,1,1,0,0,0},
//                        };
        int complexNum =1;
        for(int i=0;i<matrixSize;i++){
            for(int j=0;j<matrixSize;j++){
                if (data[i][j]==1) {
                    complexNum++;
                    fnDFS(i, j, data, complexNum, matrixSize);
                }
            }
        }
        int[] complexCnt = new int[complexNum-1];
        for(int i=0;i<matrixSize;i++){
            for(int j=0;j<matrixSize;j++){
                if (data[i][j]>1) {
                    complexCnt[data[i][j] - 2]++;
                }
            }
        }
        //정렬
        Arrays.sort(complexCnt);
        //출력
        System.out.println(complexNum-1);
        for(int i: complexCnt){
            System.out.println(i);
        }


    }

    private static void fnDFS(int x, int y, int[][] data,int complexNum,int matrixSize) {
        //자기자신이 방문했는지 확인
        data[x][y] = complexNum;
        //4방향 탐색
        int dx,dy;
        //좌
        dx= x;
        dy= y-1;
        if (dx > -1 && dx < matrixSize && dy >-1 && dy < matrixSize ){
            if (data[dx][dy]==1){
                fnDFS(dx,dy,data,complexNum,matrixSize);
            }
        }
        //우
        dx= x;
        dy= y+1;
        if (dx > -1 && dx < matrixSize && dy >-1 && dy < matrixSize ){
            if (data[dx][dy]==1){
                fnDFS(dx,dy,data,complexNum,matrixSize);
            }
        }
        //위
        dx= x-1;
        dy= y;
        if (dx > -1 && dx < matrixSize && dy >-1 && dy < matrixSize ){
            if (data[dx][dy]==1){
                fnDFS(dx,dy,data,complexNum,matrixSize);
            }
        }
        //아래
        dx= x+1;
        dy= y;
        if (dx > -1 && dx < matrixSize && dy >-1 && dy < matrixSize ){
            if (data[dx][dy]==1){
                fnDFS(dx,dy,data,complexNum,matrixSize);
            }
        }

    }
}

