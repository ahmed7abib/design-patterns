package creation_patterns.factory;

public class BankC implements IBank {

    @Override
    public void withDraw() {
        System.out.println("Withdraw from bank C");
    }
}