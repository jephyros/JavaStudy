package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-20
 * Remark : https://www.acmicpc.net/problem/1085
 */
public class J026_1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int minx = Math.min(x,w-x);
        int miny = Math.min(y,h-y);
        System.out.println(Math.min(minx,miny));


    }
}
