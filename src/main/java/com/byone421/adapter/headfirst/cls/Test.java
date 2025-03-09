package com.byone421.adapter.headfirst.cls;

import com.byone421.adapter.headfirst.obj.Duck;
import com.byone421.adapter.headfirst.obj.MallardDuck;

public class Test {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter();
        testDuck(mallardDuck);
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.fly();
    }
}
