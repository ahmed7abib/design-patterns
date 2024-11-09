package behaviourals_patterns.command.receiver;

public class TVReceiver implements IReceiver {

    @Override
    public void turnOn() {
        System.out.println("TV turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned off.");
    }
}
