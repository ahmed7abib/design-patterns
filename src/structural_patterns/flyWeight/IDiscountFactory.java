package structural_patterns.flyWeight;

public interface IDiscountFactory {

    IDiscount getDiscountInstance(DiscountType discountType) throws ClassNotFoundException;
}
