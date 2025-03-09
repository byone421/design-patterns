package com.byone421.observer.headfirst;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        //天气数据改变，通知观察者
        weatherData.setMeasurementsChanged(30f,20f,10f);

        //不想要了，移除观察者
        weatherData.removeObserver(currentConditionsDisplay);

    }
}
