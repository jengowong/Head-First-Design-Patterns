package com.github.jengo.dp.hf.command.party;

public class RemoteLoader {

    public static void main(String[] args) {
        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");
        TV tv = new TV("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOnCmd = new LightOnCommand(light);
        LightOffCommand lightOffCmd = new LightOffCommand(light);
        StereoOnCommand stereoOnCmd = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCmd = new StereoOffCommand(stereo);
        TVOnCommand tvOnCmd = new TVOnCommand(tv);
        TVOffCommand tvOffCmd = new TVOffCommand(tv);
        HottubOnCommand hottubOnCmd = new HottubOnCommand(hottub);
        HottubOffCommand hottubOffCmd = new HottubOffCommand(hottub);

        Command[] partyOnCmds = {lightOnCmd, stereoOnCmd, tvOnCmd, hottubOnCmd};
        Command[] partyOffCmds = {lightOffCmd, stereoOffCmd, tvOffCmd, hottubOffCmd};

        MacroCommand partyOnMacroCmd = new MacroCommand(partyOnCmds);
        MacroCommand partyOffMacroCmd = new MacroCommand(partyOffCmds);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, partyOnMacroCmd, partyOffMacroCmd);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }

}
