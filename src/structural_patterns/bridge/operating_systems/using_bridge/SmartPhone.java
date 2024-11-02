package structural_patterns.bridge.operating_systems.using_bridge;

public class SmartPhone extends Device {

    public SmartPhone(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void start() {
        System.out.println("Smart phone will start ");
        super.getOperatingSystem().start();
    }

    @Override
    public void shutDown() {
        System.out.println("Smart phone will shutdown ");
        super.getOperatingSystem().shutDown();
    }
}
