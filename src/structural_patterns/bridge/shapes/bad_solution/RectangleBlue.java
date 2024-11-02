package structural_patterns.bridge.shapes.bad_solution;

public class RectangleBlue implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Rectangle with color blue");
    }
}
