package com.byone421.decorator.headfirst;


/**
 * 具体构件（Concrete Component）角色
 */
public class DarkRoast extends Beverage{

    public DarkRoast(){
        super(1,"DarkRoast");
    }
    @Override
    public double cost() {
        return 1.f;
    }
}
