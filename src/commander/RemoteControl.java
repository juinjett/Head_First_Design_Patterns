package commander;

import java.util.Arrays;

public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;
    Command undoCommand;

    public RemoteControl() {
        onCommand = new Command[3];
        offCommand = new Command[3];
        Command noCommand = new NoCommand();
        Arrays.fill(onCommand, noCommand);
        Arrays.fill(offCommand, noCommand);
        undoCommand = noCommand;
    }

    public void setCommand(int idx, Command on, Command off) {
        onCommand[idx] = on;
        offCommand[idx] = off;
    }

    public void onButtonPressed(int idx) {
        System.out.println("---- On Button is pressed ----");
        onCommand[idx].execute();
        undoCommand = onCommand[idx];
    }

    public void offButtonPressed(int idx) {
        System.out.println("---- Off Button is pressed ----");
        offCommand[idx].execute();
        undoCommand = offCommand[idx];
    }

    public void undoButtonPressed() {
        System.out.println("---- Undo is pressed ----");
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommand.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommand[i].getClass().getName()
                    + "    " + offCommand[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }

}
