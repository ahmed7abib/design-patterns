package structural_patterns.decorator.sandwitch;

public class BasicSandwich implements Sandwich {

    @Override
    public String getDesc() {
        return "Basic Sandwich";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
