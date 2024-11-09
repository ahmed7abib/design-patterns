package behaviourals_patterns.command.command;

import behaviourals_patterns.command.receiver.IReceiver;

public class TurnOffTelevision implements Command {

    private final IReceiver receiver;

    public TurnOffTelevision(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff();
    }

    @Override
    public void undo() {
        receiver.turnOn();
    }
}
