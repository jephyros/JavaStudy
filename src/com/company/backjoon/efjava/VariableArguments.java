package com.company.backjoon.efjava;

import java.util.Arrays;
import java.util.List;

/**
 * @author InSeok
 * Date : 2021-11-03
 * Remark :
 */
public class VariableArguments {
    public static void main(String[] args) {
        //paramtest("A","B");
        List<String> strings = Arrays.asList("Q", "W");
        paramtest(strings);
    }
    public static void paramtest(String type,String type2,String ...parms){
        //System.out.println(parms[0]);
        for (String v:parms) {
            System.out.println(v);

        }
    }
    public static void paramtest(List<String> ...args){
        //System.out.println(args[0]);
        Object[] objects = args;
        objects[0] = Arrays.asList(1,2,3);
        String s = args[0].get(0);
        System.out.println(objects[0]);
        



    }
}
