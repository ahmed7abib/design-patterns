package creational_patterns.factory;

public class BankFactory implements IBankFactory {

    @Override
    public IBank create(String creditNumber) throws Exception {
        if (creditNumber.startsWith("545")) {
            return new BankA();
        } else if (creditNumber.startsWith("423")) {
            return new BankB();
        } else if (creditNumber.startsWith("1010")) {
            return new BankC();
        } else {
            throw new Exception("Invalid credit card number!");
        }
    }
}