package creation_patterns.abstract_factory;

import creation_patterns.factory.BankA;
import creation_patterns.factory.BankB;
import creation_patterns.factory.BankC;
import creation_patterns.factory.IBank;

public class PaymentFactory implements IPaymentFactory {

    @Override
    public ICard getCardData(String cardNumber) throws Exception {
        if (cardNumber.startsWith("123456")) {
            return new Visa();
        } else if (cardNumber.startsWith("67890")) {
            return new MasterCard();
        } else {
            throw new Exception("Invalid credit card number!");
        }
    }

    @Override
    public IBank getBank(String bankCode) throws Exception {
        if (bankCode.startsWith("123")) {
            return new BankA();
        } else if (bankCode.startsWith("678")) {
            return new BankB();
        } else if (bankCode.startsWith("890")) {
            return new BankC();
        } else {
            throw new Exception("Invalid bank code!");
        }
    }
}
