package com.github.jengo.dp.hf.command.remote;

public class LivingroomLightOnCommand implements Command {
    private Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

}
