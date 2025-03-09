package com.byone421.factory.heima.simple;


public class CoffeeStore {

    public Coffee createCoffee(String type){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.addsugar();
        coffee.addMilk();
        return coffee;
    }
}
