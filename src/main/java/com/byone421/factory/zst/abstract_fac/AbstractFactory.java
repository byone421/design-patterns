package com.byone421.factory.zst.abstract_fac;

/**
 * 抽象工厂模式:
 *  意图：提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。
 *  适用性：
 *   - 一个系统要独立于它的产品的创建、组合和表示时。
 *   - 一个系统要由多个产品系列中的一个来配置时。
 *   - 当要强调一系列相关的产品对象的设计以便进行联合使用时。
 *   - 当提供一个产品类库，只想显示它们的接口而不是实现时。
 *
 */
public class AbstractFactory {

    public static void main(String[] args) {
        Factory factory1 = new Factory1();
        ProductA productA1 = factory1.createProductA();
        productA1.info();
        ProductB productB1 = factory1.createProductB();
        productB1.info();

        Factory factory2 = new Factory2();
        ProductA productA2 = factory2.createProductA();
        productA2.info();
        ProductB productB2 = factory2.createProductB();
        productB2.info();
    }
}
