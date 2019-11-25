package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019/11/23
 * Remark : https://www.acmicpc.net/problem/2845
 */
public class Party2845 {
    public static void main(String[] args) throws Exception {


        //BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");

        int i1 = Integer.parseInt(st1.nextToken());
        int i2 = Integer.parseInt(st1.nextToken());
        //System.out.println("i1 : " + i1 + " , i2 : " + i2);

        int number = i1 * i2;
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int j1 = Integer.parseInt(st2.nextToken());
        int j2 = Integer.parseInt(st2.nextToken());
        int j3 = Integer.parseInt(st2.nextToken());
        int j4 = Integer.parseInt(st2.nextToken());
        int j5 = Integer.parseInt(st2.nextToken());
        System.out.println((j1-number) + " " + (j2-number) + " " + (j3-number) + " " + (j4-number) + " " + (j5-number));



    }
}
