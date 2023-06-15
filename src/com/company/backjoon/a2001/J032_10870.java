package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-22
 * Remark : https://www.acmicpc.net/problem/10870
 */
public class J032_10870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fnFibonacci(0,0,0,n);
    }

    private static int fnFibonacci(int cnt,int pren1,int pren2,int n) {

        if(cnt==n){
            System.out.println(pren1+pren2);
        }else{
            if(cnt == 0 || cnt == 1){
                fnFibonacci(cnt+1,0,1,n);
            }else{
                fnFibonacci(cnt+1,pren2,pren1+pren2,n);
            }
        }

        return 0;


    }
}
