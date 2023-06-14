package com.company.backjoon.chainofresponsibility;

/**
 * @author InSeok
 * Date : 2021-12-06
 * Remark :
 */
public class MultiProcess extends Process{

    @Override
    Boolean operate(RequestProcess requestProcess) {
        if (requestProcess.getOp().equals("*")){

            System.out.println("곱하기연산 : " + (requestProcess.getA() * requestProcess.getB()));
            return true;
        }else{
            return false;
        }

    }
}
