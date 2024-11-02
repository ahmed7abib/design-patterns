package structural_patterns.bridge.operating_systems.using_bridge;

public class Windows implements OperatingSystem {

    @Override
    public void start() {
        System.out.println("Start windows");
    }

    @Override
    public void shutDown() {
        System.out.println("shutdown windows");
    }
}
