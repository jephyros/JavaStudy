package com.company.backjoon.A1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-11
 * Remark : https://www.acmicpc.net/problem/2583  영역구하기
 */
public class D007_2583 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int rowcnt = Integer.parseInt(st1.nextToken());
        int colcnt =Integer.parseInt(st1.nextToken());
        int n =Integer.parseInt(st1.nextToken());

        int areanumber =1;
        int[][] data = new int[rowcnt][colcnt];
        for (int i = 0; i< n;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st2.nextToken());
            int y1 = Integer.parseInt(st2.nextToken());
            int x2= Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());

            for(int x = x1;x<x2;x++){
                for(int y = y1;y<y2;y++){
                    data[rowcnt-1-y][x]=1;
                }
            }

        }


//        int[][] data ={
//                {0,1,0,0,0,0,0},
//                {1,1,1,1,0,0,0},
//                {1,1,1,1,0,0,0},
//                {0,1,0,0,1,1,0},
//                {0,0,0,0,1,1,0}
//        };

        for(int i= 0 ; i< rowcnt;i++){
            for(int j=0;j<colcnt;j++){
                if(data[i][j] ==0){
                    areanumber += 1;
                    fnBFS(i,j,data,areanumber,rowcnt,colcnt);

                }
            }
        }
//        for(int i= 0 ; i< rowcnt;i++){
//            for(int j=0;j<colcnt;j++){
//                System.out.printf("%d",(data[i][j]));
//            }
//            System.out.println("");
//        }

        int[] resultdata = new int[areanumber-1];

        for(int i= 0 ; i< rowcnt;i++){
            for(int j=0;j<colcnt;j++){
                if(data[i][j]>1){
                    resultdata[data[i][j]-2] +=1;
                }
            }
        }
        Arrays.sort(resultdata);

        System.out.println(resultdata.length);
        for(int i:resultdata){
            System.out.printf("%d ",i);

        }

    }

    private static void fnBFS(int row, int col, int[][] data, int areanumber, int rowcnt, int colcnt) {
        data[row][col] =areanumber;
        int drow,dcol;

        //위
        drow = row -1;
        dcol = col;
        if(drow >= 0 && drow <rowcnt && dcol >= 0 && dcol < colcnt){
            if(data[drow][dcol] == 0){
                fnBFS(drow,dcol,data,areanumber,rowcnt,colcnt);
            }
        }

        //아래
        drow = row + 1;
        dcol = col;
        if(drow >= 0 && drow <rowcnt && dcol >= 0 && dcol < colcnt){
            if(data[drow][dcol] == 0){
                fnBFS(drow,dcol,data,areanumber,rowcnt,colcnt);
            }
        }

        //좌
        drow = row ;
        dcol = col -1;
        if(drow >= 0 && drow <rowcnt && dcol >= 0 && dcol < colcnt){
            if(data[drow][dcol] == 0){
                fnBFS(drow,dcol,data,areanumber,rowcnt,colcnt);
            }
        }
        //우
        drow = row;
        dcol = col + 1;
        if(drow >= 0 && drow <rowcnt && dcol >= 0 && dcol < colcnt){
            if(data[drow][dcol] == 0){
                fnBFS(drow,dcol,data,areanumber,rowcnt,colcnt);
            }
        }


    }
}
