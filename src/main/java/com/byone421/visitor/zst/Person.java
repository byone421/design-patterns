package com.byone421.visitor.zst;

public abstract class Person {
    private String name;
    private int age;


    public Person(String  name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void Accept(Visitor visitor);
}
