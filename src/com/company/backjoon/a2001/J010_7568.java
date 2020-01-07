package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-07
 * Remark : https://www.acmicpc.net/problem/7568
 */
public class J010_7568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] data = new int[n][2];
        int[] rank = new int[n];
        for(int i = 0 ; i < n ; i++){
            data[i][0] =scanner.nextInt();
            data[i][1] =scanner.nextInt();
        }

        for(int i = 0;i<n ;i++){
            for(int j = 0;j<n;j++){
                if(i != j){
                    if(data[i][0] <data[j][0] && data[i][1] <data[j][1]) {
                        rank[i] += 1;
                    }
                }
            }
        }
        for(int i = 0;i<n ;i++) {
            System.out.printf("%d ",rank[i] + 1);
        }


    }
}
