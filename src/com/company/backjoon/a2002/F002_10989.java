package com.company.backjoon.a2002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-02-07
 * Remark : https://www.acmicpc.net/problem/10989
 */
public class F002_10989 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n];

        int maxnumber=0;
        for (int i =0;i<n;i++){
            data[i] = Integer.parseInt(br.readLine());
            if (data[i] > maxnumber){
                maxnumber = data[i];
            }
        }

        int[] result = fnCountingSort(data,maxnumber);

        StringBuilder builder = new StringBuilder();

        for(int i: result){
            builder.append(i).append("\n");
        }
        System.out.println(builder);

    }

    private static int[] fnCountingSort(int[] data, int maxnumber) {
        int length = data.length;
        int[] tmpdata = new int[maxnumber+1];
        int[] returndata = new int[length];

        for(int v:data){
            tmpdata[v] +=1;
        }

        for(int i =1;i<tmpdata.length;i++){
            tmpdata[i] += tmpdata[i-1];
        }
        for(int i= length-1;i >=0 ; i--){
            int num = data[i];
            returndata[tmpdata[num]-1] = num;
            tmpdata[num] -=1;
        }


        return returndata;
    }
}
