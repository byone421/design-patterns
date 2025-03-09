package com.byone421.decorator.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Client {
    public static void main(String[] args) throws Exception{
        int c;
        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("d:\\test.txt")));
        while ((c=in.read())>=0){
            System.out.println((char)c);
        }
        in.close();
    }
}
