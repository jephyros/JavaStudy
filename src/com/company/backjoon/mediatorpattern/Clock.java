package com.company.backjoon.mediatorpattern;

/**
 * @author InSeok
 * Date : 2021-12-07
 * Remark :
 */
public class Clock {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void alarmOn(){
        System.out.println("Alarm On!");
        mediator.notify("AlarmOn");
    }
}
