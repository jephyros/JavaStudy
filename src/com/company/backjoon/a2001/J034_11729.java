package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-30
 * Remark : https://www.acmicpc.net/problem/11729
 */
public class J034_11729 {
    public static StringBuilder sb = new StringBuilder();
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        hanoi(1, 3, 2, count);
        System.out.println(cnt);
        System.out.println(sb.toString());
    }

    public static void hanoi(int from, int to, int center, int count) {
        cnt++;
        if (count == 0) return;
        else if (count == 1) {
            sb.append(from + " " + to);
            sb.append(System.lineSeparator());
        } else {
            hanoi(from, center, to, count - 1);
            sb.append(from + " " + to);
            sb.append(System.lineSeparator());
            hanoi(center, to, from, count - 1);
        }
    }

}
