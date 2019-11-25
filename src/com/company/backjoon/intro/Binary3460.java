package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019/11/23
 * Remark : https://www.acmicpc.net/problem/3460
 */
public class Binary3460 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력 첫번째
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int i1 = Integer.parseInt(st.nextToken());

        //두번째입력
        for (int i=0;i<i1; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int i2 = Integer.parseInt(st2.nextToken());
            String s1 = convertBase(i2, 2);
            //System.out.println(s1);

            int loc = 0;
            String resultStr = "";
            for(int j = s1.length()-1; j >= 0; j--){

                if (s1.charAt(j) == '1'){
                    resultStr = resultStr + Integer.toString(loc) + " ";
                }

                loc++;
            }
            System.out.println(resultStr);
        }






    }
    //자연수 n 을 base 진수로 변환하는 재귀함수
    private static String convertBase(int n, int base){
        char[] t= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        int v = n / base;
        int r = n % base;

        if ( v== 0){
            return  Character.toString(t[r]);
        }else{
            return convertBase(v,base) + t[r];
        }

    }
}
