package structural_patterns.facade.subSystem;

public class StreamingPlayer {

    public void on() {
        System.out.println("Streaming player is on.");
    }

    public void play(String name) {
        System.out.println("Movie name: " + name + " Is playing now. Enjoy!");
    }
}
