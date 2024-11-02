package structural_patterns.bridge.shapes.using_bridge;

public abstract class Shape {

    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

    public Color getColor() {
        return color;
    }
}
