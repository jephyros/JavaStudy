package com.company.backjoon.dfs;

/**
 * @author InSeok
 * Date : 2019-12-16
 * Remark : https://www.acmicpc.net/problem/13460
 */
public class D010_13460 {
    public static void main(String[] args) {

        int rowCnt = 5; // Integer.parseInt(st1.nextToken());
        int colCnt = 5; //Integer.parseInt(st1.nextToken());
        int brow, bcol, rrow, rcol ,trow, tcol;
        brow = 1; bcol = 3; // 파랑구슬위치
        rrow = 3; rcol = 1; // 빨강구슬위치
        trow = 3; tcol = 2; // 구멍 위치

        // #:3 , .:0, R:1, B:2, O:4
        int[][] data ={
                {3,3,3,3,3},
                {3,0,0,2,3},
                {3,0,3,0,3},
                {3,1,4,0,3},
                {3,3,3,3,3}
        };

        for(int i = 0;i<rowCnt;i++){
            for(int j = 0 ; j< colCnt;j++){
                System.out.printf("%d",data[i][j]);
            }
            System.out.println("");
        }

        int rr ,rc ;
        int br, bc;
        int depth =10;
        //위
        //빨강
        rr = rrow -1;
        rc = rcol;
        if (data[rr][rc] == 0 || data[rr][rc] == 4 ) {
            fnDFS(1,depth + 1, rr,rc,data,rrow,rcol,trow,tcol,rowCnt,colCnt);
        }
        //파랑


        //이동방향 (위,아래,좌,우)
        //  전달값(이전이동 지 위 1아래 2, 좌3 우 4)
        //      현재값 저장
        //      구슬위치
        //  빨강 못움직이때까지 이동  //구멍들어가는지확인
        //  파랑 못움직일때까지 이동  //구멀들어가는지확인
        //  이동 deapth 10이상이면 실패
        //  파랑 들어가면 실패
        //  빨강만 들어가면 성공
        //  이동후 빨강파랑 위치 확인 좌표 확정
        //  재귀호출 이동방향(전이동방향이 좌우 -> 위아래 , 위아래->좌우)
        //      빨강이동
        //      파랑이동
        //      이동후 빨강파랑 위치 확인 좌표 확정

    }

    private static void fnDFS(int mtype, int depth, int row, int col, int[][] data, int prow, int pcol, int trow, int tcol,int rowCnt,int conCnt) {
        if (mtype == 1){//위
            for (int i=row; i > 0;i--){

            }

            //좌

            //우

        }else if (mtype ==2){//아래
            //좌


            //우
        }else if (mtype ==3){//좌
            //위


            //아래
        }
        else if (mtype ==4){//우
            //위


            //아래
        }


    }


}
