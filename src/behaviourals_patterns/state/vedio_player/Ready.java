package behaviourals_patterns.state.vedio_player;

public class Ready implements VideoStates {

    @Override
    public void handleState(VideoPlayer player) {
        System.out.println("Video ready.");
        player.setNextState(new Play());
    }
}
