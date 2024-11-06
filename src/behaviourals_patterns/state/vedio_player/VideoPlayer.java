package behaviourals_patterns.state.vedio_player;

public class VideoPlayer {
    private VideoStates videoStates;

    public VideoPlayer() {
        setNextState(new Ready());
    }

    public void setNextState(VideoStates nextState) {
        this.videoStates = nextState;
    }

    public void processVideo() {
        videoStates.handleState(this);
    }
}