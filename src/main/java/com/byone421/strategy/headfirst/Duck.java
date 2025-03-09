package com.byone421.strategy.headfirst;

/**
 * 在类图中的角色为：Context
 */
public abstract class Duck {

    /**
     * 聚合Strategy
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    /**
     * 提供set 可以在运行时动态替换算法
     *
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 提供set 可以在运行时动态替换算法
     *
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    abstract void display();


    void performQuark() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }
}
