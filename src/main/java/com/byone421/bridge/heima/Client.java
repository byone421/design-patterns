package com.byone421.bridge.heima;

public class Client {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new Windows(new AviFile());
        operatingSystem.play("123");
    }
}
