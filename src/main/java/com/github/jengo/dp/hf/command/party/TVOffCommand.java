package com.github.jengo.dp.hf.command.party;

public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.off();
    }

    public void undo() {
        this.tv.on();
    }

}
