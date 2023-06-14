package com.company.backjoon.mediatorpattern;

/**
 * @author InSeok
 * Date : 2021-12-07
 * Remark :
 */
public class Light {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public void ligntOn(){
        System.out.println("ligntOn");
    }
    public void lightOff(){
        System.out.println("Light Off");
        mediator.notify("LightOff");
    }

}
