package com.company.backjoon.statepattern;

/**
 * @author InSeok
 * Date : 2021-12-06
 * Remark :
 */
public class EmoionLevel5 implements State {
    @Override
    public State earnMoney() {
        return this;
    }

    @Override
    public State loseMoney() {
        return new EmoionLevel4();
    }

    @Override
    public void printCurrencyState() {
        System.out.println("현재상태는 레벨 5 입니다. (최악1 , 최고 5)");

    }
}
