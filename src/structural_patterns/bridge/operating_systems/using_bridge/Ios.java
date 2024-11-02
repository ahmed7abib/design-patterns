package structural_patterns.bridge.operating_systems.using_bridge;

public class Ios implements OperatingSystem {

    @Override
    public void start() {
        System.out.println("Start IOS");
    }

    @Override
    public void shutDown() {
        System.out.println("shutdown IOS");
    }
}
