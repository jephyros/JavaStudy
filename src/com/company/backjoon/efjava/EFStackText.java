package com.company.backjoon.efjava;

import java.util.Arrays;
import java.util.List;

/**
 * @author InSeok
 * Date : 2021-11-02
 * Remark :
 */
public class EFStackText {
    public static void main(String[] args) {
        EFStack<Number> stack = new EFStack<>();
        List<Integer> list = Arrays.asList(1,2,3);
        stack.pushAll(list);
    }
}
