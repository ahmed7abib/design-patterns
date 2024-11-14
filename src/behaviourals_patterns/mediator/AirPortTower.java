package behaviourals_patterns.mediator;

public interface AirPortTower {

    void requestForLand(AirCraft airCraft);

    void registerAirCraft(AirCraft airCraft);

    void landingCompleted();
}
