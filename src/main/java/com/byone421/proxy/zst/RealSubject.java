package com.byone421.proxy.zst;

public class RealSubject implements Subject{
    @Override
    public void buy() {
        System.out.println("付钱~");
    }
}
