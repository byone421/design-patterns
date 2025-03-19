package com.byone421.strategy.heima;


/**
 * 环境（Context）类
 */
public class SalesMan {

    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void  showStrategy(){
        strategy.show();
    }
}
