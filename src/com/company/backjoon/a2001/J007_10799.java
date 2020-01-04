package com.company.backjoon.a2001;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author InSeok
 * Date : 2020/01/04
 * Remark : https://www.acmicpc.net/problem/10799
 */
public class J007_10799 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(fnCnt(s));



    }
    public static int fnCnt(String s) {
        //스택을 사용하여 ( push , ) pop 하고 () 연속의경우체크하면됨
        //하지만 스택사용하지않고도 아래처럼 ( 갯수를 가지고 해결할수있다.

        int answer =0;
        // ( 괄호갯수
        int bcnt = 0;
        //이전 값
        String prev ="";
        for(int i = 0;i<s.length();i++){
            if(i==0){
                if(s.substring(i,i+1).equals("(")) bcnt += 1;
                prev = s.substring(i,i+1);
            }else {
                if (s.substring(i, i + 1).equals("(")) {
                    bcnt += 1;
                }

                if (s.substring(i, i + 1).equals(")") && prev.equals("(")) {
                    bcnt -= 1;
                    answer += bcnt;
                }
                if (s.substring(i, i + 1).equals(")") && prev.equals(")")) {
                    bcnt-= 1;
                    answer += 1;
                }
                prev = s.substring(i,i+1);
            }
        }

        return answer;

    }
}
