package creation_patterns.factory_and_abstrat_factory.abstract_factory;

public class MasterCard implements ICard {

    @Override
    public String getCardType() {
        return "MASTER CARD";
    }

    @Override
    public String getProviderInfo() {
        return "Master card provider";
    }
}
