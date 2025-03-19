package com.byone421.templatemethod.heafirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 角色：抽象类（Abstract Class）
 */
public abstract class CoffeineBeverage {

    /** 模板方法： 准备配方
     * 模板方法顶一个一个算法的步骤，并允许子类为一个或者多个步骤提供实现。
     */
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        //添加调料做成可选的
        if(customerWantsCondiments()){
            addCondiments();
        }

    }

    /**
     * 角色：普通方法
     */
    void  boilWater(){
        System.out.println("boilWater");
    }
    /**
     * 角色：普通方法
     */
    void  pourInCup(){
        System.out.println("pourInCup");
    }

    /**
     * 抽象方法
     */
    abstract void brew();

    /**
     * 抽象方法
     */
    abstract void addCondiments();

    /**
     * 角色：钩子方法
     * @return
     */
    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("would you like milk and sugar with your coffee (y/n)?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return answer;

    }
}
