package com.byone421.decorator.headfirst;

/**
 * 具体装饰者
 */
public class Milk extends CondimentDecorator{

    Beverage beverage;
    public Milk(Beverage beverage){
        super(1,"Milk");
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + " -- " + "Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 8;
    }


}
