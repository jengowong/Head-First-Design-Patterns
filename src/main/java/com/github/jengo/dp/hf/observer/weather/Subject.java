package com.github.jengo.dp.hf.observer.weather;

/**
 * 抽象类：主题(被观察者)
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
