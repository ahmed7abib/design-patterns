package behaviourals_patterns.mediator;

public class AirPlaneThree implements AirCraft {

    private final AirPortTower airPortTower;

    public AirPlaneThree(AirPortTower airPortTower) {
        this.airPortTower = airPortTower;
    }

    @Override
    public void requestForLand() {
        airPortTower.requestForLand(this);
    }

    @Override
    public void notify(String message) {
        System.out.println(message);
    }

    @Override
    public String getAirPlaneName() {
        return "AirPlaneThree";
    }
}