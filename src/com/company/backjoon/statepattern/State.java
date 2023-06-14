package com.company.backjoon.statepattern;

/**
 * @author InSeok
 * Date : 2021-12-06
 * Remark :
 */
public interface State {

    State earnMoney();
    State loseMoney();
    void printCurrencyState();
}

