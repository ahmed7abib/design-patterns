package behaviourals_patterns.visitor.taxes;

import behaviourals_patterns.visitor.Tax;
import behaviourals_patterns.visitor.wares.Banana;
import behaviourals_patterns.visitor.wares.Car;
import behaviourals_patterns.visitor.wares.Chair;

public class CustomsTax implements Tax {

    @Override
    public void calculateTax(Car car) {
        car.editPrice(car.getPrice() * 1.2);
    }

    @Override
    public void calculateTax(Banana banana) {
        banana.editPrice(banana.getPrice() * 1.5);
    }

    @Override
    public void calculateTax(Chair chair) {
        chair.editPrice(chair.getPrice() * 1.4);
    }
}