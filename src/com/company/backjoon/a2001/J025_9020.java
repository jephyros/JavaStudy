package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-17
 * Remark : https://www.acmicpc.net/problem/9020
 */
public class J025_9020 {
    public static void main(String[] args) {
        //에라토스테네스의 체를 사용해 소수 먼저구해놓기
        int max = 10000+1;
        int[] data = new int[max];
        data[1] =1;
        for(int i = 2;i<max;i++){
            for(int k = i*2;k<max;k+=i){
                data[k]=1;
            }
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int k=0;k<n;k++ ){
            int i = scanner.nextInt();
            int h = i/2;
            loop1:
            for(int a =h;a>0;a--){
                if(data[a]==0){
                    for(int b =h;b<=i;b++){
                        if(data[b]==0){
                            if(a+b == i) {
                                System.out.printf("%d %d \n",a,b);

                                break loop1;
                            }
                        }
                    }
                }
            }

        }


    }
}
