package com.byone421.visitor.zst;

public class Student extends Person{
    private int score;
    public Student(String name,int age,int score){
        super(name,age);
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.vistStudent(this);
    }
}
