package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-08
 * Remark : https://www.acmicpc.net/problem/2839
 */
public class J014_2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int small = 3;
        int big = 5;

        int result =-1;
        if(n < small){
            result = -1;
        }else {
            int bigcnt = n / big;
            while(bigcnt >=0){
                int tmpcnt = n - (big * bigcnt);
                if(tmpcnt % small == 0 ){
                    result = bigcnt + tmpcnt / small;
                    break;
                }
                bigcnt = bigcnt -1;
            }

        }

        System.out.println(result);


    }
}
