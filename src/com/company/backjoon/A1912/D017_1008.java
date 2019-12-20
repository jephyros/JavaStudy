package com.company.backjoon.A1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-20
 * Remark : https://www.acmicpc.net/problem/1008
 */
public class D017_1008 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Double i1 = Double.parseDouble(st.nextToken());
        Double i2 = Double.parseDouble(st.nextToken());



        System.out.println(i1/i2);
    }
}
