package structural_patterns.decorator.sandwitch;

public class Beef extends SandwichDecorator {

    public Beef(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " Beef";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15.0;
    }
}