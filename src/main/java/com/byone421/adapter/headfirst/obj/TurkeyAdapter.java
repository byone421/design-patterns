package com.byone421.adapter.headfirst.obj;

public class TurkeyAdapter implements Duck{

    private TurKey turKey;

    public TurkeyAdapter(TurKey turKey) {
        this.turKey = turKey;
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            this.turKey.fly();
        }
    }
}
