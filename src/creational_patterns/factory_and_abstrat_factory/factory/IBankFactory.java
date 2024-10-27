package creational_patterns.factory_and_abstrat_factory.factory;

public interface IBankFactory {
    IBank getBank(String bankCode) throws Exception;
}