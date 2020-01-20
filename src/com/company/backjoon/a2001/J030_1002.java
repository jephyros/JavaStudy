package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-20
 * Remark : https://www.acmicpc.net/problem/1002
 */
public class J030_1002 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n = scanner.nextInt();
        for(int i =0;i<n;i++){
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

            if (x1 == x2 && y1 == y2 && r1 == r2)
                System.out.println(-1);
            else if (d > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 ||  d < Math.abs(r1-r2))
                System.out.println(0);
            else if (d == r1 + r2 || Math.abs(r1-r2) == d)
                System.out.println(1);
            else
                System.out.println(2);

        }
    }
}
