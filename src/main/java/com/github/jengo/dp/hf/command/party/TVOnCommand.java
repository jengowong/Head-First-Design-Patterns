package com.github.jengo.dp.hf.command.party;

public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.on();
        this.tv.setInputChannel();
    }

    public void undo() {
        this.tv.off();
    }

}
