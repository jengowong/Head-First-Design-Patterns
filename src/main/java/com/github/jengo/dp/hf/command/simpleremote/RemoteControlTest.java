package com.github.jengo.dp.hf.command.simpleremote;

public class RemoteControlTest {

    public static void main(String[] args) {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCmd = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpenCmd = new GarageDoorOpenCommand(garageDoor);

        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setCommand(lightOnCmd);
        remote.buttonWasPressed();
        remote.setCommand(garageOpenCmd);
        remote.buttonWasPressed();
    }

}
