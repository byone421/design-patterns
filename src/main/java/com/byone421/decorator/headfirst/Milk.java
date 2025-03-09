package com.byone421.decorator.headfirst;

public class Milk extends CondimentDecorator{

    Beverage beverage;
    public Milk(Beverage beverage){
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
