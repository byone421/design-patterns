package com.byone421.strategy.headfirst;

public class ModelDuck extends Duck {

    /**
     *  在构造方法初始化默认的行为，也可以通过构造参数传递。
     */
    public ModelDuck(){
        //一开始模型鸭不会飞
        flyBehavior = new FlyNoWay();
        //可以呱呱叫
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("display:模型鸭");
    }
}
