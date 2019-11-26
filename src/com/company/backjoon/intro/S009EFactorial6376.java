package com.company.backjoon.intro;

/**
 * @author InSeok
 * Date : 2019-11-26
 * Remark : https://www.acmicpc.net/problem/6376  E계산
 */
public class S009EFactorial6376 {
    public static void main(String[] args) {


        System.out.println("n e");
        System.out.println("- -----------");


        for (int i = 0 ; i< 10;i++) {

            double result = 0;
            for (int j = 0; j <= i; j++) {
                result = result + (1.0 / factorial(j));
            }
            if (i < 2) {
                System.out.printf(i + " %.0f", result);
            } else if (i < 3) {
                System.out.printf(i + " %.1f", result);
            } else{
                System.out.printf(i + " %.9f", result);
            }
            System.out.println("");



        }
    }

    private static int factorial(int i){
        if (i==0) {
            return 1;
        }else{
            return factorial(i -1) * i;
        }

    }
}
