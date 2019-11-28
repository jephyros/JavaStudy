package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-11-27
 * Remark : https://www.acmicpc.net/problem/4246  To and Fro
 */
public class S013_4246 {
    public static void main(String[] args) throws Exception{

        //ArrayList<String> arr = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        boolean loopchk = true;
        while(loopchk) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            if (n == 0){
                loopchk=false;
                break;
            }
            StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
            String str = st2.nextToken();
            //arr.add(s);
            fn(n,str);

        }


    }
    public static void fn(int n,String str){
        ArrayList<String> data = new ArrayList<>();
        for (int i=0;i < str.length()/n;i++) {
            String tmp = "";
            if (i%2 ==0){
                tmp = str.substring(i*n,i*n+n);
            }else{
                tmp = (new StringBuffer(str.substring(i*n,i*n+n))).reverse().toString();
            }
            data.add(tmp);
        }

        String resultStr="";
        for(int i =0;i<n;i++) {
            for (int j = 0; j < data.size(); j++) {
                resultStr = resultStr + data.get(j).charAt(i);
            }
        }
        System.out.println(resultStr);
    }

}
