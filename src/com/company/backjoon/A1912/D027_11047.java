package com.company.backjoon.A1912;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2019-12-27
 * Remark :https://www.acmicpc.net/problem/11047 동전0
 */

public class D027_11047 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();

        int[] data = new int[n];
        for(int i =0;i<n;i++){
            data[i] = scanner.nextInt();
        }
        int cnt = 0;
        int balance = t;
        for(int i = n-1;i>=0;i-- ){
            if (balance ==0) break;

            if(data[i]<=balance){
                int c = balance / data[i];
                cnt += c;
                balance -= data[i]* c;

            }
        }
        System.out.println(cnt);
    }
}
