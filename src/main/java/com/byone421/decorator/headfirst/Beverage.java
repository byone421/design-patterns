package com.byone421.decorator.headfirst;

/**
 * 抽象构件（Component）角色
 */
public abstract class Beverage {

    int size = 0;
    String description = "未知的饮料";

    public Beverage (int size,String description){
        this.size = size;
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public abstract  double cost();


    public static final int TALL = 1;
    public static final int GRANDE = 2;
    public static final int VENTI = 3;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
