package behaviourals_patterns.visitor;

import behaviourals_patterns.visitor.wares.Banana;
import behaviourals_patterns.visitor.wares.Car;
import behaviourals_patterns.visitor.wares.Chair;

public interface Tax {

    void calculateTax(Car car);

    void calculateTax(Banana banana);

    void calculateTax(Chair chair);
}
