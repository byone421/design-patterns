package com.byone421.strategy.heima;


//为春节准备的促销活动
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
