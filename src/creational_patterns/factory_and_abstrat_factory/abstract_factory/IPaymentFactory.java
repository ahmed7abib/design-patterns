package creational_patterns.factory_and_abstrat_factory.abstract_factory;

import creational_patterns.factory_and_abstrat_factory.factory.IBankFactory;

public interface IPaymentFactory extends IBankFactory {
    ICard getCardData(String cardNumber) throws Exception;
}
