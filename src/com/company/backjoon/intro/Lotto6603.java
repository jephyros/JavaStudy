package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-11-22
 * Remark : https://www.acmicpc.net/problem/6603
 */
public class Lotto6603 {

    public static void main(String[] args) throws Exception {

        int n;
        int[] data;
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        boolean loopchk = true;
        while(loopchk){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            n = Integer.parseInt(st.nextToken());
            if(n==0){
                loopchk=false;
                break;
            }
            data = new int[n];
            for (int i = 0 ; i< n ;i ++){
                data[i] = Integer.parseInt(st.nextToken());
            }
            //dfs호출
            int depthindex = 0;
            String resultStr ="";    // 결과값을 출력하기위함 변수
            for (int i =0 ; i < data.length-5;i++) {
                resultStr ="";
                depthFirstSearch(data, i, 6, depthindex, resultStr);
            }
            //
            System.out.println("");


        }

    }
    private static void  depthFirstSearch(int[] array,int searchindex,int targetnum,int depthindex ,String resultStr){

        String localResulsStr = resultStr;// 백트랙시 이전결과값 돌려주기위한함수

        resultStr = resultStr + array[searchindex] + " ";
        depthindex = depthindex + 1;

        if (depthindex == targetnum) {
            //6개를 다채우면 값을 출력한다.

            System.out.println(resultStr);
        }else{
            for( int i = searchindex+1; i < array.length; i++) {
                depthFirstSearch(array, i, targetnum, depthindex, resultStr);
            }

        }
        //백트랙을위핸 depthindex -1 하고 결과값도 이전 결과값으로바꾼다.
        depthindex = depthindex -1;
        resultStr = localResulsStr;


    }
}
