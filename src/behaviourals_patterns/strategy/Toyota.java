package behaviourals_patterns.strategy;

public class Toyota implements StrategyAlgo {

    @Override
    public void perform() {
        System.out.println("Perform Toyota disassemble algorithm.");
    }
}
