package com.byone421.prototype.heima.demo1;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("user");
        RealizeType realizeType = new RealizeType(1,"a",user);
        RealizeType clone = realizeType.clone();

        System.out.println("原对象和clone对象是否相等：" + (realizeType == clone));
        System.out.println("clone对象的name：" + clone.getName());
        System.out.println("clone对象的age：" + clone.getAge());
        System.out.println("两个user是否相等："+ (user == clone.getUser()));
    }
}
