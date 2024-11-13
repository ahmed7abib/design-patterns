package behaviourals_patterns.visitor.wares;

import behaviourals_patterns.visitor.Tax;

import java.util.List;

public class Car extends Ware {

    public Car(double price) {
        super(price);
    }

    @Override
    public void addWareTax(Tax tax) {
        tax.calculateTax(this);
    }

    @Override
    public void addTaxList(List<Tax> tax) {
        tax.forEach(it -> it.calculateTax(this));
    }
}