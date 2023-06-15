package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-10
 * Remark : https://www.acmicpc.net/problem/1193
 */
public class J016_1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //1씩증가하는 등비수열에서 몇번째 그룹인지 확인
        int i =0;
        int sum = 0;
        while(true){
            i++;
            sum += i;
            if(sum >=n){
                sum -= i;
                break;
            }

        }

        //홀수 이면

        if(i % 2 == 1 ){
            System.out.printf("%d/%d",i - (n-sum)+1,(n-sum));
        }else{ //짝수이면
            System.out.printf("%d/%d",(n-sum),i - (n-sum -1));
        }

    }
}
