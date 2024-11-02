package structural_patterns.bridge.operating_systems.using_bridge;

public class Android implements OperatingSystem {

    @Override
    public void start() {
        System.out.println("Start android");
    }

    @Override
    public void shutDown() {
        System.out.println("shutdown android");
    }
}
