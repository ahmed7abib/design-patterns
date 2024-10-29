package structural_patterns.facade.subSystem;

public class Amplifier {

    public void on() {
        System.out.println("Amplifier is on");
    }

    public void setVolume() {
        System.out.println("Amplifier is working with volume");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println("StreamingPlayer is started.");
    }
}
