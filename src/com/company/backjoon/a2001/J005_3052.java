package com.company.backjoon.a2001;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author InSeok
 * Date : 2020/01/03
 * Remark : https://www.acmicpc.net/problem/3052
 */
public class J005_3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[42];

        for(int i =0;i<10 ; i++){
            result[scanner.nextInt()%42] += 1;
        }

        IntStream intStream = Arrays.stream(result).filter(value -> value > 0);
        long count = intStream.count();
        System.out.println(count);


    }
}
