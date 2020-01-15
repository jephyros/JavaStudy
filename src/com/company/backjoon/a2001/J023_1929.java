package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-15
 * Remark : https://www.acmicpc.net/problem/1929
 */
public class J023_1929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();


        int max = i2+1;
        int[] data = new int[max];
        data[1] =1;
        for(int i = 2;i<max;i++){
            for(int k = i*2;k<max;k+=i){
                data[k]=1;
            }
        }
        int min = -1;
        int sum = 0;
        for(int i = i1;i<=i2;i++){
            if(data[i]==0){
                System.out.println(i);
            }
        }




    }
}
