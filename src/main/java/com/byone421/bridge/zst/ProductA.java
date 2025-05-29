package com.byone421.bridge.zst;

public class ProductA extends Product{
    @Override
    public void Operation() {
        color.OperationImpl(getName());
    }
}
