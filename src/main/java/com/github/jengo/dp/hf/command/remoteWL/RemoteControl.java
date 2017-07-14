package com.github.jengo.dp.hf.command.remoteWL;

//
// This is the invoker
//
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        for (int i = 0; i < 7; i++) {
            //onCommands[i] = () -> { };
            //offCommands[i] = () -> { };
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
    }

    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("    ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return stringBuff.toString();
    }

}
