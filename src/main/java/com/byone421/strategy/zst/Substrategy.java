package com.byone421.strategy.zst;

public class Substrategy implements Strategy{
    @Override
    public void TwoNumberOperation(int a, int b) {
        System.out.println(a - b);
    }
}
