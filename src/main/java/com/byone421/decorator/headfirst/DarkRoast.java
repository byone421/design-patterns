package com.byone421.decorator.headfirst;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "DarkRoast";
    }
    @Override
    public double cost() {
        return 1.f;
    }
}
