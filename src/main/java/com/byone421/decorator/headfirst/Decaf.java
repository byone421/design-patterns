package com.byone421.decorator.headfirst;

/**
 * 具体构件（Concrete Component）角色
 */
public class Decaf extends Beverage{

    public Decaf(){
        super(1,"Decaf");
    }
    @Override
    public double cost() {
        return .55;
    }
}
