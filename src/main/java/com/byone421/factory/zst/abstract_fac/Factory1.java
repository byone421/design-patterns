package com.byone421.factory.zst.abstract_fac;

public class Factory1 implements Factory{
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
