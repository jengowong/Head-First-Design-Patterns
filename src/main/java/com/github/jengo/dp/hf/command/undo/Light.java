package com.github.jengo.dp.hf.command.undo;

/**
 * 灯
 */
public class Light {

    private String location;
    private int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        this.level = 100;
        System.out.println("Light is on");
    }

    public void off() {
        this.level = 0;
        System.out.println("Light is off");
    }

    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            System.out.println("Light is dimmed to " + level + "%");
        }
    }

    public int getLevel() {
        return this.level;
    }

}
