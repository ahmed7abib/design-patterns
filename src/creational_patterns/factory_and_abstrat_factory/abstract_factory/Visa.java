package creational_patterns.factory_and_abstrat_factory.abstract_factory;

public class Visa implements ICard {

    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getProviderInfo() {
        return "Visa provider.";
    }
}
