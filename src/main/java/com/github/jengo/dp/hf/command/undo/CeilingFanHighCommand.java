package com.github.jengo.dp.hf.command.undo;

public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.high();
    }

    @Override
    public void undo() {
        if (CeilingFan.HIGH == this.prevSpeed) {
            this.ceilingFan.high();
        } else if (CeilingFan.MEDIUM == this.prevSpeed) {
            this.ceilingFan.medium();
        } else if (CeilingFan.LOW == this.prevSpeed) {
            this.ceilingFan.low();
        } else if (CeilingFan.OFF == this.prevSpeed) {
            this.ceilingFan.off();
        }
    }

}
