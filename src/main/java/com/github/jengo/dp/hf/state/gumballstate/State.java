package com.github.jengo.dp.hf.state.gumballstate;

/**
 * 状态接口
 */
public interface State {
    /** 投入25美分 */
    void insertQuarter();

    /** 退回25美分 */
    void ejectQuarter();

    /** 转动曲柄 */
    void turnCrank();

    /** 发放糖果 */
    void dispense();

    /** 装满糖果 */
    void refill();
}
