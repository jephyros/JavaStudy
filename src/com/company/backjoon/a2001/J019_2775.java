package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020/01/12
 * Remark : https://www.acmicpc.net/problem/2775
 */
public class J019_2775 {
    public static void main(String[] args) {
        int[][] data = new int[15][15];
        //0층
        for (int i =0;i<15;i++){
            data[0][i] = i;
        }
        //1층부터 14층까지
        for(int i = 1; i< 15;i++){
            for(int j = 0 ; j<15;j++){
                int tmp =0;
                for(int k = 1;k<j;k++){
                    tmp += data[i-1][k];
                }
                data[i][j] = data[i-1][j] + tmp;
            }
        }
//        for(int i = 0 ; i < 15;i++){
//            for(int j = 0 ;j < 15;j++){
//                System.out.printf("%d ",data[i][j]);
//            }
//            System.out.println("");
//        }
        //System.out.println(data[2][3+1]);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0 ;i<n;i++){
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            System.out.println(data[i1][i2]);
        }


    }
}
