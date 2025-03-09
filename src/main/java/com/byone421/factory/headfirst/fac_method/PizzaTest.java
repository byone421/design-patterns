package com.byone421.factory.headfirst.fac_method;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);

    }
}
