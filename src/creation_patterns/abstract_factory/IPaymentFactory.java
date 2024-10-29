package creation_patterns.abstract_factory;

import creation_patterns.factory.IBankFactory;

public interface IPaymentFactory extends IBankFactory {
    ICard getCardData(String cardNumber) throws Exception;
}
