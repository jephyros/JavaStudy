package com.company.backjoon.chainofresponsibility;

/**
 * @author InSeok
 * Date : 2021-12-06
 * Remark :
 */
public abstract class Process {
    private Process nextProcess;

    public void setNextProcess(Process nextProcess) {
        this.nextProcess = nextProcess;
    }

    public Boolean proc(RequestProcess requestProcess){
        if (operate(requestProcess)){
            return true;
        }else{
            if (nextProcess == null) {
                System.out.println("처리할수 없습니다.");
                return false;
            }else{
                return nextProcess.proc(requestProcess);
            }

        }

    }

    abstract Boolean operate(RequestProcess requestProcess);
}
