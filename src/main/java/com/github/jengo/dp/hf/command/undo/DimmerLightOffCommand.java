package com.github.jengo.dp.hf.command.undo;

public class DimmerLightOffCommand implements Command {

    private Light light;
    private int prevLevel;

    public DimmerLightOffCommand(Light light) {
        this.light = light;
        this.prevLevel = 100;
    }

    public void execute() {
        this.prevLevel = this.light.getLevel();
        this.light.off();
    }

    public void undo() {
        this.light.dim(this.prevLevel);
    }

}
