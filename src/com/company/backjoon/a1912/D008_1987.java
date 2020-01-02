package com.company.backjoon.a1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-12
 * Remark : https://www.acmicpc.net/problem/1987  알파벳
 */
public class D008_1987 {
    public static int MAXCNT=0;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int rowCnt = Integer.parseInt(st1.nextToken());
        int colCnt = Integer.parseInt(st1.nextToken());

        int[][] data = new int[rowCnt][colCnt];

        for(int i=0;i<rowCnt;i++){
            String str = br.readLine();
            for(int j =0;j<colCnt;j++) {
                data[i][j] = str.charAt(j);
            }

        }

        int[] visit = new int [100];



//        int[][] data = {
//                {'C','A','A','B'},
//                {'A','D','C','B'}
//        };




        fnDFB(0,0,data,rowCnt,colCnt,visit,1);
        System.out.println(MAXCNT);
    }

    private static void fnDFB(int r, int c, int[][] data, int rowCnt, int colCnt, int[] visit,int mvcnt) {
        if (MAXCNT< mvcnt) MAXCNT = mvcnt;
        visit[data[r][c]] = 1;
        int dr,dc;
        //위
        dr = r - 1;
        dc = c;
        if(dr >=0 && dr < rowCnt && dc >= 0 && dc < colCnt){
            if(visit[data[dr][dc]] == 0){
                fnDFB(dr,dc,data,rowCnt,colCnt,visit,mvcnt+1);
            }
        }
        //아래
        dr = r +1;
        dc = c;
        if(dr >=0 && dr < rowCnt && dc >= 0 && dc < colCnt){
            if(visit[data[dr][dc]] == 0){
                fnDFB(dr,dc,data,rowCnt,colCnt,visit,mvcnt+1);
            }
        }

        //좌
        dr = r;
        dc = c - 1;
        if(dr >=0 && dr < rowCnt && dc >= 0 && dc < colCnt){
            if(visit[data[dr][dc]] == 0){
                fnDFB(dr,dc,data,rowCnt,colCnt,visit,mvcnt+1);
            }
        }
        //우
        dr = r;
        dc = c + 1;
        if(dr >=0 && dr < rowCnt && dc >= 0 && dc < colCnt){
            if(visit[data[dr][dc]] == 0){
                fnDFB(dr,dc,data,rowCnt,colCnt,visit,mvcnt+1);
            }
        }
        //백트래킹(다른길로갈경우를 위해 원래값으로초기화
        visit[data[r][c]] = 0;


    }


}

