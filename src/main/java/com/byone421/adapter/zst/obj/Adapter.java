package com.byone421.adapter.zst.obj;

/**
 * 适配器
 */
public class Adapter  extends Target{
    private Adaptee adaptee = new Adaptee();
    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}
