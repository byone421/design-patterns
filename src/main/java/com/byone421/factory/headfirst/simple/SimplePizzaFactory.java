package com.byone421.factory.headfirst.simple;

public class SimplePizzaFactory {
    public  Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
