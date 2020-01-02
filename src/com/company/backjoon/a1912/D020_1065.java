package com.company.backjoon.a1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author InSeok
 * Date : 2019-12-23
 * Remark : https://www.acmicpc.net/problem/1065  한수
 */
public class D020_1065 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt= 0;
        for(int i =1 ;i<=n;i++){
            if(fnChkeck(i)){
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }

    private static boolean fnChkeck(int num) {
        String str = String.valueOf(num);
        if (str.length() < 3){
            return true;
        }else{
            int preint = -1;
            int diffint = -1;
            for(int i=0;i<str.length();i++){

                int k = Integer.parseInt(str.substring(i,i+1));
                if(preint > -1){
                    if(i==1){
                        diffint = k - preint;
                    }else{
                        if(k - preint != diffint){
                            return false;
                        }
                    }

                }
                preint = k;
            }
            return true;
        }

    }
}
