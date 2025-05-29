package com.byone421.memento.zst;

public class Memento {//备忘录
    private String state;

    public String getState(){
        return state;
    }

    public Memento(String state){
        this.state = state;
    }
}
