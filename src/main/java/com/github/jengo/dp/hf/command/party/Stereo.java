package com.github.jengo.dp.hf.command.party;

/**
 * 立体声系统
 */
public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " stereo is on");
    }

    public void off() {
        System.out.println(this.location + " stereo is off");
    }

    public void setCD() {
        System.out.println(this.location + " stereo is set for CD input");
    }

    public void setDVD() {
        System.out.println(this.location + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(this.location + " stereo is set for Radio");
    }

    public void setVolume(int volume) {
        // code to set the volume
        // valid range: 1-11 (after all 11 is better than 10, right?)
        System.out.println(this.location + " Stereo volume set to " + volume);
    }

}
