package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-02
 * Remark : https://www.acmicpc.net/problem/6318  Box of Bricks
 */
public class S018_6318 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean chkloop = true;
        int index = 0;
        while(chkloop){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                chkloop=false;
                break;
            }
            index += 1;
            String str = br.readLine();
            fn(index,n,str);
        }


    }

    private static void fn(int index,int n, String str) {
        StringTokenizer st = new StringTokenizer(str," ");
        int[] arr = new int[n];
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i < n ;i++){
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            arr[i] = num;
        }

        int avgheight = sum/n;


        for(int i : arr){
            if (i>avgheight) {
                cnt += i-avgheight;
            }
        }
        System.out.printf("Set #%d\n",index);
        System.out.printf("The minimum number of moves is %d.\n\n",cnt);


    }

}
