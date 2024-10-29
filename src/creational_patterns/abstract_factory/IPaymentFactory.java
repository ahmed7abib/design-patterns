package creational_patterns.abstract_factory;

import creational_patterns.factory.IBankFactory;

public interface IPaymentFactory extends IBankFactory {
    ICard getCardData(String cardNumber) throws Exception;
}
