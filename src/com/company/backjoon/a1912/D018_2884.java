package com.company.backjoon.a1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019/12/21
 * Remark : https://www.acmicpc.net/problem/2884
 */
public class D018_2884 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int i1 = Integer.parseInt(st.nextToken());
        int i2 = Integer.parseInt(st.nextToken());

        if (i2 < 45){
            i2 = 60 -(45 -i2);
            if(i1 ==0) {
                i1 = 23;
            }else{
                i1 = i1 - 1;
            }
        }else{
            i2 = i2 - 45;
        }

        System.out.printf("%d %d",i1,i2);

    }
}
