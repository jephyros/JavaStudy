package com.company.backjoon.a2001;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-02
 * Remark : https://www.acmicpc.net/problem/10818  최대 최소
 */
public class J001_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i=0;i<n;i++){
            data[i] = scanner.nextInt();
        }
        Arrays.sort(data);
        System.out.printf("%d %d",data[0],data[n-1]);



    }
}
