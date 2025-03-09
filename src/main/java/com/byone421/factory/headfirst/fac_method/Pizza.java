package com.byone421.factory.headfirst.fac_method;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    void prepare(){
        System.out.println("prepare()");
    }
    void bake(){
        System.out.println("bake()");
    }
    void cut(){
        System.out.println("cut()");
    }

    void box(){
        System.out.println("box()");
    }

    public String getName() {
        return name;
    }
}
