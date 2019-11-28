package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author InSeok
 * Date : 2019-11-28
 * Remark : https://www.acmicpc.net/problem/9971 The Hardest Problem Ever
 */
public class S014_9971 {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();

        boolean chkLoop = true;
        while(chkLoop){
            String s = br.readLine();
            if (s.equals("ENDOFINPUT")){
                chkLoop=false;
                break;
            }else{
                if (!s.equals("START") && !s.equals("END")) {
                    arr.add(s);
                }

            }
        }
        for (String s:arr) {
            fn(s);

        }




    }
    public static void fn(String str){

        String resultStr = "";
        for(int i=0;i<str.length();i++){
            System.out.printf("%s",convertChar(str.charAt(i)));

        }
        System.out.println("");

    }
    public static char convertChar(char c){
        //A : 65 Z :90
        //65 -> 85
        //70 -> 65
        int tc = c;
        //A -> Z까지 만 변환 나머지는 그대로반환
        if (tc >= 65 && tc<=90){
            if(tc<70){
                return (char) (tc+21);
            }else{
                return (char) (tc-5);
            }

        }else{
            return c;
        }



    }
}
