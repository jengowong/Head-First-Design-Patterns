package com.github.jengo.dp.hf.command.undo;

/**
 * 调光器
 */
public class DimmerLightOnCommand implements Command {

    private Light light;
    private int prevLevel;

    public DimmerLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.prevLevel = this.light.getLevel();
        this.light.dim(75);
    }

    public void undo() {
        this.light.dim(this.prevLevel);
    }

}
