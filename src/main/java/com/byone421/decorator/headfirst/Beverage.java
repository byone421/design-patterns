package com.byone421.decorator.headfirst;

/**
 *   component
 *   concrete component
 *
 *
 */

public abstract class Beverage {

    String description = "未知的饮料";

    public String getDescription() {
        return description;
    }

    public abstract  double cost();
}
