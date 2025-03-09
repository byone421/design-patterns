package com.byone421.factory.heima.simple;

public class Test {
    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.createCoffee("american");
        System.out.println(coffee.getName());
    }
}
