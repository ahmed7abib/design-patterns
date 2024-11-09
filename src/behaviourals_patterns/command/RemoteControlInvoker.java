package behaviourals_patterns.command;

import behaviourals_patterns.command.command.Command;

public class RemoteControlInvoker {

    private Command lastCommand;

    public void setLastCommand(Command lastCommand) {
        this.lastCommand = lastCommand;
    }

    public void buttonPressed() {
        if (lastCommand != null) {
            lastCommand.execute();
        }
    }

    public void undo() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}