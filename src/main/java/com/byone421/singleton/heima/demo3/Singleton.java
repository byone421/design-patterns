package com.byone421.singleton.heima.demo3;

public class Singleton {

    //私有构造方法
    private Singleton() {}

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }


    //提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
