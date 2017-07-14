package com.github.jengo.dp.hf.command.undo;

public class LightOnCommand implements Command {

    private Light light;
    private int level;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.level = this.light.getLevel();
        this.light.on();
    }

    public void undo() {
        this.light.dim(this.level);
    }

}
