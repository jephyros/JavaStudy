package com.company.backjoon.statepattern;

/**
 * @author InSeok
 * Date : 2021-12-06
 * Remark :
 */
public class PersonEmotion {
    private State state;

    public PersonEmotion(State state) {
        this.state = state;
    }
    public void earnMoney(){
        state= state.earnMoney();
        state.printCurrencyState();
    }
    public void loseMoney(){
        state = state.loseMoney();
        state.printCurrencyState();
    }

    public static void main(String[] args) {
        PersonEmotion person = new PersonEmotion(new EmoionLevel1());
        person.loseMoney();
        person.earnMoney();
        person.earnMoney();
        person.earnMoney();
        person.earnMoney();
        person.earnMoney();
        person.earnMoney();
        

    }
}
