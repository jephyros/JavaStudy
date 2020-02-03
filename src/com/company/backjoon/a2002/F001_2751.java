package com.company.backjoon.a2002;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author InSeok
 * Date : 2020/02/01
 * Remark : https://www.acmicpc.net/problem/2751
 */
public class F001_2751 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0;i<n;i++){
            data[i] = scanner.nextInt();
        }

        fnHeapSort(data);

        Arrays.sort(data);
        for(int i:data){
            System.out.println(i);
        }
    }

    private static void fnHeapSort(int[] data) {
        //MaxHeap 구성
        for(int i = (data.length-1) /2 ; i >=0;i--){
            fnMaxHeapMake(data,i,data.length);
        }
        //정렬시작( Max Index 와 첫번째 를 교환 후 )
        for(int i = data.length;i>0;i--){

            int tmp = data[0];
            data[0] = data[i-1];
            data[i-1] = tmp;
            fnMaxHeapMake(data,0,i -1);
        }

    }


    private static void fnMaxHeapMake(int[] data, int n,int heaplength) {
        int length = heaplength;
        int leftchild = n * 2 + 1;
        int rightchild = n * 2 + 2;

        //자식노드없으면 종료
        if ((length -1) < leftchild ){
            //아무것도안한다.
            return;
        }
        //자식이 하나만있으면(leftchild)
        else if((length -1) == leftchild){
            //부모보보다 자식이 크면 패스
            int maxchild =leftchild;
            if(data[n] > data[maxchild]){
                return;
            }else{ // 부모 자식 교체후 재귀호출
                int tmp = data[n];
                data[n] = data[maxchild];
                data[maxchild] = tmp;

                //fnMaxHeapMake(data,maxchild,heaplength);

            }

        }
        //자식이 두개있으면
        else{
            //두자식죽 큰놈 확인
            int maxchild =0;

            if(data[leftchild]> data[rightchild]){
                maxchild=leftchild;
            }else{
                maxchild = rightchild;
            }
            if (data[n] > data[maxchild]) {
                return;
            }else{
                int tmp = data[n];
                data[n] = data[maxchild];
                data[maxchild] = tmp;

                fnMaxHeapMake(data,maxchild,heaplength);
                return;

            }
        }


    }
}
