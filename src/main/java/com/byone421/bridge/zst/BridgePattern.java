package com.byone421.bridge.zst;

/**
 * 桥接模式：
 *  意图：将抽象部分与其实现部分分离，使得他们可以进行独立的变化
 *  适用性：
 *    - 不希望在抽象和它的实现部分之间有一个固定的绑定关系。
 *    - 类的抽象以及它的实现都应该可以通过生成子类的方法加以扩充。
 *    - 对一个抽象的实现部分的修改应对客户不产生影响，即客户代码不必重新编译。(C++)想对客户完全隐藏抽象的实现部分。
 *    - 有许多类要生成的类层次结构。
 *    - 想在多个对象间共享实现（可能使用引用计数），但同时要求客户并不知道这一点。
 */
public class BridgePattern {
    public static void main(String[] args) {
        Product productA = new ProductA();
        Product productB = new ProductA();

        Color red = new Red();
        productA.setName("产品A");
        productA.setColor(red);
        productA.Operation();

        Blue blue = new Blue();
        productB.setName("产品B");
        productB.setColor(blue);
        productB.Operation();
    }
}
