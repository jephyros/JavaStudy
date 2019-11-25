package com.company.backjoon.intro;

/**
 * @author InSeok
 * Date : 2019-11-25
 * Remark :
 */
public class AmazingNumber6679 {
    public static void main(String[] args) {

//        System.out.println(sumString("2992"));
//        System.out.println(sumString(convertBase(2992,12)));
//        System.out.println(sumString(convertBase(2992,16)));

        for (int i =1000 ; i< 10000 ; i++){
            int a = sumString(Integer.toString(i));
            int b = sumString(convertBase(i,12));
            int c = sumString(convertBase(i,16));
            if (a == b && b == c){
                System.out.println(i);
            }


        }

    }
    private static int sumString(String str){
        int result = 0;
        int tmp = 0;
        for (int i =0;i < str.length();i++){
             tmp = Character.getNumericValue(str.charAt(i));
             result += tmp;
        }


        return result;
    }

    //자연수 n 을 base 진수로 변환하는 재귀함수
    private static String convertBase(int n, int base){
        char[] t= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        int v = n / base;
        int r = n % base;

        if ( v== 0){
            return  Character.toString(t[r]);
        }else{
            return convertBase(v,base) + t[r];
        }

    }

}
