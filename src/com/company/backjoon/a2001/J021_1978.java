package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-14
 * Remark : https://www.acmicpc.net/problem/1978
 */
public class J021_1978 {
    public static void main(String[] args) {
        int max = 1001;
        int[] data = new int[1001];
        //1001 개의 자연수에대해 에라토스테네스의 체 를 활용하여 소수여부 를 구한다.
        //1은 소수가 아니기때문에 1로 업데이트
        data[1]=1;

        for(int i =2;i<max;i++){
            if(data[i] == 0){
                for(int k = i*i ;k<max;k+=i){
                    data[k]=1;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0 ;
        for(int i =0;i<n;i++){

            int i1 = scanner.nextInt();
            if(data[i1]==0){
                count ++;
            }

        }
        System.out.println(count);


    }
}
