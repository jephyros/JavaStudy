package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-21
 * Remark : https://www.acmicpc.net/problem/10872
 */
public class J031_10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fnFactorial(n));
    }

    private static int fnFactorial(int n) {
        if (n==0) {
            return 1;
        }else{
            return n * fnFactorial(n-1);
        }
    }
}
