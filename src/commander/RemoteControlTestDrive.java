package commander;

public class RemoteControlTestDrive {
    public static void main(String[] args) {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorCloseCommand doorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        StereoOnForCDCommand stereoOnForCDCommand = new StereoOnForCDCommand(stereo);

        Command[] partyOn = {lightOnCommand, doorOpenCommand, stereoOnForCDCommand};
        Command[] partyOff = {lightOffCommand, doorCloseCommand, stereoOffCommand};

        MarcoCommand partyOnMarco = new MarcoCommand(partyOn);
        MarcoCommand partyOffMarco = new MarcoCommand(partyOff);

        RemoteControl control = new RemoteControl();

//        control.setCommand(0, lightOnCommand, lightOffCommand);
//        control.setCommand(1, doorOpenCommand, doorCloseCommand);
//        control.setCommand(2, stereoOnForCDCommand, stereoOffCommand);
        control.setCommand(0, partyOnMarco, partyOffMarco);

        System.out.println(control.toString());

        System.out.println("\n Party On is Pressed");
        control.onButtonPressed(0);
//        control.onButtonPressed(1);
//        control.onButtonPressed(2);

//        System.out.println(control.toString());
        control.undoButtonPressed();

        System.out.println("\n Party On is Pressed");
        control.offButtonPressed(0);
//        System.out.println(control.toString());
        control.undoButtonPressed();
//        control.offButtonPressed(0);
//        control.offButtonPressed(1);
//        control.offButtonPressed(2);

    }
}
