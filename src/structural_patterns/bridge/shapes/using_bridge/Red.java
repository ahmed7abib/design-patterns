package structural_patterns.bridge.shapes.using_bridge;

public class Red implements Color {

    @Override
    public void doColor() {
        System.out.println("Do Color Red");
    }
}
