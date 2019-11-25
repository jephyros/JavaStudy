    package com.company.backjoon.intro;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.StringTokenizer;

    /**
     * @author InSeok
     * Date : 2019/11/25
     * Remark : https://www.acmicpc.net/problem/4641
     */
    public class S008Doubles4641 {
        public static void main(String[] args) throws Exception{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<int[]> data = new ArrayList<>();

            boolean checkloop = true;
            while(checkloop){
                int[] arr = new int[15];
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                int v = Integer.parseInt(st.nextToken());

                if (v == -1){
                    checkloop = false;
                    break;
                }
                arr[0] = v;
                int i1 = st.countTokens();


                for(int i = 0; i < i1 -1 ;i++){
                    arr[i+1] = Integer.parseInt(st.nextToken());
                }

                data.add(arr);
            }
            data.forEach(v->{
                doubleNumPrint(v);

            });

        }
        private static void doubleNumPrint(int[] data){
            //자연수 최대값이 100 보다 작으으로 최대값은 198이므로 200개 배열생성

            int[] chkedata = new int[201];
            int resultCnt =0;
            for(int i=0 ; i<=200;i++){
                chkedata[i] = 0;
            }
            //2배값의 위치에 표기
            for(int j=0 ; j < data.length ; j++){
                if (data[j] == 0) break;
                chkedata[data[j]*2] = 1;
            }
            for(int j=0 ; j < data.length ; j++){
                if (data[j] == 0) break;
                resultCnt =resultCnt + chkedata[data[j]];
            }
            System.out.println(resultCnt);

        }
    }
