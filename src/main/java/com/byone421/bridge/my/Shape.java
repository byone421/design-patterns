package com.byone421.bridge.my;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void showShape(String fileName);
}
