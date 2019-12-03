package com.company.backjoon.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author InSeok
 * Date : 2019-12-03
 * Remark : https://www.acmicpc.net/problem/1260 DFS와 BFS
 */
public class D001_1260 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int i1 = Integer.parseInt(st.nextToken());
        int i2 = Integer.parseInt(st.nextToken());
        int i3 = Integer.parseInt(st.nextToken());

        int totalnode = i1;
        int startnode = i3;



        int[] visit1 = new int[totalnode+1];
        int[] visit2 = new int[totalnode+1];

        ArrayList<Integer>[] data = new ArrayList[totalnode + 1];

        for(int i=1; i<=totalnode;i++){
            data[i] = new ArrayList();
        }

        for(int i=0;i<i2;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int v1 = Integer.parseInt(st1.nextToken());
            int v2 = Integer.parseInt(st1.nextToken());
            data[v1].add(v2);
            data[v2].add(v1);

        }



        //data 정렬
        for(int i=1;i <=totalnode ;i++){
            Collections.sort(data[i]);
        }



        fnDFS(data,startnode,visit1);
        System.out.println("");
        fnBFS(data,startnode,visit2);
    }



    //DFS
    private static void fnDFS(ArrayList<Integer>[] data, int startnode, int[] visit) {
        if(visit[startnode]!=1) {
            visit[startnode] =1;
            System.out.printf("%d ", startnode);
            data[startnode].forEach(v -> {
                if (visit[v] != 1) {
                    fnDFS(data, v, visit);
                }
            });
        }
    }
    //BFS
    private static void fnBFS(ArrayList<Integer>[] data, int startnode, int[] visit) {
        Queue<Integer> q = new LinkedList<>();
        q.add(startnode);
        while (!q.isEmpty()){
            Integer peek = q.poll();
            visit[peek]=1;
            System.out.printf("%d ",peek);

            data[peek].forEach(v->{
                if(visit[v] != 1){
                    q.add(v);
                    visit[v] =1;
                }
            });

        }

    }



}

