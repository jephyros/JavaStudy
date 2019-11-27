package com.company.backjoon.intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author InSeok
 * Date : 2019-11-27
 * Remark :  https://www.acmicpc.net/problem/4659  비밀번호 발음하기
 */
public class S012_4659 {
    final static char[] v = {'a','e','i','o','u'}; // vowol
    final static char[] vn = { 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z' };

    public static void main(String[] args) throws Exception {

        //ArrayList<String> arr = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        boolean loopchk = true;
        while(loopchk) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            String s = st.nextToken();
            if (s.equals("end")){
                loopchk=false;
                break;
            }
            //arr.add(s);
            System.out.printf("<%s> is %s\n",s, fn(s) ? "acceptable.":"not acceptable.");
        }

//        for (String s :arr) {
//            System.out.printf("<%s> is %s\n",s, fn(s) ? "acceptable.":"not acceptable.");
//        }





    }
    public static boolean fn(String str){
        boolean result = true;
        //##### 1 모음이 한개이상있는지 확인
            boolean chk_1 = false;
            for (char s:v) {
                if(str.contains(Character.toString(s))){
                    chk_1 = true;
                    break;
                }
            }
            //모음이 포함안되면 실패종료
            if (!chk_1) return false;

        //##### 2-1 모임이3개 연속오는지체크
            boolean chk_21= true;
            for(int i = 0 ; i<str.length() -2;i++){


                if(
                        String.valueOf(v).contains(str.substring(i,i+1)) &&
                        String.valueOf(v).contains(str.substring(i+1,i+2)) &&
                        String.valueOf(v).contains(str.substring(i+2,i+3))
                ){
                    chk_21 = false;
                    break;
                }
            }
            //모음이 연속3개이면 종료
            if (!chk_21) return false;



        //##### 2-2 자음이3개 연속오는지체크
            boolean chk_22= true;
            for(int i = 0 ; i<str.length() -2;i++){


                if(
                        String.valueOf(vn).contains(str.substring(i,i+1)) &&
                                String.valueOf(vn).contains(str.substring(i+1,i+2)) &&
                                String.valueOf(vn).contains(str.substring(i+2,i+3))
                ){
                    chk_22 = false;
                    break;
                }
            }
            //자음이 연속3개이면 종료
            if (!chk_22) return false;
        //##### 5 같은글자 연속 체크 단 ee oo 제외
            boolean chk_3= true;
            for(int i = 0 ; i<str.length() -1;i++){


                if(str.substring(i,i+1).equals(str.substring(i+1,i+2))) {

                    if (!str.substring(i,i+1).equals("e") && !str.substring(i,i+1).equals("o")) {
                        chk_3 = false;
                        break;
                    }
                }
            }
            //같은글자2개는 오류 단 ee,oo 제외 종료
            if (!chk_3) return false;




        return result;

    }
}
