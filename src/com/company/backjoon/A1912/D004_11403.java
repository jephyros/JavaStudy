package com.company.backjoon.A1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-06
 * Remark : https://www.acmicpc.net/problem/11403  경로 찾기
 */
public class D004_11403 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int matrixSize = Integer.parseInt(br.readLine());
        int[][] result = new int[matrixSize][matrixSize];

        //인접행열저장을위한 Arraylist
        ArrayList<Integer>[] amatrix = new ArrayList[matrixSize];
        for(int i=0; i<matrixSize;i++){
            amatrix[i] = new ArrayList();
        }
        int[][] data = new int[matrixSize][matrixSize];
        for(int i = 0;i < matrixSize;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<matrixSize;j++){
                int d = Integer.parseInt(st.nextToken());
                data[i][j]=d;
            }
        }
//        int[][] data = {
//                {0,0,0,1,0,0,0},
//                {0,0,0,0,0,0,1},
//                {0,0,0,0,0,0,0},
//                {0,0,0,0,1,1,0},
//                {1,0,0,0,0,0,0},
//                {0,0,0,0,0,0,1},
//                {0,0,1,0,0,0,0}
//                };

        fnMakeAMarix(matrixSize, data, amatrix);
        //인접행열인쇄
//        for (int i = 0; i <  matrixSize; i++) {
//            System.out.printf("%d -> ",i);
//            for(int v : amatrix[i]){
//                System.out.printf("%d ",v);
//            }
//            System.out.println("");
//        }

        for (int i = 0; i < matrixSize; i++) {
            //방문체크
            int[] visit = new int[matrixSize*matrixSize];
            for(int v : amatrix[i]){
                fnDFS(i, v, amatrix, visit, result);
            }

        }

        for (int i = 0; i < matrixSize; i++) {
            for(int j = 0; j< matrixSize; j++){
                System.out.printf("%d ",result[i][j]);
            }
            System.out.println("");

        }
    }

    private static void fnDFS(int firststart,int start, ArrayList<Integer>[] amatrix, int[] visit,int[][] result) {
        if (visit[start] !=1 ){
            visit[start] =1;
            result[firststart][start] =1;
            for(int v : amatrix[start]){
                fnDFS(firststart,v,amatrix,visit,result);
            }
        }
    }

    private static void fnMakeAMarix(int matrixSize, int[][] data, ArrayList<Integer>[] amatrix) {
        for (int i = 0; i < matrixSize; i++) {
            for(int j = 0; j< matrixSize; j++){
                if(i != j && data[i][j] == 1) {
                    amatrix[i].add(j);
                }
            }

        }
    }

}
