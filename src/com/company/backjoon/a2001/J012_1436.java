package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-07
 * Remark : https://www.acmicpc.net/problem/1436
 */
public class J012_1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        int i=665;
        while(true){
            i++;
            if(String.valueOf(i).contains("666")){
                    count ++;

            }
            if(count == n ){
                System.out.println(i);
                break;
            }
        }



    }
}
