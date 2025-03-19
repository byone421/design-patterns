package com.byone421.templatemethod.heafirst;

/**
 * 具体的子类
 */
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
