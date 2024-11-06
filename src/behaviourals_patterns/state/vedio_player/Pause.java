package behaviourals_patterns.state.vedio_player;

public class Pause implements VideoStates {

    @Override
    public void handleState(VideoPlayer player) {
        System.out.println("Video paused.");
        player.setNextState(new Ready());
    }
}