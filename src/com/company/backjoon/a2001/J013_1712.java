package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-08
 * Remark : https://www.acmicpc.net/problem/1712
 */
public class J013_1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();

        if(i2>=i3 ){
            System.out.println(-1);
        }else{

            int result = i1/(i3-i2) + 1;
            System.out.println(result);
        }


    }
}
