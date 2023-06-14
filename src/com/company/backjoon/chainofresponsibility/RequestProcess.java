package com.company.backjoon.chainofresponsibility;

/**
 * @author InSeok
 * Date : 2021-12-06
 * Remark :
 */
public class RequestProcess {
    private int a;
    private int b;
    private String op;
    public RequestProcess(int a, int b, String op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getOp() {
        return op;
    }

}
