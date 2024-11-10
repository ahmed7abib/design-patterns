package behaviourals_patterns.command;

import behaviourals_patterns.command.command.Command;

public class RemoteControlInvoker {

    private Command lastCommand;

    public void buttonPressed(Command command) {
        this.lastCommand = command;
        command.execute();
    }

    public void undo() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}