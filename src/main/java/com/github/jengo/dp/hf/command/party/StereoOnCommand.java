package com.github.jengo.dp.hf.command.party;

public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        this.stereo.on();
    }

    public void undo() {
        this.stereo.off();
    }

}
