package com.byone421.templatemethod.heafirst;

public class Coffee extends CoffeineBeverage {
    @Override
    void brew() {
        System.out.println("dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }
}
