import creational_patterns.builder.Car;
import creational_patterns.factory_and_abstrat_factory.abstract_factory.ICard;
import creational_patterns.factory_and_abstrat_factory.abstract_factory.PaymentFactory;
import creational_patterns.factory_and_abstrat_factory.factory.*;
import creational_patterns.prototype.Address;
import creational_patterns.prototype.RegularEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n**********  Prototype Pattern ******** \n");
        Main.prototypeDemo();

        System.out.println("\n**********  Builder Pattern ********** \n");
        Main.builderPatternDemo();

        System.out.println("\n**********  Factory Pattern ********** \n");
        Main.factoryPatternDemo(scanner);

        System.out.println("\n**********  Abstract Factory Pattern ********** \n");
        Main.abstractFactoryPatternDemo(scanner);
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

    private static void builderPatternDemo() {
        Car car = new Car.CarBuilder("V1", "Manual")
                .setColor("Green")
                .setHasSunRoof(false)
                .setAirBags(2)
                .setHasNavigationSystem(false)
                .build();

        System.out.println(car);
    }

    private static void factoryPatternDemo(Scanner scanner) {

        System.out.println("Enter your credit number: ");
        String input = scanner.nextLine();

        try {
            IBank bank = new BankFactory().getBank(input);
            bank.withDraw();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void abstractFactoryPatternDemo(Scanner scanner) {
        System.out.println("Enter your credit number: ");
        String input = scanner.nextLine();

        try {
            IBank bank = new PaymentFactory().getBank(input);
            ICard card = new PaymentFactory().getCardData(input);

            System.out.print("Bank: ");
            bank.withDraw();

            System.out.println("Card type: " + card.getCardType() + " -- Provider: " + card.getProviderInfo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}