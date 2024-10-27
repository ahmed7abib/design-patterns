package creational_patterns.factory;

public interface IBankFactory {
    IBank create(String creditNumber) throws Exception;
}