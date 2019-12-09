package com.company.backjoon.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-09
 * Remark : https://www.acmicpc.net/problem/14502  연구소
 */
public class D005_14502 {
    public static int RESULTCNT =0;//안전지대 수

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int rowcnt =Integer.parseInt(st1.nextToken());
        int colcnt =Integer.parseInt(st1.nextToken());

        int[][] data = new int[rowcnt][colcnt];
        int[][] tmp_map = new int[rowcnt][colcnt];
        int wallcnt = 0;


        for(int i = 0;i < rowcnt;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<colcnt;j++){
                int d = Integer.parseInt(st2.nextToken());
                data[i][j]=d;
            }
        }
//
//        int[][] data = {
//        {2,0,0,0,1,1,0},
//        {0,0,1,0,1,2,0},
//        {0,1,1,0,1,0,0},
//        {0,1,0,0,0,0,0},
//        {0,0,0,0,0,1,1},
//        {0,1,0,0,0,0,0},
//        {0,1,0,0,0,0,0}
//        };

        for(int i =0 ;i<rowcnt;i++){
            for(int j=0;j < colcnt; j++){
                if (data[i][j] == 0) {
                    //tmp_map 초기화
                    copyData(tmp_map, data, rowcnt, colcnt);
                    tmp_map[i][j] = 9;
                    wallcnt = 1;
                    fnMakeWall(wallcnt, i, j, rowcnt, colcnt, tmp_map);
                }
            }
        }
        System.out.println(RESULTCNT);
    }

    private static void copyData(int[][] tmp_map, int[][] data,int rowcnt,int colcnt) {
        for(int i =0 ;i<rowcnt;i++){
            for(int j=0;j < colcnt; j++){
               tmp_map[i][j] = data[i][j];
            }
        }
    }

    //벽을 3개세운다
    private static void fnMakeWall(int wallcnt,int currow,int curcol,int rowcnt,int colcnt,int[][] tmp_map) {
        if(wallcnt==3){
//
//            for (int i = 0; i < rowcnt; i++) {
//                for (int j = 0; j < colcnt; j++) {
//                    System.out.printf("%d",tmp_map[i][j]);
//                }
//                System.out.println("");
//            }
//            System.out.println("");

            //BFS를 통한 바이러스 이동로
            int[][] bfsmap = new int[rowcnt][colcnt];
            copyData(bfsmap,tmp_map,rowcnt,colcnt);
            for (int i = 0; i < rowcnt; i++) {
                for (int j = 0; j < colcnt; j++) {
                    if(tmp_map[i][j]==2){
                        fnBFS(i,j,rowcnt,colcnt,bfsmap);
                    }
                }
            }
            int checkcnt =0;
            for (int i = 0; i < rowcnt; i++) {
                for (int j = 0; j < colcnt; j++) {
                    if(bfsmap[i][j]==0){
                        checkcnt +=1;
                    }
                }
            }

//            for (int i = 0; i < rowcnt; i++) {
//                for (int j = 0; j < colcnt; j++) {
//                    System.out.printf("%d",bfsmap[i][j]);
//                }
//                System.out.println("");
//            }
//            System.out.println("");



            if (RESULTCNT < checkcnt){
                RESULTCNT = checkcnt;
            }



        }else {
            for (int i = 0; i < rowcnt; i++) {
                for (int j = 0; j < colcnt; j++) {
                    if (tmp_map[i][j] == 0) {
                        tmp_map[i][j] = 9;
                        fnMakeWall(wallcnt+1, i, j, rowcnt, colcnt, tmp_map);

                        tmp_map[i][j] = 0; //다시 백트랙킹시 0으로 초기회
                    }
                }
            }
        }

    }

    private static void fnBFS(int startrow,int startcol, int rowcnt, int colcnt, int[][] tmp_map) {
        //DFS 로 바이러스 퍼트리고 안정공간수확인
        int drow = 0;
        int dcol = 0;
        //위
        drow = startrow - 1;
        dcol = startcol;
        if(drow >= 0 && drow < rowcnt && dcol>=0 && dcol < colcnt ){
            if(tmp_map[drow][dcol]==0){
                tmp_map[drow][dcol]=2;
                fnBFS(drow,dcol,rowcnt,colcnt,tmp_map);
            }
        }

        //아래
        drow = startrow + 1;
        dcol = startcol;
        if(drow >= 0 && drow < rowcnt && dcol>=0 && dcol < colcnt ){
            if(tmp_map[drow][dcol]==0){
                tmp_map[drow][dcol]=2;
                fnBFS(drow,dcol,rowcnt,colcnt,tmp_map);
            }
        }

        //좌
        drow = startrow ;
        dcol = startcol-1;
        if(drow >= 0 && drow < rowcnt && dcol>=0 && dcol < colcnt ){
            if(tmp_map[drow][dcol]==0){
                tmp_map[drow][dcol]=2;
                fnBFS(drow,dcol,rowcnt,colcnt,tmp_map);
            }
        }
        //우
        drow = startrow ;
        dcol = startcol+1;
        if(drow >= 0 && drow < rowcnt && dcol>=0 && dcol < colcnt ){
            if(tmp_map[drow][dcol]==0){
                tmp_map[drow][dcol]=2;
                fnBFS(drow,dcol,rowcnt,colcnt,tmp_map);
            }
        }


    }

}
