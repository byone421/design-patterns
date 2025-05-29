package com.byone421.factory.zst.fac_method;

public class FactoryA implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
