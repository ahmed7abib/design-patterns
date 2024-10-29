package creation_patterns.factory;

public class BankFactory implements IBankFactory {

    @Override
    public IBank getBank(String bankCode) throws Exception {
        if (bankCode.startsWith("545")) {
            return new BankA();
        } else if (bankCode.startsWith("423")) {
            return new BankB();
        } else if (bankCode.startsWith("1010")) {
            return new BankC();
        } else {
            throw new Exception("Invalid bank code!");
        }
    }
}