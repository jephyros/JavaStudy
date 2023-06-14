package com.company.backjoon.chainofresponsibility;

/**
 * @author InSeok
 * Date : 2021-12-06
 * Remark :
 */
public class ChainTest {
    public static void main(String[] args) {
        PlusProcess plusProcess = new PlusProcess();
        MultiProcess multiProcess = new MultiProcess();

        RequestProcess r1 = new RequestProcess(1, 2, "+");
        RequestProcess r2 = new RequestProcess(3, 4, "*");
        RequestProcess r3 = new RequestProcess(3, 4, "-");

        plusProcess.setNextProcess(multiProcess);
        System.out.println(plusProcess.proc(r1));
        System.out.println(plusProcess.proc(r2));
        System.out.println(plusProcess.proc(r3));

    }
}
