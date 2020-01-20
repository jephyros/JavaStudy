package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-20
 * Remark : https://www.acmicpc.net/problem/3053
 */
public class J029_3053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("%.6f\n",Math.PI*n*n);
        System.out.printf("%.6f",2.0*n*n);
    }
}
