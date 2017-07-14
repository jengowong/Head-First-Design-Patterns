package com.github.jengo.dp.hf.command.remote;

public class LivingroomLightOffCommand implements Command {
    private Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

}
