package com.github.jengo.dp.hf.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者具体类：当前条件展示
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    /** 主题引用 */
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}
