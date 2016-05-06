package headfirst.designpatterns.observer.weatherobservable;

import java.util.Observable;

/**
 * 主题(被观察者)具体类：天气数据
 */
public class WeatherData extends Observable {

    /** 温度 */
    private float temperature;
    /** 湿度 */
    private float humidity;
    /** 气压 */
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
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
