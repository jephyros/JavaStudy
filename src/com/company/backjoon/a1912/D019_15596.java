package com.company.backjoon.a1912;

/**
 * @author InSeok
 * Date : 2019/12/21
 * Remark : https://www.acmicpc.net/problem/15596
 */
public class D019_15596 {
    long sum(int[] a){
        long result = 0 ;

        for(int i : a){
            result += i;
        }

        return result;

    }

}
