package com.github.jengo.dp.hf.command.simpleremoteWL;

public class RemoteControlTest {

    public static void main(String[] args) {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        SimpleRemoteControl remote = new SimpleRemoteControl();
        //remote.setCommand(light::on);
        remote.buttonWasPressed();
        //remote.setCommand(garageDoor::up);
        remote.buttonWasPressed();
        //remote.setCommand(garageDoor::lightOn);
        remote.buttonWasPressed();
        //remote.setCommand(garageDoor::lightOff);
        remote.buttonWasPressed();
    }

}
