package com.github.jengo.dp.hf.state.gumballstatewinner;

public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}
