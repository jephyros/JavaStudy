package com.company.backjoon.a1912;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2019-12-27
 * Remark : https://www.acmicpc.net/problem/11399 ATM
 */

public class D026_11399 {
    public static void main(String[] args) {
        //int n = 5;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];

        for(int i =0;i<n;i++){
            data[i] = scanner.nextInt();
        }


        Arrays.sort(data);

        int resultcnt = 0;
        for(int i=0;i<n;i++){
            for(int j = 0 ; j< i+1;j++){
                resultcnt += data[j];
            }
        }
        System.out.println(resultcnt);
    }

}
