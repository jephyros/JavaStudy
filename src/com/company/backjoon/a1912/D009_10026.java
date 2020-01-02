package com.company.backjoon.a1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author InSeok
 * Date : 2019-12-13
 * Remark : https://www.acmicpc.net/problem/10026  적록색약
 */
public class D009_10026 {
    public static int RESULTCNT1=0;
    public static int RESULTCNT2=0;
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int[][] data = new int[n][n];
        int[][] data1 = new int[n][n];
        int[][] data2 = new int[n][n];
        int[] visit1 = new int[100];
        int[] visit2 = new int[100];

        for(int i =0;i<n;i++){
            String str = br.readLine();
            for(int j =0;j<n;j++) {
                data[i][j] = str.charAt(j);
            }
        }
//        int[][] data = {
//                {'R','R','R','B','B'},
//                {'G','G','B','B','B'},
//                {'B','B','B','R','R'},
//                {'B','B','R','R','R'},
//                {'R','R','R','R','R'}
//        };

        //데이터 복사
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                data1[i][j] = data[i][j];
                //적록색역은 G -> R로
                if (data[i][j] == 'G'){
                    data2[i][j] ='R';
                }else {
                    data2[i][j] = data[i][j];
                }
            }
        }
        //일반 탐색
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(data1[i][j] != 'X'){

                    RESULTCNT1 += 1;
                    fnDFB(i,j,data1,n,n,data1[i][j]);
                }

            }
        }
        //적록 탐색

        //일반 탐색
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(data2[i][j] != 'X'){

                    RESULTCNT2 += 1;
                    fnDFB(i,j,data2,n,n,data2[i][j]);
                }

            }
        }
        System.out.printf("%d %d",RESULTCNT1,RESULTCNT2);

    }

    private static void fnDFB(int r, int c, int[][] data, int rowCnt, int colCnt, int visitchar) {
        data[r][c] = 'X';
        int dr,dc;
        //위
        dr = r - 1;
        dc = c;
        if(dr >=0 && dr < rowCnt && dc >= 0 && dc < colCnt){
            if(data[dr][dc] == visitchar){
                fnDFB(dr,dc,data,rowCnt,colCnt,visitchar);
            }
        }
        //아래
        dr = r +1;
        dc = c;
        if(dr >=0 && dr < rowCnt && dc >= 0 && dc < colCnt){
            if(data[dr][dc] == visitchar){
                fnDFB(dr,dc,data,rowCnt,colCnt,visitchar);
            }
        }

        //좌
        dr = r;
        dc = c - 1;
        if(dr >=0 && dr < rowCnt && dc >= 0 && dc < colCnt){
            if(data[dr][dc] == visitchar){
                fnDFB(dr,dc,data,rowCnt,colCnt,visitchar);
            }
        }
        //우
        dr = r;
        dc = c + 1;
        if(dr >=0 && dr < rowCnt && dc >= 0 && dc < colCnt){
            if(data[dr][dc] == visitchar){
                fnDFB(dr,dc,data,rowCnt,colCnt,visitchar);
            }
        }




    }
}
