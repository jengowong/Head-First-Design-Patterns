package com.github.jengo.dp.hf.command.party;

public class HottubOffCommand implements Command {
    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        this.hottub.setTemperature(98);
        this.hottub.off();
    }

    @Override
    public void undo() {
        this.hottub.on();
    }

}
