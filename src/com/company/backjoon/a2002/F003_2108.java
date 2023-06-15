package com.company.backjoon.a2002;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author InSeok
 * Date : 2020-02-27
 * Remark : https://www.acmicpc.net/problem/2108
 */
public class F003_2108 {
    public static int MAX2CNT =0;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] data = new int[n];

        int maxnumber=0;
        int sum = 0;
        for (int i =0;i<n;i++){
            data[i] = Integer.parseInt(br.readLine()) + 4000;
            sum += data[i] - 4000;
            if (data[i] > maxnumber){
                maxnumber = data[i];
            }
        }

        int[] result = fnCountingSort(data,maxnumber);


        for (int i:result) {
            System.out.printf("%d ",i-4000);
        }
        System.out.println("==================");

        //산술평균 : N개의 수들의 합을 N으로 나눈 값
        System.out.println(Math.round((float)sum / (float)n));

        //중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        System.out.println(result[n/2] - 4000);
        //최빈값 : N개의 수들 중 가장 많이 나타나는 값
        System.out.println(MAX2CNT -4000);

//        범위 : N개의 수들 중 최댓값과 최솟값의 차이
        System.out.println(result[n-1] - result[0]);

    }


    //카운팅정렬
    private static int[] fnCountingSort(int[] data, int maxnumber) {
        int length = data.length;
        int[] tmpdata = new int[maxnumber+1];
        int[] returndata = new int[length];

        for(int v:data){
            tmpdata[v] +=1;
        }
        int maxcnt =0;
        for(int i =1;i<tmpdata.length;i++){
            if (tmpdata[i] > maxcnt){
                maxcnt = tmpdata[i];
            }
        }
        int chkcnt = 0;
        for(int i =1;i<tmpdata.length;i++){
            int x = tmpdata[i];
            if(tmpdata[i] == maxcnt){
                chkcnt += 1;
                MAX2CNT = i;
                if (chkcnt==2){
                    MAX2CNT = i;
                    break;
                }
            }
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
