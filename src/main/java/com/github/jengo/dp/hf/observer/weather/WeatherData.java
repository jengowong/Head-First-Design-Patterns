package com.github.jengo.dp.hf.observer.weather;

import java.util.ArrayList;

/**
 * 主题具体类：天气数据
 */
public class WeatherData implements Subject {

    /** 各观察者 */
    private ArrayList<com.github.jengo.dp.hf.observer.weather.Observer> observers;
    /** 温度 */
    private float temperature;
    /** 湿度 */
    private float humidity;
    /** 气压 */
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<com.github.jengo.dp.hf.observer.weather.Observer>();
    }

    @Override
    public void registerObserver(com.github.jengo.dp.hf.observer.weather.Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(com.github.jengo.dp.hf.observer.weather.Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (com.github.jengo.dp.hf.observer.weather.Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
