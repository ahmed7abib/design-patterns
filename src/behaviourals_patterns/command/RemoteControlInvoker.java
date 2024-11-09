package behaviourals_patterns.command;

import behaviourals_patterns.command.command.Command;

public class RemoteControlInvoker {

    public void execute(Command command) {
        command.execute();
    }
}
