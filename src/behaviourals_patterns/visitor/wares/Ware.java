package behaviourals_patterns.visitor.wares;

import behaviourals_patterns.visitor.Tax;

import java.util.List;

public abstract class Ware {

    private double price;

    public Ware(double price) {
        this.price = price;
    }

    public void editPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract void addWareTax(Tax tax);

    public abstract void addTaxList(List<Tax> tax);
}