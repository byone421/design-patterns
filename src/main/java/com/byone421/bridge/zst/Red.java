package com.byone421.bridge.zst;

public class Red implements Color{
    @Override
    public void OperationImpl(String name) {
        System.out.println(name + ": 红色" );
    }
}
