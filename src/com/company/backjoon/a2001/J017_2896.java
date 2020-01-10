package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-10
 * Remark : https://www.acmicpc.net/problem/2869
 */
public class J017_2896 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();
        //올림처리
        //int result = ((((v-b)* 100) / (a-b))   + 99) / 100 ;
        int result = (v-b) /(a-b);
        if ((v-b) %(a-b) != 0){
            result += 1;
        }
        //2 1 5 -> 4
        //3 2 5 -> 3
        //4 2 5 -> 2
        //11 3  13 -> 2
        //4 3 5 -> 2
        //4 1 8 -> 3
        System.out.println(result);

    }
}
