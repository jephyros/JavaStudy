package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-20
 * Remark :https://www.acmicpc.net/problem/3009
 */
public class J027_3009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        int x4; int y4;
        if (x1 == x2){
            x4= x3;
        }else if(x2 == x3){
            x4= x1;
        }else {
            x4 = x2;
        }
        if (y1 == y2){
            y4= y3;
        }else if(y2 == y3){
            y4= y1;
        }else {
            y4 = y2;
        }
        System.out.printf("%d %d",x4,y4);

    }
}
