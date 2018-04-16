package commander;

public class MarcoCommand implements Command{
    Command[] commands;

    public MarcoCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command each: commands) {
            each.execute();
        }
    }

    @Override
    public void undo() {
        for (int i = commands.length-1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}
