package com.byone421.templatemethod.zst;

/**
 * 模板方法：
 *  意图：定一个一个算法的骨架，而将一些步骤延迟到子类当中。。Template Method 使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *  适用性:
 *      -  一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
 *      -  各子类中公共的行为应被提取出来并集中到一个公共父类中，以避免代码重复。
 *      -  控制子类扩展：模板方法在特定点调用“hook”操作(默认行为，子类可以在必要时进行重定义扩展)，这就只允许在这些点进行扩展。
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        // 父类名 对象名 = new 子类名();

        Person student = new Student();
        Person teacher = new Teacher();

        student.TemplateMethod();

        System.out.println("=========分割线=============");

        teacher.TemplateMethod();
    }
}
