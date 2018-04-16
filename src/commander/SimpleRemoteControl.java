package commander;

public class SimpleRemoteControl {
    private Command slot1;

    public void setCommand(Command command) {
        slot1 = command;
    }

    public void buttonPressed() {
        slot1.execute();
    }
}
