package com.byone421.factory.zst.fac_method;

public class FactoryB implements Factory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
