package com.github.jengo.dp.hf.strategy;

/**
 * 具体类：火箭飞
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }

}
