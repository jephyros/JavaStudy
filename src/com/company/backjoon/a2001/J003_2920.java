package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-02
 * Remark : https://www.acmicpc.net/problem/2920
 */
public class J003_2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int preint = 0;
        int curint = 0;
        String resultvalue="";
        for(int i =0 ;i<8;i++){
            if ( i ==0){
                preint = scanner.nextInt();
            }else if(i==1){
                curint = scanner.nextInt();
                if (curint-preint == 1){
                    resultvalue ="ascending";
                }else if (curint-preint == -1){
                    resultvalue ="descending";
                }else{
                    resultvalue ="mixed";
                }
                preint = curint;
            }else{
                curint = scanner.nextInt();
                if (curint-preint == 1 && resultvalue.equals("ascending")){
                    resultvalue ="ascending";
                }else if (curint-preint == -1 && resultvalue.equals("descending")){
                    resultvalue ="descending";
                }else{
                    resultvalue ="mixed";
                }

                preint = curint;
            }

        }

        System.out.println(resultvalue);
    }
}
