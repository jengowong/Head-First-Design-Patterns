package com.github.jengo.dp.hf.command.party;

//
// This is the invoker
//
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        this.undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < this.onCommands.length; i++) {
            stringBuff.append("[slot ").append(i).append("] ")
                    .append(this.onCommands[i].getClass().getName())
                    .append("    ")
                    .append(this.offCommands[i].getClass().getName())
                    .append("\n");
        }
        stringBuff.append("[undo] ")
                .append(this.undoCommand.getClass().getName())
                .append("\n");
        return stringBuff.toString();
    }

}
