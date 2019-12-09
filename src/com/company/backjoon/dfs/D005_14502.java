package com.company.backjoon.dfs;

/**
 * @author InSeok
 * Date : 2019-12-09
 * Remark : https://www.acmicpc.net/problem/14502  연구소
 */
public class D005_14502 {
    public static void main(String[] args) {
        int rowcnt =7;
        int colcnt =7;

        int resultcnt =0;//안전지대 수
        int[][] tmp_map = new int[rowcnt][colcnt];

        int wallcnt = 3;

        int[][] data = {
        {2,0,0,0,1,1,0},
        {0,0,1,0,1,2,0},
        {0,1,1,0,1,0,0},
        {0,1,0,0,0,0,0},
        {0,0,0,0,0,1,1},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0}
        };

        for(int i =0 ;i<rowcnt;i++){
            for(int j=0;j < colcnt; j++){
                //tmp_map 초기화
                copyData(tmp_map,data,rowcnt,colcnt);
                wallcnt=0;
                fnMakeWall(wallcnt,i,j,rowcnt,colcnt,tmp_map);
            }
        }


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
            System.out.println("");
            //바이러스 이동 후 안전공간 확인하는 함수 체크
            for (int i = 0; i < rowcnt; i++) {
                for (int j = 0; j < colcnt; j++) {
                    System.out.printf("%d",tmp_map[i][j]);
                }
                System.out.println("");
            }
        }else {
            for (int i = currow; i < rowcnt; i++) {
                for (int j = curcol; j < colcnt; j++) {
                    if (tmp_map[i][j] == 0) {
                        tmp_map[i][j] = 1;
                        wallcnt += 1;
                        fnMakeWall(wallcnt, i, j, rowcnt, colcnt, tmp_map);
                        tmp_map[i][j] = 0; //다시 백트랙킹시 0으로 초기회

                    }

                }
            }
        }

    }

}
