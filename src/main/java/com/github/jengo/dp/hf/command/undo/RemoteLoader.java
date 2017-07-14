package com.github.jengo.dp.hf.command.undo;

public class RemoteLoader {

    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOnCmd = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCmd = new LightOffCommand(livingRoomLight);

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        remoteControl.setCommand(0, livingRoomLightOnCmd, livingRoomLightOffCmd);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMediumCmd = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCmd = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCmd = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMediumCmd, ceilingFanOffCmd);
        remoteControl.setCommand(1, ceilingFanHighCmd, ceilingFanOffCmd);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
    }

}
