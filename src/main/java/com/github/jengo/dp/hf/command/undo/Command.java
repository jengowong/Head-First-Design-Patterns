package com.github.jengo.dp.hf.command.undo;

public interface Command {
    void execute();

    void undo();
}
