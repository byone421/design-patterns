package com.byone421.decorator.headfirst;

public class Client {

    public static void main(String[] args) {

        DarkRoast darkRoast = new DarkRoast();
        Milk milk = new Milk(darkRoast);
        System.out.println(milk.getDescription());
        System.out.println(milk.cost());
    }
}
