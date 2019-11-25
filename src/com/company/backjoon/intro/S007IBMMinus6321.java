package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-11-25
 * Remark :
 */
public class S007IBMMinus6321 {
    public static void main(String[] args) throws Exception {


        ArrayList<String> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st1.nextToken());

        for (int i = 0 ; i< num; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            String s = st2.nextToken();
            data.add(s);

        }
        int index = 0;
        for (String s :data) {

            printString(s,++index);
        }



    }

    public static void printString(String str,int index){
        //A:65 Z:90
        String result = "";
        for(int i =0;i< str.length();i++){
            if ( str.charAt(i) < 90) {
                char tmpchar = (char) (str.charAt(i) + 1);
                result = result + Character.toString(tmpchar);
            }else{
                result = result + Character.toString('A');
            }

        }
        System.out.println("String #" + index);
        System.out.println(result);
        System.out.println("");
    }
}
