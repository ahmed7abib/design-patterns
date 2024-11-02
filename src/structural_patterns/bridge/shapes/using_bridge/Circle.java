package structural_patterns.bridge.shapes.using_bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle with color: ");
        super.getColor().doColor();
    }
}
