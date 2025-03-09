package com.byone421.strategy.heima;

public class StrategyTest {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.showStrategy();

        salesMan.setStrategy(new StrategyB());
        salesMan.showStrategy();
    }
}
