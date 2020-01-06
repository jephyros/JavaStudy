package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-06
 * Remark : https://www.acmicpc.net/problem/2231
 */
public class J009_2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int resultnum = 0;
        for(int i = 1;i<=n;i++){
            String str = String.valueOf(i);
            int calnum = i;
            for(int j=0;j<str.length();j++){
                calnum += Integer.parseInt(str.substring(j, j + 1));
            }
            if(calnum == n){
                resultnum = i;
                break;
            }

        }
        System.out.println(resultnum);
    }
}
