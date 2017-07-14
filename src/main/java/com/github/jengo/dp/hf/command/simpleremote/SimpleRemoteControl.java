package com.github.jengo.dp.hf.command.simpleremote;

//
// This is the invoker
//
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        this.slot.execute();
    }

}
