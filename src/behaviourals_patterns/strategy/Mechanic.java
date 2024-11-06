package behaviourals_patterns.strategy;

public class Mechanic {

    private StrategyAlgo strategyAlgo;

    public void setStrategyAlgo(StrategyAlgo strategyAlgo) {
        this.strategyAlgo = strategyAlgo;
    }

    public void disassembleCar() {
        strategyAlgo.perform();
    }
}
