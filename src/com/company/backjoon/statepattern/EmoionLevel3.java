package com.company.backjoon.statepattern;

/**
 * @author InSeok
 * Date : 2021-12-06
 * Remark :
 */
public class EmoionLevel3 implements State {
    @Override
    public State earnMoney() {
        return new EmoionLevel4();
    }

    @Override
    public State loseMoney() {
        return this;
    }

    @Override
    public void printCurrencyState() {
        System.out.println("현재상태는 레벨 3 입니다. (최악1 , 최고 5)");

    }
}
