package com.company.backjoon.a2001;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020/01/30
 * Remark : https://www.acmicpc.net/problem/2750
 */
public class J035_2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0;i<n;i++){
            data[i] = scanner.nextInt();
        }

        Arrays.sort(data);
        for(int i:data){
            System.out.println(i);
        }
    }
}
