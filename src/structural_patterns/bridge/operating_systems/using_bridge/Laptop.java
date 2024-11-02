package structural_patterns.bridge.operating_systems.using_bridge;

public class Laptop extends Device {

    public Laptop(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void start() {
        System.out.println("Laptop will start ");
        super.getOperatingSystem().start();
    }

    @Override
    public void shutDown() {
        System.out.println("Laptop will shutdown ");
        super.getOperatingSystem().shutDown();
    }
}
