package creation_patterns.factory_and_abstrat_factory.factory;

public class BankB implements IBank {

    @Override
    public void withDraw() {
        System.out.println("Withdraw from bank B");
    }
}
