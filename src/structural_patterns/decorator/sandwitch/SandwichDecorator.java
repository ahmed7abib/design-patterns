package structural_patterns.decorator.sandwitch;

public class SandwichDecorator implements Sandwich {

    private final Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDesc() {
        return sandwich.getDesc();
    }

    @Override
    public double getCost() {
        return sandwich.getCost();
    }
}
