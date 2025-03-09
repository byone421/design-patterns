package com.byone421.decorator.headfirst;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha( Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 99 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
