package com.company.backjoon.a1912;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2019-12-27
 * Remark : D008 영어 소리튜닝 프로젝트 숨바꼭질
 */
public class D025_1697 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();



        int resultcnt = 0;
        int[] visit = new int[100001];

        Queue<int[]> q = new LinkedList<>();

        visit[n] = 1;
        q.add(new int[] {n,0} );
        while(!q.isEmpty()){
            int[] poll = q.poll();
            int curn = poll[0];
            int cnt = poll[1];

            if(curn==t){
                resultcnt = cnt ;
                break;
            }

            int m;
            //뒤로 한칸
            m = curn -1;
            if (m >= 0 && m<=100000 && visit[m]==0){
                visit[m] = 1;
                q.add(new int[] {m,cnt+1} );
            }
            //앞 한칸
            m = curn + 1;
            if (m >= 0 && m<=100000 && visit[m]==0){
                visit[m] = 1;
                q.add(new int[] {m,cnt+1} );
            }
            //제곱 이동
            m = curn * 2;
            if (m >= 0 && m<=100000 && visit[m]==0){
                visit[m] = 1;
                q.add(new int[] {m,cnt+1} );
            }


        }

        System.out.println(resultcnt);

    }
}
