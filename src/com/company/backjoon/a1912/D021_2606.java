package com.company.backjoon.a1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-24
 * Remark : https://www.acmicpc.net/problem/2606  바이러스
 */
public class D021_2606 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());


        ArrayList<Integer>[]  am = new ArrayList[n+1];

        for(int i=1;i<n+1;i++){
            am[i] = new ArrayList();
        }
        //int[][] am = new int [n+1][n+1];

        int[] visit = new int[n+1];

        for(int i=0;i< cnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());
            //양방향 인접행열
            am[i1].add(i2);
            am[i2].add(i1);

        }


        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        visit[1]=1;
        while(!q.isEmpty()){
            int poll = q.poll();

            am[poll].forEach( v ->{
                if(visit[v]==0){
                    visit[v] = 1;
                    q.add(v);
                }
            });


        }
        int resultcnt = 0;
        for(int i = 2;i< visit.length; i++) {
            if(visit[i]==1){
                resultcnt += 1;
            }
        }
        System.out.println(resultcnt);

    }
}
