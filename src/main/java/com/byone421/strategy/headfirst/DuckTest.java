package com.byone421.strategy.headfirst;


/**
 * 测试类
 */
public class DuckTest {
    public static void main(String[] args) {
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performQuark();
        modelDuck.performFly();
        modelDuck.display();

        //切换算法
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.setQuackBehavior(new Squeak());
        modelDuck.performQuark();
        modelDuck.performFly();
    }
}
