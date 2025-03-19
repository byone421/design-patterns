package com.byone421.decorator.headfirst;

/**
 * 具体装饰者
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha( Beverage beverage){
        super(1,"Mocha");
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
