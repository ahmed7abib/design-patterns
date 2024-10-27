package creational_patterns.factory_and_abstrat_factory.factory;

public class BankC implements IBank {

    @Override
    public void withDraw() {
        System.out.println("Withdraw from bank C");
    }
}