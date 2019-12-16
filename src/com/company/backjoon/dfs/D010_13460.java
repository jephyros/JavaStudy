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
    }
}
