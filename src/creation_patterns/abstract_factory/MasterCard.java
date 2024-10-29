package creation_patterns.abstract_factory;

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
