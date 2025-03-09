package com.byone421.strategy.heima;

///为中秋准备的促销活动B
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
