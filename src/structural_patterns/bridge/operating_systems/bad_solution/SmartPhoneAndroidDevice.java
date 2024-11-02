package structural_patterns.bridge.operating_systems.bad_solution;

public class SmartPhoneAndroidDevice implements Device {

    @Override
    public void start() {
        System.out.println("Smart phone will start with android ops");
    }

    @Override
    public void shutdown() {
        System.out.println("Smart phone will shutdown with android ops");
    }
}
