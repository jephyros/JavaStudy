package com.company.backjoon.a1912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author InSeok
 * Date : 2019-12-28
 * Remark : https://www.acmicpc.net/problem/1541 잃어버린 괄호
 */
public class D029_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split("\\-");

        int result =0;
        int index =0;
        for(String v:data){
            if (index==0) {
                result += sum(v);
            }else{
                result -= sum(v);
            }

            index +=1;

        }
        System.out.println(result);

    }
    public static int  sum(String str){
        String[] sumdata = str.split("\\+");
        int result = 0;
        for(String v: sumdata){
           result += Integer.parseInt(v);
        }
        return result;


    }
}
