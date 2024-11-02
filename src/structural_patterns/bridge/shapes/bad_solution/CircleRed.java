package structural_patterns.bridge.shapes.bad_solution;

public class CircleRed implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Circle with color red");
    }
}
