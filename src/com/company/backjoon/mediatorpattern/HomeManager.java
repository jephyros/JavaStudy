package com.company.backjoon.mediatorpattern;

import com.company.backjoon.efjava.Cloth;

import java.util.List;

/**
 * @author InSeok
 * Date : 2021-12-07
 * Remark :
 */
public class HomeManager implements Mediator{
    private Clock clock;
    private Light light;
    private Speaker speaker;

    public HomeManager(Clock clock, Light light, Speaker speaker) {
        this.clock = clock;
        this.light = light;
        this.speaker = speaker;
    }

    @Override
    public void notify(String signal) {
        if (signal.equals("AlarmOn")){
            light.ligntOn();
            speaker.speakerOn();
        }
        if (signal.equals("LightOff")){
            speaker.speakerOff();
        }

    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        Light light = new Light();
        Speaker speaker = new Speaker();

        HomeManager homeManager = new HomeManager(clock, light, speaker);
        clock.setMediator(homeManager);
        light.setMediator(homeManager);
        speaker.setMediator(homeManager);

        clock.alarmOn();
        light.lightOff();
    }
}
