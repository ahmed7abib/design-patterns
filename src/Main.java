import creational_patterns.builder.Car;
import creational_patterns.factory.*;
import creational_patterns.prototype.Address;
import creational_patterns.prototype.RegularEmployee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n**********  Prototype Pattern ******** \n");
        Main.prototypeDemo();

        System.out.println("\n**********  Builder Pattern ********** \n");
        Main.builderPattern();

        System.out.println("\n**********  Factory Pattern ********** \n");
        Main.factoryPatternDemo();
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

        try {
            RegularEmployee copyInstance = regularEmployee.copyInstance();
            copyInstance.setAddress(new Address("Warqa Bn Nofl", "8A", "October"));
            System.out.println(copyInstance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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

    private static void factoryPatternDemo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your credit number: ");
        String input = scanner.nextLine();

        try {
            IBank bank = new BankFactory().create(input);
            bank.withDraw();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}