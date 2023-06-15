package com.company.backjoon.a2001;

import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020/01/11
 * Remark : https://www.acmicpc.net/problem/10250
 */
public class J018_10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        //int[][] data = new int[x][3];
        for(int i = 0 ; i<x;i++){
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(fnroom(h,w,n));
        }


    }

    private static int fnroom(int h, int w, int n) {
        int i =0;
        int startn =0;
        int roomnum = 0;
        int roomnum2 =0;
        while(true){
            i++;
            if(n <= i * h){
                startn = (i-1)*h;
                roomnum2 = i;
                break;
            }
        }
        roomnum = (n-startn) * 100 + roomnum2 ;


        return roomnum;

    }
}
