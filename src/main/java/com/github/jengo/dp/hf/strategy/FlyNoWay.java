package com.github.jengo.dp.hf.strategy;

/**
 * 具体类：不会飞
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
