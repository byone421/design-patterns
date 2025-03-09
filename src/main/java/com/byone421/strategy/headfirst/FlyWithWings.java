package com.byone421.strategy.headfirst;

/**
 * 在类图中的角色为：ConcreteStrategy
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }
}
