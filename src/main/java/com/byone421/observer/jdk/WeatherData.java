package com.byone421.observer.jdk;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurementsChanged(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }

    private void measurementsChanged() {
        setChanged();
        //调用无参的方法让观察者自己调用get拉取自己想要的数据
        notifyObservers();
        //调用有参的方法主动把所有数据传给观察者
//        notifyObservers(xxxObj);
    }



}
