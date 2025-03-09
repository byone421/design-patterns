package com.byone421.adapter.headfirst.obj;

public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        testDuck(mallardDuck);

        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.fly();
    }
}
