package com.company.backjoon.a2001;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020-01-02
 * Remark : https://www.acmicpc.net/problem/2562
 */
public class J002_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        for(int i = 0 ;i<9 ;i++){
            data.add(scanner.nextInt());
        }
        int maxcnt = 0;
        int maxresult = 0;
        for(int i = 0 ;i < data.size();i++){
            if(maxresult < data.get(i)){
                maxcnt = i +1;
                maxresult = data.get(i);
            }
        }
        System.out.println(maxresult);
        System.out.println(maxcnt);

    }
}
