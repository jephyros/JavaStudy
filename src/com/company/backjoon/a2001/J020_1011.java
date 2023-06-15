package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-13
 * Remark : https://www.acmicpc.net/problem/1011
 */
public class J020_1011 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[][] data =new long[n][2];
        for (int k = 0 ;k<n;k++){

            data[k][0] = scanner.nextInt();
            data[k][1] = scanner.nextInt();


        }

        for(int k = 0;k<n; k++) {
            long x = data[k][0];
            long y = data[k][1];
            long i = 0;
            while(true){
                i++;
                if(i*i > (y-x)){

                    break;
                }
            }
            long resultcnt = 0;

            //제곱수와 차이가 동일할경우
            if((i-1)*(i-1) == (y-x)) {
                resultcnt = (i - 1) * 2 - 1;
            }else if(((i*i) - (y-x) < i )) {
                resultcnt = i  * 2 - 1;
            }else{
                resultcnt = i * 2 - 2;
            }
            System.out.println(resultcnt);
        }




    }
}
