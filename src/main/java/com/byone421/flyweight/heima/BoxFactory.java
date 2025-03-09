package com.byone421.flyweight.heima;

import java.util.HashMap;

/**
 * 单工工建原
 * 代适乔装外享组
 */
public class BoxFactory {
    private static BoxFactory factory = new BoxFactory();

    private HashMap<String,AbstractBox> map;

    //在构造方法中进行初始化操作
    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    public static BoxFactory getInstance() {
        return factory;
    }

    public AbstractBox getShape(String name) {
        return map.get(name);
    }

}
