package com.byone421.bridge.my;

public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void showShape(String shape) {
        color.show(shape);
    }
}
