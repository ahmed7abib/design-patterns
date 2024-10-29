package structural_patterns.flyWeight;

public class ItemDiscount implements IDiscount {

    @Override
    public double calcDiscount(String date, String itemId) {
        // First get item by its it from database,
        // then return its discount. say its discount = 25%.
        return 0.25;
    }
}