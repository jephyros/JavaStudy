package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @author InSeok
 * Date : 2019-11-29
 * Remark : https://www.acmicpc.net/problem/5766  할아버지는 유명해!
 */
public class S016_5766 {

    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean chkloop = true;
        while(chkloop){
            ArrayList<int[]> arr = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());
            if (i1 == 0 && i2 == 0){
                chkloop=false;
                break;
            }
            for (int x = 0 ; x< i1; x++){
                StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
                int[] addarr = new int[i2];
                for(int y =0;y<i2;y++){
                    addarr[y] = Integer.parseInt(st1.nextToken());
                }
                arr.add(addarr);
            }


            fn(arr);
        }

    }
    private static void fn(ArrayList<int[]> arr){
        Map<Integer,Integer> map = new TreeMap<>();
        for(int[] k: arr){
            for(int v:k){
                if (map.containsKey(v)){
                    int tmp = map.get(v);
                    map.replace(v,tmp+1);
                }else{
                    map.put(v,1);
                }
            }
        }

        Iterator<Integer> iterator = map.values().iterator();
        //최대값구하기
        int maxi =0;
        while(iterator.hasNext()){
            Integer i = iterator.next();
            if (i > maxi){
                maxi = i;
            }
        }
        iterator = map.values().iterator();
        int i2nd=0;
        while(iterator.hasNext()){
            Integer i = iterator.next();
            if (i > i2nd && i< maxi){
                i2nd = i;
            }
        }


        Iterator<Integer> keyitr = map.keySet().iterator();

        while(keyitr.hasNext()){
            Integer keyv = keyitr.next();
            if ( map.get(keyv) == i2nd){
                System.out.printf("%d ",keyv);
            }

        }
        System.out.println("");



    }
}
