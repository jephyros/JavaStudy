package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-09
 * Remark : https://www.acmicpc.net/problem/2292
 */
public class J015_2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 0;
        int precnt = 1;
        while(true){
            if(precnt+(6 * i)   >=n)  {
                System.out.println(i+1);
                break;
            }
            precnt += (6 * i);
            i++;

        }





    }
}
