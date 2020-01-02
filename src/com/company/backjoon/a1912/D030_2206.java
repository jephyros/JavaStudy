package com.company.backjoon.a1912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-28
 * Remark : https://www.acmicpc.net/problem/2206 벽 부수고 이동하기
 */
public class D030_2206 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int rowcnt = Integer.parseInt(st.nextToken());
        int colcnt = Integer.parseInt(st.nextToken());


        int dr[] ={-1,1,0,0};
        int dc[] ={0,0,-1,1};
        int[][] data = new int[rowcnt][colcnt];
        int[][][] visit = new int[rowcnt][colcnt][2];
        for(int i = 0;i<rowcnt;i++){
            String str = br.readLine();
            for(int j =0;j<colcnt;j++){
                data[i][j]=Integer.parseInt(str.substring(j, j + 1));

            }
        }
//        int[][] data = {
//                {0,1,0,0},
//                {1,1,1,0},
//                {1,0,0,0},
//                {0,0,0,0},
//                {0,1,1,1},
//                {0,0,0,0},
//        };

        int resultcnt = 0;
        Queue<int[]> q = new LinkedList<>();

        visit[0][0][1] =2; //방문
        q.add(new int[]{0,0,1,0});
        while (!q.isEmpty()){
            int[] poll = q.poll();
            int r = poll[0];   //방문 row
            int c = poll[1];   // 방문 col
            int bal = poll[2]; // 벽부수기 잔여횟수
            int cnt = poll[3];
            if(r == rowcnt -1 && c == colcnt -1){
                resultcnt = cnt+1;
                break;
            }
            for(int i =0;i<4;i++){
                int mr = r + dr[i];
                int mc = c + dc[i];
                //범위안에 좌표가 있을때만 이동
                if(mc >= 0 && mc < colcnt && mr >=0 && mr < rowcnt ){
                    //이동할곳이 0 이거나 벽부수기 횟수가 남아있으면
                    if(data[mr][mc]==0){
                        if (visit[mr][mc][bal] == 1) continue;
                        visit[mr][mc][bal]=1;
                        q.add(new int[]{mr,mc,bal,cnt + 1});
                    }
                    if(data[mr][mc]==1 && bal > 0){
                        if (visit[mr][mc][bal-1] == 1) continue;
                        visit[mr][mc][bal-1]=1;
                        data[mr][mc]=2;
                        q.add(new int[]{mr,mc,bal-1,cnt + 1});

                    }

                }
            }

        }
        if(resultcnt == 0) resultcnt = -1;
        System.out.println(resultcnt);

    }
}
