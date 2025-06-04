package com.byone421.responsibility.zst;

public abstract  class Handler {
    protected Handler next;

    public void setNext(Handler next){
        this.next =next;
    }

    public abstract void HandRequest(int request);
}
