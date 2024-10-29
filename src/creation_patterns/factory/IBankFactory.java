package creation_patterns.factory;

public interface IBankFactory {
    IBank getBank(String bankCode) throws Exception;
}