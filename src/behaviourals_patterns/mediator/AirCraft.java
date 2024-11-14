package behaviourals_patterns.mediator;

public interface AirCraft {

    void requestForLand();

    void notify(String message);

    String getAirPlaneName();
}
