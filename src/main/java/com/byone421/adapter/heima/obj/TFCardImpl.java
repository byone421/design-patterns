package com.byone421.adapter.heima.obj;

/**
 * @version v1.0
 * @ClassName: TFCardImpl
 * @Description: 适配者类
 * @Author: 黑马程序员
 */
public class TFCardImpl implements TFCard {

    public String readTF() {
        String msg = "TFCard read msg ： hello word TFcard";
        return msg;
    }

    public void writeTF(String msg) {
        System.out.println("TFCard write msg :" + msg);
    }
}
