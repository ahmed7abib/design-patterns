package creational_patterns;

import creational_patterns.builder.Car;
import creational_patterns.abstract_factory.ICard;
import creational_patterns.abstract_factory.PaymentFactory;
import creational_patterns.factory.BankFactory;
import creational_patterns.factory.IBank;
import creational_patterns.prototype.Address;
import creational_patterns.prototype.RegularEmployee;
import creational_patterns.singletone.Task1;
import creational_patterns.singletone.Task2;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreationPatterns {

    public static void singleToneDemo() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        executor.submit(task1);
        executor.submit(task2);

        Thread.sleep(100);
        executor.shutdown();
    }

    public static void prototypeDemo() {
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

    public static void builderPatternDemo() {
        Car car = new Car.CarBuilder("V1", "Manual")
                .setColor("Green")
                .setHasSunRoof(false)
                .setAirBags(2)
                .setHasNavigationSystem(false)
                .build();

        System.out.println(car);
    }

    public static void factoryPatternDemo(Scanner scanner) {

        System.out.println("Enter your credit number: ");
        String input = scanner.nextLine();

        try {
            IBank bank = new BankFactory().getBank(input);
            bank.withDraw();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void abstractFactoryPatternDemo(Scanner scanner) {
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
