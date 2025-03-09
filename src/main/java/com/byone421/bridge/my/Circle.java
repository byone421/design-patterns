package com.byone421.bridge.my;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void showShape(String shape) {
        color.show(shape);
    }
}
