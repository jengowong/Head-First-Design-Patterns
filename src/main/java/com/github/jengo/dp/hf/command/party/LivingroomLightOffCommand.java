package com.github.jengo.dp.hf.command.party;

public class LivingroomLightOffCommand implements Command {
    private Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();
    }

    public void undo() {
        this.light.on();
    }

}
