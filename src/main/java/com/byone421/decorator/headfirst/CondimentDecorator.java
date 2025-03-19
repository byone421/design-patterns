package com.byone421.decorator.headfirst;


/**
 * 抽象装饰（Decorator）角色
 * 
 */
public abstract class CondimentDecorator extends Beverage{


    public CondimentDecorator(int size, String description) {
        super(size, description);
    }

    public abstract String getDescription();
}

