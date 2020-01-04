package com.company.backjoon.a2001;

/**
 * @author InSeok
 * Date : 2020/01/04
 * Remark :
 */
public class J006_programmers_201 {
    public static void main(String[] args) {

        //System.out.println(solution("())((())"));
//        System.out.println(solution2("()(((()())(())()))(())"));
        System.out.println(solution2("(()())"));

    }

    public static int solution2(String s) {

        int answer =0;
        // ( 괄호갯수
        int bcnt = 0;
        //이전 값
        String prev ="";
        for(int i = 0;i<s.length();i++){
            if(i==0){
                if(s.substring(i,i+1).equals("(")) bcnt += 1;
                prev = s.substring(i,i+1);
            }else {
                if (s.substring(i, i + 1).equals("(")) {
                    bcnt += 1;
                }

                if (s.substring(i, i + 1).equals(")") && prev.equals("(")) {
                    bcnt -= 1;
                    answer += bcnt;
                }
                if (s.substring(i, i + 1).equals(")") && prev.equals(")")) {
                    bcnt-= 1;
                    answer += 1;
                }
                prev = s.substring(i,i+1);
            }
        }

        return answer;

    }


    public static boolean solution(String s) {

        int[] data = new int[2];
        for(int i = 0;i<s.length();i++){

            if(s.substring(i,i+1).equals("(") ){
                data[0] += 1;
            }
            if(s.substring(i,i+1).equals(")") ){
                data[1] += 1;
            }
            //닫는괄호가 먼저나오면 fasle
            if(data[0] <data[1]){
                return false;
            }


        }
        if(data[0] == data[1]){
            return true;
        }else{
            return false;
        }

    }
}
