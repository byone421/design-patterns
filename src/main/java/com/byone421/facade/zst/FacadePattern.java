package com.byone421.facade.zst;

/**
 * 外观模式：
 *  意图：为子系统中的一组接口提供一个一致的界面，Facade 模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 *  适用性：
 *      - 要为一个复杂子系统提供一个简单接口时。
 *      - 客户程序与抽象类的实现部分之间存在着很大的依赖性。
 *      - 当需要构建一个层次结构的子系统时，使用 Facade 模式定义子系统中每层的入口点。
 */
public class FacadePattern {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();
        facade.methodC();
    }
}
