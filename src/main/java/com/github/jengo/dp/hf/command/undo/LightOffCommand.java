package com.github.jengo.dp.hf.command.undo;

public class LightOffCommand implements Command {

    private Light light;
    private int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.level = this.light.getLevel();
        this.light.off();
    }

    public void undo() {
        this.light.dim(this.level);
    }

}
