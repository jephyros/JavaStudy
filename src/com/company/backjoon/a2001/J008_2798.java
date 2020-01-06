package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-06
 * Remark : https://www.acmicpc.net/problem/2798
 */
public class J008_2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0 ;i< n ;i++){
            data[i] = scanner.nextInt();
        }
        int result = 0;
        for(int i = 0 ;i< n ;i++){
            for(int j = i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    int tmp = data[i] + data[j] + data[k];
                    if (tmp <=m && result < tmp){
                        result = tmp;
                    }
                }
            }
        }
        System.out.println(result);



    }
}
