package com.byone421.builder.zst;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.print("产品的组成：");
        for (String part : parts) {
            System.out.print(part + " ");
        }
        System.out.println();
    }
}
