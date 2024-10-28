package creation_patterns;

import creation_patterns.builder.Car;
import creation_patterns.factory_and_abstrat_factory.abstract_factory.ICard;
import creation_patterns.factory_and_abstrat_factory.abstract_factory.PaymentFactory;
import creation_patterns.factory_and_abstrat_factory.factory.BankFactory;
import creation_patterns.factory_and_abstrat_factory.factory.IBank;
import creation_patterns.prototype.Address;
import creation_patterns.prototype.RegularEmployee;
import creation_patterns.singletone.Task1;
import creation_patterns.singletone.Task2;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * SingleTone
 * Creation Patterns.
 * Prototype
 * Builder
 * Factory
 * Abstract Factory
 */

public class CreationPatterns {

    public static void CreationPatternsDemo() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n**********  SingleTone Pattern ******** \n");
        CreationPatterns.singleToneDemo();

        System.out.println("\n**********  Prototype Pattern ******** \n");
        CreationPatterns.prototypeDemo();

        System.out.println("\n**********  Builder Pattern ********** \n");
        CreationPatterns.builderPatternDemo();

        System.out.println("\n**********  Factory Pattern ********** \n");
        CreationPatterns.factoryPatternDemo(scanner);

        System.out.println("\n**********  Abstract Factory Pattern ********** \n");
        CreationPatterns.abstractFactoryPatternDemo(scanner);
    }

    private static void singleToneDemo() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        executor.submit(task1);
        executor.submit(task2);

        Thread.sleep(100);
        executor.shutdown();
    }

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
