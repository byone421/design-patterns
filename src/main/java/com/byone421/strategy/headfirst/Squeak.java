package com.byone421.strategy.headfirst;

/**
 * 在类图中的角色为：ConcreteStrategy
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
