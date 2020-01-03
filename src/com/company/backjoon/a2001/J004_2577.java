package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020/01/03
 * Remark : https://www.acmicpc.net/problem/2577
 */
public class J004_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();

        String str = String.valueOf(i1*i2*i3);
        //System.out.println(str);
        int[] result = new int[10];
        for(int i=0;i<str.length();i++){
            int k = Integer.parseInt(str.substring(i, i + 1));
            result[k] += 1;

        }
        for(int i=0;i<10;i++){
            System.out.println(result[i]);
        }


    }
}
