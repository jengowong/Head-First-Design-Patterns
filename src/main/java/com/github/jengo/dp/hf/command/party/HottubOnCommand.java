package com.github.jengo.dp.hf.command.party;

public class HottubOnCommand implements Command {
    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        this.hottub.on();
        this.hottub.setTemperature(104);
        this.hottub.circulate();
    }

    @Override
    public void undo() {
        this.hottub.off();
    }

}
