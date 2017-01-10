package com.github.jengo.dp.hf.strategy;

/**
 * 具体类：哑巴
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
