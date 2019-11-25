package com.company.backjoon.intro;

import java.util.ArrayList;
import java.util.List;

/**
 * @author InSeok
 * Date : 2019-11-21
 * Remark : https://www.acmicpc.net/problem/4673
 */
public class Selfnumber {

    public static void main(String[] args) {
        //최대수치
        int targetNumber = 10000;

        int[] result = new int[targetNumber+1] ;

        //초기화
        for ( int i = 0 ; i< result.length;i++){
            result[i] = 0;
        }
        //self number 가 아닌 값 찾기

        for(int i = 1 ; i < targetNumber ; i++ ){
            int f1 = i / 1000;
            int f2 = (i - f1 * 1000) / 100;
            int f3 = (i - (f1 * 1000) - (f2 * 100)) / 10;
            int f4 = i - (f1 * 1000) - (f2 * 100) - (f3 *10);

            int notself = i+f1+f2+f3+f4;
            if (notself < targetNumber) {
                result[i + f1 + f2 + f3 + f4] = 1;
            }

        }
        //selfnumber 출력하기
        for (int i = 1 ; i< targetNumber ; i++) {
            if (result[i] == 0) {
                System.out.println(i);
            }
        }

    }

}
