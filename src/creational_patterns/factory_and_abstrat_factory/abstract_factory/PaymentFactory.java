package creational_patterns.factory_and_abstrat_factory.abstract_factory;

import creational_patterns.factory_and_abstrat_factory.factory.BankA;
import creational_patterns.factory_and_abstrat_factory.factory.BankB;
import creational_patterns.factory_and_abstrat_factory.factory.BankC;
import creational_patterns.factory_and_abstrat_factory.factory.IBank;

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
