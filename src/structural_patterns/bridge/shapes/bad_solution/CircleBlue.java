package structural_patterns.bridge.shapes.bad_solution;

public class CircleBlue implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Circle with color blue");
    }
}
