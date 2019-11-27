package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-11-27
 * Remark : https://www.acmicpc.net/problem/3474 교수가된현우
 */
public class S011_3474 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[x];
        for (int i = 0 ; i < x ; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            arr[i] = Integer.parseInt(st2.nextToken());
            System.out.println(fn(arr[i]));
        }

//        for (int i:arr) {
//            System.out.println(fn(i));
//
//        }

    }

    private static int fn(int n){
        int resultint1 = 0;
        for (int i = 5; i<= n ; i = i * 5  ){
            resultint1 =  resultint1 + n / i;
        }
        int resultint2 = 0;
        for (int i = 2; i<= n ; i = i * 2  ){
            resultint2 =  resultint2 + n / i;
        }

        return Math.min(resultint1,resultint2);


    }


}
