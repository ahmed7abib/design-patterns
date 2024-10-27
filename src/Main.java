import creational_patterns.builder.Car;
import creational_patterns.prototype.Address;
import creational_patterns.prototype.RegularEmployee;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n**********  Prototype Pattern ******** \n");
        Main.prototypeDemo();
        System.out.println("\n**********  Builder Pattern ********** \n");
        Main.builderPattern();
    }

    /**
     * Creation Patterns.
     * Prototype
     * Builder
     * Factory
     * Abstract Factory
     */
    private static void prototypeDemo() {
        RegularEmployee regularEmployee = new RegularEmployee();
        regularEmployee.setId(1);
        regularEmployee.setName("Ahmed");
        regularEmployee.setAddress(new Address("Warqa Bn Nofl", "8A", "Cairo"));
        System.out.println(regularEmployee);

        System.out.println("\n ---------------- \n");

        RegularEmployee copyInstance = regularEmployee.copyInstance();
        copyInstance.setAddress(new Address("Warqa Bn Nofl", "8A", "October"));
        System.out.println(copyInstance);
    }

    private static void builderPattern() {
        Car car = new Car.CarBuilder("V1", "Manual")
                .setColor("Green")
                .setHasSunRoof(false)
                .setAirBags(2)
                .setHasNavigationSystem(false)
                .build();

        System.out.println(car);
    }
}