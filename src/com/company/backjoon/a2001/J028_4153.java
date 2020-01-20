package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-20
 * Remark : https://www.acmicpc.net/problem/4153
 */
public class J028_4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            int i3 = scanner.nextInt();
            if(i1==0 && i2==0 && i3 ==0) break;

            if((i1*i1 + i2*i2 == i3*i3)
               || (i3*i3 + i2*i2 == i1*i1)
                || (i1*i1 + i3*i3 == i2*i2)
            ){
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }

    }
}
