package com.byone421.bridge.heima;

public class AviFile implements VideoFile{
    @Override
    public void decodeFile(String fileName) {
        System.out.println("AviFile:" + fileName);
    }
}
