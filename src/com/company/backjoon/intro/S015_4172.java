package com.company.backjoon.intro;

/**
 * @author InSeok
 * Date : 2019-11-29
 * Remark : https://www.acmicpc.net/problem/4172   sqrt log sin
 */
public class S015_4172 {

    public static void main(String[] args) {
        System.out.println(X(100));

    }
    private static int X (int i){

        if (i==0) return 0;
        int result = X((int) (i - Math.sqrt((double) i))) + X((int) Math.log((double) i)) + X((int) (i * Math.sin((double)i) * Math.sin((double)i)));
        return result % 1000000;


    }

}
