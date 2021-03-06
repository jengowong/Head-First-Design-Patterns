package com.github.jengo.dp.hf.command.remote;

/**
 * 车库门
 */
public class GarageDoor {
    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(this.location + " garage Door is Up");
    }

    public void down() {
        System.out.println(this.location + " garage Door is Down");
    }

    public void stop() {
        System.out.println(this.location + " garage Door is Stopped");
    }

    public void lightOn() {
        System.out.println(this.location + " garage light is on");
    }

    public void lightOff() {
        System.out.println(this.location + " garage light is off");
    }

}
