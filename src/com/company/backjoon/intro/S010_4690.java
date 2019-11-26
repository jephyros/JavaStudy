package com.company.backjoon.intro;

/**
 * @author InSeok
 * Date : 2019-11-26
 * Remark : https://www.acmicpc.net/problem/4690 완전세제곱
 */
public class S010_4690 {
    public static void main(String[] args) {

        for (int i = 2 ; i< 101; i++){
            for(int j = 2 ; j< 101 ;j++){
                for(int k = j + 1; k < 101; k++){
                    for(int l = k + 1; l<101 ;l++){
                        if(fn(i) == fn(j) + fn(k) + fn(l)){
                            System.out.printf("Cube = %d, Triple = (%d,%d,%d)\n",i,j,k,l);
                        }
                    }
                }
            }
        }
    }
    private static int fn(int x){
        return  x * x * x;
    }

}
