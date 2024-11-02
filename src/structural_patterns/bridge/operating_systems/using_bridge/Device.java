package structural_patterns.bridge.operating_systems.using_bridge;

public abstract class Device {

    private final OperatingSystem operatingSystem;

    public Device(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    public abstract void start();

    public abstract void shutDown();

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }
}
