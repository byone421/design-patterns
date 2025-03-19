package com.byone421.templatemethod.heafirst;

/**
 * 具体的子类
 */
public class Tea extends CoffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("adding lemon");
    }
}
