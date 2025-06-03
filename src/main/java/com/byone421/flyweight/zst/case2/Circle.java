package com.byone421.flyweight.zst.case2;

public class Circle extends Shape {

    public Circle(String color){
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("draw a color: " + color + " circle x："+ x + " y：" + y);
    }
}