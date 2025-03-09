package com.byone421.decorator.headfirst;

public class Decaf extends Beverage{

    public Decaf(){
        description = "Decaf";
    }
    @Override
    public double cost() {
        return .55;
    }
}
