package com.byone421.strategy.headfirst;

/**
 * 在类图中的角色为：ConcreteStrategy
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞不了");
    }
}
