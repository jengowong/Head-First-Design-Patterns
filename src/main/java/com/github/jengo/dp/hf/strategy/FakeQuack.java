package com.github.jengo.dp.hf.strategy;

/**
 * 具体类：假鸭
 */
public class FakeQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Qwak");
    }

}
