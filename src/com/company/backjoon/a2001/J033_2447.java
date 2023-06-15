package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-23
 * Remark : https://www.acmicpc.net/problem/2447
 */
public class J033_2447 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] data = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                data[i][j] =' ';
            }
        }

        fnMakeStar(n,0,0,data);
        for(int i=0;i<n;i++){

            System.out.println(data[i]);
        }

    }

    private static void fnMakeStar( int n,int x, int y,char[][] data) {
        if(n==1){
            data[x][y]= '*';
            return;
        }
        int div = n / 3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1 && j ==1){
                    continue;
                }
                fnMakeStar(div,x + div*i,y + div* j,data);


            }
        }
    }


}
