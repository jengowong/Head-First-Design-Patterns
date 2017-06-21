package com.github.jengo.dp.hf.state.gumball;

public class GumballMachine {

    /** 状态：售罄 */
    private final static int SOLD_OUT = 0;
    /** 状态：没有25美分 */
    private final static int NO_QUARTER = 1;
    /** 状态：有25美分 */
    private final static int HAS_QUARTER = 2;
    /** 状态：可售 */
    private final static int SOLD = 3;

    /** 当前状态 */
    private int state = SOLD_OUT;
    /** 糖果总数 */
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /** 投入25美分 */
    public void insertQuarter() {
        if (SOLD_OUT == state) {
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (NO_QUARTER == state) {
            System.out.println("You inserted a quarter");
            state = HAS_QUARTER;
        } else if (HAS_QUARTER == state) {
            System.out.println("You can't insert another quarter");
        } else if (SOLD == state) {
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    /** 退回25美分 */
    public void ejectQuarter() {
        if (SOLD_OUT == state) {
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        } else if (NO_QUARTER == state) {
            System.out.println("You haven't inserted a quarter");
        } else if (HAS_QUARTER == state) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (SOLD == state) {
            System.out.println("Sorry, you already turned the crank");
        }
    }

    /** 转动曲柄 */
    public void turnCrank() {
        if (SOLD_OUT == state) {
            System.out.println("You turned, but there are no gumballs");
        } else if (NO_QUARTER == state) {
            System.out.println("You turned, but there's no quarter");
        } else if (HAS_QUARTER == state) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        } else if (SOLD == state) {
            System.out.println("Turning twice doesn't get you another gumball!");
        }
    }

    /** 发放糖果 */
    private void dispense() {
        if (SOLD_OUT == state) {
            System.out.println("No gumball dispensed");
        } else if (NO_QUARTER == state) {
            System.out.println("You need to pay first");
        } else if (HAS_QUARTER == state) {
            System.out.println("No gumball dispensed");
        } else if (SOLD == state) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        }
    }

    /** 装满糖果 */
    public void refill(int numGumBalls) {
        count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: ").append(count).append(" gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }

}
