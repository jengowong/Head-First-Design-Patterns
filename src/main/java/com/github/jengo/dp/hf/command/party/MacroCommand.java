package com.github.jengo.dp.hf.command.party;

public class MacroCommand implements Command {
    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < this.commands.length; i++) {
            this.commands[i].execute();
        }
    }

    /**
     * NOTE: these commands have to be done backwards to ensure proper undo functionality
     */
    public void undo() {
        for (int i = this.commands.length - 1; i >= 0; i--) {
            this.commands[i].undo();
        }
    }

}
