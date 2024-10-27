package creational_patterns.factory;

public class BankA implements IBank {

    @Override
    public void withDraw() {
        System.out.println("Withdraw from bank A");
    }
}
