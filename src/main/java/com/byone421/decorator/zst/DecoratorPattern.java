package com.byone421.decorator.zst;

/**
 * 装饰者模式：
 *   意图：动态地给一个对象添加一些额外的职责。就增加功能而言，Decorator模式比生成子类更加灵活。
 *   适用性：
 *      - 在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
 *      - 处理那些可以撤销的职责。
 *      - 当不能采用生成子类的方式进行扩充时。一种情况是，可能有大量独立的扩展，为支持每一种组合将产生大量的子类，使得子类数目呈爆炸性增长。另一种情况可能是，由于类定义被隐藏，或类定义不能用于生成子类。（了解）
 *
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Person zhangsan = new Student("张三");
        zhangsan = new DecoratorA(zhangsan);
        zhangsan = new DecoratorB(zhangsan);
        zhangsan.Operation();

        System.out.println("==========分割线==============");

        // 对像链
        Person lisi = new DecoratorB(new DecoratorA(new Student("李四")));
        lisi.Operation();

    }
}
