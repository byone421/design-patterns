package com.byone421.adapter.zst.obj;


/**
 * 适配器：(对象适配器)
 *   意图：将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *   适用性：
 *      - 想使用一个已经存在的类，而它的接口不符合要求。
 *      - 想创建一个可以服用的类，该类可以与其他不相关的类或不可预见的类（即那些接口可能不一定兼容的类)协同工作。（了解）
 *      - (仅适用于对象Adapter)想使用一个已经存在的子类，但是不可能对每一个都进行子类化以匹配它们的接口。对象适配器可以适配它的父类接口。（了解）
 */
public class AdapterPattern {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.Request();
    }

}
