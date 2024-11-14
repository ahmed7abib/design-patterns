package behaviourals_patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class NozhaTower implements AirPortTower {

    private boolean acceptForLanding = true;
    private final List<AirCraft> registeredAirCraftList = new ArrayList<>();

    @Override
    public void registerAirCraft(AirCraft airCraft) {
        registeredAirCraftList.add(airCraft);
    }

    @Override
    public void requestForLand(AirCraft airCraft) {
        if (acceptForLanding) {
            acceptForLanding = false;
            airCraft.notify("Ok .. You can land now.");
            registeredAirCraftList.forEach(it -> it.notify("The AirCraft : " + airCraft.getAirPlaneName() + " will land soon."));
        } else {
            airCraft.notify("Please wait for landing another airplane!");
        }
    }

    @Override
    public void landingCompleted() {
        acceptForLanding = true;
        registeredAirCraftList.forEach(it -> it.notify("The Terminal is empty. you can request for landing now!"));
    }
}