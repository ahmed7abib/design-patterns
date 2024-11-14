package behaviourals_patterns.mediator;

public class AirPlaneOne implements AirCraft {

    private final AirPortTower airPortTower;

    public AirPlaneOne(AirPortTower airPortTower) {
        this.airPortTower = airPortTower;
        airPortTower.registerAirCraft(this);
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
        return "AirPlaneOne";
    }
}