package com.byone421.observer.jdk;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurementsChanged(3,23,22);
        weatherData.deleteObserver(currentConditionsDisplay);
    }
}
