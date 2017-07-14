package com.github.jengo.dp.hf.command.remote;

public class HottubOnCommand implements Command {
    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        this.hottub.on();
        this.hottub.heat();
        this.hottub.bubblesOn();
    }

}
