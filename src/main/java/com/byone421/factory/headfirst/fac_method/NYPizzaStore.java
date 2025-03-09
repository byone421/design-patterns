package com.byone421.factory.headfirst.fac_method;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }else  if("veggie".equals(type)){
            return new NYStyleVeggiePizza();
        }


        return null;
    }
}
