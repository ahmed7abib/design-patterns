package structural_patterns.facade;


import structural_patterns.facade.subSystem.*;

public class MoviePlayerFacade {

    private final Amplifier amplifier = new Amplifier();
    private final StreamingPlayer streamingPlayer = new StreamingPlayer();
    private final Projector projector = new Projector();
    private final TheaterLight theaterLight = new TheaterLight();
    private final Screen screen = new Screen();
    private final PopCornPopper popCornPopper = new PopCornPopper();

    public void playMovie(String movieName) {
        popCornPopper.on();
        popCornPopper.pop();

        theaterLight.dim();
        screen.down();

        projector.on();
        projector.wideScreen();

        amplifier.on();
        amplifier.setVolume();
        amplifier.setStreamingPlayer(streamingPlayer);

        streamingPlayer.on();
        streamingPlayer.play(movieName);
    }
}
