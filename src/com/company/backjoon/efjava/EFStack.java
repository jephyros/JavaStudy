package com.company.backjoon.efjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author InSeok
 * Date : 2021-11-02
 * Remark :
 */
public class EFStack<E> {
    private List<E> list = new ArrayList<>();
    public void pushAll(Iterable<? extends E> src){
        for (E v:src) {
            push(v);
        }
    }
    public void push(E e){
        list.add(e);
    }
}


