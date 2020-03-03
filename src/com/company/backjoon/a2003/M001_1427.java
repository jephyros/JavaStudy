package com.company.backjoon.a2003;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-03-03
 * Remark : https://www.acmicpc.net/problem/1427
 *
 */
public class M001_1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = String.valueOf(n);
        int m = str.length();
        int[] arr = new int[m];

        for(int i = 0;i < m ; i++){


            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        Arrays.sort(arr);

        for (int i = m-1 ; i>=0; i--) {
            System.out.printf("%d",arr[i]);
        }


    }
}
