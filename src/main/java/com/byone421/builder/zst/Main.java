package com.byone421.builder.zst;

/**
 * 生成器模式：
 *  意图： 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *  适用性：
 *      当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
 *      当构造过程必须允许被构造的对象有不同的表示时。
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Builder builder1 = new Builder1();
        director.Construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        Builder builder2 = new Builder2();
        director.Construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
}
