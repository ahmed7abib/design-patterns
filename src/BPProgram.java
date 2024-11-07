import static behaviourals_patterns.BehaviouralPatterns.*;

public class BPProgram {

    public static void main(String[] args) {

        System.out.println("\n-------------- Chain Of Responsibility ---------\n");
        coRDemo();

        System.out.println("\n-------------- Observer Pattern ----------------\n");
        observerDemo();

        System.out.println("\n-------------- Strategy Pattern ----------------\n");
        strategyDemo();

        System.out.println("\n-------------- State Pattern -------------------\n");
        stateDemo();
    }
}