package structural_patterns.flyWeight;

public class DayDiscount implements IDiscount {

    @Override
    public double calcDiscount(String date, String itemId) {
        // get discount by date,
        // and return it.
        // say the day discount = 50%.
        return 0.5;
    }
}
