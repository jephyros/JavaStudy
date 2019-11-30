package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019/11/30
 * Remark : https://www.acmicpc.net/problem/9557
 */
public class S017_9557 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0;i<num;i++){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            fn(n,str);


        }


    }

    private static void fn(int n ,String str) {
        String resultStr="";
        String[] arr = new String[n];
        int checkEng = -1;

        StringTokenizer st = new StringTokenizer(str," ");
        for (int i=0;i< n;i++){
            arr[i] = st.nextToken();
            //English lower case 확인 97(a) - 122(z)
            if (arr[i].charAt(0) >= 97 && arr[i].charAt(0) <= 122){
                checkEng = i;
            }
        }
        if (checkEng != -1){
//            for(int i = n-1;i >= checkEng;i--){
//                resultStr = resultStr + arr[i] + " ";
//            }
            for(int i = checkEng+1;i < n;i++){
                resultStr = resultStr + arr[i] + " ";
            }
            resultStr = resultStr + arr[checkEng] + " ";
            for(int i = 0 ; i< checkEng ; i ++){
                resultStr = resultStr + arr[i] + " ";
            }
        }else{
            resultStr = str;
        }
        System.out.println(resultStr);

    }
}
