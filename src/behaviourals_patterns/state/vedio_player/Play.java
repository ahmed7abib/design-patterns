package behaviourals_patterns.state.vedio_player;

public class Play implements VideoStates {

    @Override
    public void handleState(VideoPlayer player) {
        System.out.println("Video played.");
        player.setNextState(new Pause());
    }
}
