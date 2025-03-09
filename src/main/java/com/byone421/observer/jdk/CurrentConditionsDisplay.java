package com.byone421.observer.jdk;


import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay  implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;


    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度：" + temperature);
        System.out.println("当前气压：" + pressure);
        System.out.println("当前湿度：" + humidity);

    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData o1 = (WeatherData) o;
            this.pressure = o1.getPressure();
            this.humidity = o1.getHumidity();
            this.temperature = o1.getTemperature();
            display();
        }
    }
}
