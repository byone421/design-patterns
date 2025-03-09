package com.byone421.bridge.my;

public class Client {
    public static void main(String[] args) {
        Shape shape  = new Rectangle(new Red());
        shape.showShape("Rectangle");
    }
}
