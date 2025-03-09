package com.byone421.templatemethod.heafirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CoffeineBeverage {

    /**
     * 准备配方 这是一个模板方法
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

    void  boilWater(){
        System.out.println("boilWater");
    }
    void  pourInCup(){
        System.out.println("pourInCup");
    }

    abstract void brew();

    abstract void addCondiments();

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
