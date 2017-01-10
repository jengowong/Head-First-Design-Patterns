package com.github.jengo.dp.hf.command.simpleremoteWL;

//
// This is the invoker
//
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
