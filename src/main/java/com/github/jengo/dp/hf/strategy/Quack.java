package com.github.jengo.dp.hf.strategy;

/**
 * 具体类：鸭叫
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
