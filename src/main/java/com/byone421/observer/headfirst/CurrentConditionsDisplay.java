package com.byone421.observer.headfirst;

public class CurrentConditionsDisplay implements DisplayElement,Observer{
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject subject;

    public CurrentConditionsDisplay(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度：" + temperature );
        System.out.println("当前湿度：" + humidity );
        System.out.println("当前气压：" + pressure );
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}