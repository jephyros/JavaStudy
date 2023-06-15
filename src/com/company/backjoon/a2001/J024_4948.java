package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-17
 * Remark : https://www.acmicpc.net/problem/4948
 */
public class J024_4948 {
    public static void main(String[] args) {

        //에라토스테네스의 체를 사용해 소수 먼저구해놓기
        int max = 123456*2+1;
        int[] data = new int[max];
        data[1] =1;
        for(int i = 2;i<max;i++){
            for(int k = i*2;k<max;k+=i){
                data[k]=1;
            }
        }

        Scanner scanner = new Scanner(System.in);
        while(true) {
            int n = scanner.nextInt();
            if(n ==0) break;

            int cnt = 0;
            for(int i=n+1;i<=2*n;i++){
                if(data[i] == 0){
                    cnt = cnt + 1;
                }
            }
            System.out.println(cnt);


        }






    }
}
