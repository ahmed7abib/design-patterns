package structural_patterns.flyWeight;

import java.util.HashMap;

public class DiscountFactory implements IDiscountFactory {

    private final static HashMap<DiscountType, IDiscount> map = new HashMap<>();

    @Override
    public IDiscount getDiscountInstance(DiscountType discountType) throws ClassNotFoundException {

        if (map.containsKey(discountType)) {
            System.out.println("Found.");
            return map.get(discountType);
        } else {
            switch (discountType) {
                case DAY -> {
                    IDiscount discount = new DayDiscount();
                    map.put(discountType, discount);
                    return discount;
                }

                case ITEM -> {
                    IDiscount discount = new ItemDiscount();
                    map.put(discountType, discount);
                    return discount;
                }

                default -> throw new ClassNotFoundException();
            }
        }
    }
}
