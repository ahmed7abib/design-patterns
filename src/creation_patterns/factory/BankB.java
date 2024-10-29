package creation_patterns.factory;

public class BankB implements IBank {

    @Override
    public void withDraw() {
        System.out.println("Withdraw from bank B");
    }
}
