import creational_patterns.CreationPatterns;

import java.util.Scanner;

public class CPProgram {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------------------ SingleTone Pattern ------------------------ \n");
        CreationPatterns.singleToneDemo();

        System.out.println("\n------------------ Prototype Pattern ------------------------ \n");
        CreationPatterns.prototypeDemo();

        System.out.println("\n------------------ Builder Pattern  -------------------------- \n");
        CreationPatterns.builderPatternDemo();

        System.out.println("\n------------------ Factory Pattern  ---------------------------\n");
        CreationPatterns.factoryPatternDemo(scanner);

        System.out.println("\n------------------ Abstract Factory Pattern  ----------------- \n");
        CreationPatterns.abstractFactoryPatternDemo(scanner);
    }
}