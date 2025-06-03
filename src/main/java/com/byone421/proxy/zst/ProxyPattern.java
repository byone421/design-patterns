package com.byone421.proxy.zst;

/**
 * 代理模式：
 *  意图：为其他对象提供一种代理以控制对这个对象的访问。
 *  适用性：
 *      Poxy模式适用于在需要比较通用和复杂的对象指针代替简单的指针的时候，常见情况有：
 *      - 远程代理(Remote Proxy)为一个对象在不同地址空间提供局部代表。
 *      - 虚代理(Virtual Proxy)根据需要创建开销很大的对象。
 *      - 保护代理(Protection Proxy)控制对原始对象的访问，用于对象应该有不同的访问权限的时候。
 *      - 智能引用(Smart Reference)取代了简单的指针，它在访问对象时执行一些附加操作。
 *
 */
public class ProxyPattern {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);

        proxy.buy();
    }
}
