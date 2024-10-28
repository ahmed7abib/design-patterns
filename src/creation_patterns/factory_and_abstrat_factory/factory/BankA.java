package creation_patterns.factory_and_abstrat_factory.factory;

public class BankA implements IBank {

    @Override
    public void withDraw() {
        System.out.println("Withdraw from bank A");
    }
}
