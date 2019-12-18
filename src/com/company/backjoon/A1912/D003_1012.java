package com.company.backjoon.A1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-12-05
 * Remark : https://www.acmicpc.net/problem/1012 유기농 배추
 */
public class D003_1012 {
    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());

        for(int i=0;i<testNum;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());
            int i3 = Integer.parseInt(st.nextToken());
            int xSize=i1;
            int ySize=i2;

            int[][] data = new int[ySize][xSize];
            for (int j = 0;j< i3;j++){
                StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
                int j1 = Integer.parseInt(st1.nextToken());
                int j2 = Integer.parseInt(st1.nextToken());
                data[j2][j1] = 1;

            }

            fnCheck(data,xSize,ySize);
        }






    }
    private static void fnCheck(int[][] data,int xSize, int ySize){
        int complexNum =1;
        for(int i=0;i<ySize;i++){
            for(int j=0;j<xSize;j++){
                if (data[i][j]==1) {
                    complexNum++;
                    fnDFS(i, j, data, complexNum, xSize,ySize);
                }
            }
        }
        //출력
        System.out.println(complexNum-1);

    }

    private static void fnDFS(int x, int y, int[][] data, int complexNum, int xSize, int ySize) {
        //자기자신이 방문했는지 확인
        data[x][y] = complexNum;
        //4방향 탐색
        int dx,dy;
        //좌
        dx= x;
        dy= y-1;
        if (dx > -1 && dx < ySize && dy >-1 && dy < xSize ){
            if (data[dx][dy]==1){
                fnDFS(dx,dy,data,complexNum,xSize,ySize);
            }
        }
        //우
        dx= x;
        dy= y+1;
        if (dx > -1 && dx < ySize && dy >-1 && dy < xSize ){
            if (data[dx][dy]==1){
                fnDFS(dx,dy,data,complexNum,xSize,ySize);
            }
        }
        //상
        dx= x-1;
        dy= y;
        if (dx > -1 && dx < ySize && dy >-1 && dy < xSize ){
            if (data[dx][dy]==1){
                fnDFS(dx,dy,data,complexNum,xSize,ySize);
            }
        }
        //하
        dx= x+1;
        dy= y;
        if (dx > -1 && dx < ySize && dy >-1 && dy < xSize ){
            if (data[dx][dy]==1){
                fnDFS(dx,dy,data,complexNum,xSize,ySize);
            }
        }
    }


}
