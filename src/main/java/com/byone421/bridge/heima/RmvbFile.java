package com.byone421.bridge.heima;

public class RmvbFile implements VideoFile{
    @Override
    public void decodeFile(String fileName) {
        System.out.println("RmvbFile:" + fileName);
    }
}
