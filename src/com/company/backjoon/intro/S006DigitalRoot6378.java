package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-11-25
 * Remark :https://www.acmicpc.net/problem/6378
 */
public class S006DigitalRoot6378 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> data = new ArrayList<>();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        boolean checkloop = true;
        while(checkloop){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String s = st.nextToken();
            if (s.equals("0")) {
                checkloop=false;
                break;

            }else{
                data.add(s);
            }
        }
        for (String s :data) {
            if (!s.equals("0")){
                System.out.println(getStringSum(s));
            }

        }



    }
    private static String getStringSum(String str){
        if (str.length() == 1){
            return str;
        }else{
            int resultInt =0;
            for(int i =0;i < str.length();i++){
                resultInt = resultInt + Character.getNumericValue(str.charAt((i)));
            }
            String resultStr = Integer.toString(resultInt);
            if (resultStr.length() ==1) {
                return resultStr;
            }else{
                return getStringSum(resultStr);
            }

        }


    }

}
