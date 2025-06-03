package com.byone421.prototype.zst;

/**
 * 原型模式：
 *   意图：用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象。
 *   适用性：
 *    - 当一个系统应该独立于它的产品创建、构成和表示时。
 *    - 当要实例化的类是在运行时刻指定时，例如，通过动态装载。
 *    - 为了避免创建一个与产品类层次平行的工厂类层次时。
 *    - 当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们，可能比每次用合适的状态手工实例化该类更方便一些。
 *
 */
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(2022,5.28);
        System.out.println(product1.getId()+ " " + product1.getPrice());

        Product product2 = (Product) product1.Clone();
        System.out.println(product2.getId()+ " " + product2.getPrice());

        System.out.println(product1 == product2);

    }
}
