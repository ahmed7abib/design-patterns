package structural_patterns.bridge.shapes.using_bridge;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle with color: ");
        super.getColor().doColor();
    }
}
