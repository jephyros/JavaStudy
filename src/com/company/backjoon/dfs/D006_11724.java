package com.company.backjoon.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-10
 * Remark :  https://www.acmicpc.net/problem/11724 연결 요소의 개수
 */
public class D006_11724 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int n =Integer.parseInt(st1.nextToken());
        int k =Integer.parseInt(st1.nextToken());



        int[] visit = new int[n+1];
        int RESULTCNT = 0;
        ArrayList<Integer>[] adjacencyMatrix = new ArrayList[n+1];
        for (int i=1;i<n+1;i++) {
            adjacencyMatrix[i] = new ArrayList<>();
        }
        for(int i =0;i<k;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            adjacencyMatrix[a].add(b);
            adjacencyMatrix[b].add(a);


        }

//        adjacencyMatrix[2].add(5);
//        adjacencyMatrix[5].add(2);
//        adjacencyMatrix[5].add(1);
//        adjacencyMatrix[1].add(5);
//        adjacencyMatrix[3].add(4);
//        adjacencyMatrix[4].add(3);
//        adjacencyMatrix[4].add(6);
//        adjacencyMatrix[6].add(4);

        for(int i=1;i<n+1;i++){
            if(visit[i]==0) {
                RESULTCNT += 1;
                fnBFS(i, adjacencyMatrix,visit);
            }
        }
        System.out.println(RESULTCNT);

//        for (int i=1;i<n+1;i++) {
//            System.out.printf("%d -> ",i);
//
//            for(int v:adjacencyMatrix[i]){
//                System.out.printf("%d ",v);
//            }
//            System.out.println("");
//        }


    }

    private static void fnBFS(int i, ArrayList<Integer>[] adjacencyMatrix,int[] visit) {
        visit[i]=1;
        for(int v:adjacencyMatrix[i]){
            if(visit[v]==0) {
                fnBFS(v, adjacencyMatrix,visit);
            }

        }

    }
}
