package com.byone421.prototype.heima.demo1;

public class RealizeType implements Cloneable{

    private int age;
    private String name;

    private User user;

    public RealizeType(int age, String name, User user) {
        this.age = age;
        this.name = name;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RealizeType(String name, int age) {
        this.age = age;
        this.name = name;
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType)super.clone();
    }
}
