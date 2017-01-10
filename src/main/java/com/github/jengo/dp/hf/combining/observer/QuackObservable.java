package com.github.jengo.dp.hf.combining.observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}
