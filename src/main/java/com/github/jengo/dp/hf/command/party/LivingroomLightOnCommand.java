package com.github.jengo.dp.hf.command.party;

public class LivingroomLightOnCommand implements Command {
    private Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.on();
    }

    public void undo() {
        this.light.off();
    }

}
