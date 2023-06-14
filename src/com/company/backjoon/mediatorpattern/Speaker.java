package com.company.backjoon.mediatorpattern;

/**
 * @author InSeok
 * Date : 2021-12-07
 * Remark :
 */
public class Speaker {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public void speakerOn(){
        System.out.println("Speaker On");
    }
    public void speakerOff(){
        System.out.println("Speaker Off");
    }
}
