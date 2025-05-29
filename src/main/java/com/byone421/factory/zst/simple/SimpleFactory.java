package com.byone421.factory.zst.simple;


/**
 * 简单工厂模式属创建型模式，但不属于23种设计模式之一。
 *    定义： 定义一个工厂类，他可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类。
 *    在简单工厂模式中用于被创建实例的方法通常为静态(static)方法，因此简单工厂模式又被成为静态工厂方法
 *    简单工厂模式违反了开放封闭原则，即对扩展开放对修改也开放。
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Product productA = Factory.createProduct("A");
        productA.info();

        Product productB = Factory.createProduct("B");
        productB.info();
    }
}
