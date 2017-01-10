package com.github.jengo.dp.hf.combining.decorator;

public class DuckCall implements Quackable {

    public void quack() {
        System.out.println("Kwak");
    }

    public String toString() {
        return "Duck Call";
    }
}
