package com.company.backjoon.a2001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2020-01-07
 * Remark : https://www.acmicpc.net/problem/1018
 */
public class J011_1018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[][] data = new int[r][c] ;

        for(int i = 0;i<r;i++){
            String str = br.readLine();
            for(int j=0;j<c;j++){
                if(str.substring(j,j+1).equals("W")) {
                    data[i][j] = 0;
                }else{
                    data[i][j] = 1;
                }

            }
        }
        int resultcnt =-1;
        for(int i=0;i< r-7;i++) {
            for (int j = 0; j < c - 7; j++) {
                if (resultcnt == -1) {
                    resultcnt = checkData(i, j, data);
                }else if(resultcnt > checkData(i, j, data)) {
                    resultcnt = checkData(i, j, data);
                }
            }
        }
        System.out.println(resultcnt);


    }
    public static int checkData(int r,int c, int[][] data){
        int resultcnt1 =0;
        int resultcnt2 =0;
        int[][] checkdata1 ={
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
        };
        int[][] checkdata2 ={
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
        };
        for(int i = r;i<r+8;i++){
            for(int j = c;j<c+8;j++){
                if(data[i][j] != checkdata1[i-r][j-c]){
                    resultcnt1 ++;
                }
                if(data[i][j] != checkdata2[i-r][j-c]){
                    resultcnt2 ++;
                }

            }
        }
        return Math.min(resultcnt1,resultcnt2);
    }
}
