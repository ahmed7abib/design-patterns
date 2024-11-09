package behaviourals_patterns.command.command;

import behaviourals_patterns.command.receiver.IReceiver;

public class TurnOnTelevision implements Command {

    private final IReceiver receiver;

    public TurnOnTelevision(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOn();
    }

    @Override
    public void undo() {
        receiver.turnOff();
    }
}
