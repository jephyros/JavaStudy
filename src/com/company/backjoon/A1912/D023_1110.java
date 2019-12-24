package com.company.backjoon.A1912;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2019/12/25
 * Remark : https://www.acmicpc.net/problem/1110
 */
public class D023_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        int nextint = n;
        while(true){
            cnt += 1;

            String str="";

            if(nextint < 10){

                String s1 = String.valueOf(nextint);
                String s3 = String.valueOf(nextint);

                nextint =  Integer.parseInt(s1+s3);

            }else{
                str = String.valueOf(nextint);
                int i1 = Integer.parseInt(str.substring(0, 1));
                int i2 = Integer.parseInt(str.substring(1, 2));
                int i3 = i1+i2;

                String s1 = String.valueOf(i2);
                String s2 = String.valueOf(i3);
                String s3 = s2.substring(s2.length() - 1, s2.length());
                nextint =  Integer.parseInt(s1+s3);
            }

            if(n == nextint) break;


        }

        System.out.println(cnt);


    }
}
