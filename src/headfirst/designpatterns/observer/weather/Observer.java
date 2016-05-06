package headfirst.designpatterns.observer.weather;

/**
 * 抽象类：观察者
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
