package com.github.jengo.dp.hf.strategy;

/**
 * 具体类：吱吱叫
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}
