package structural_patterns;

import structural_patterns.adapter.*;
import structural_patterns.decorator.emailSender.EmailService;
import structural_patterns.decorator.sandwitch.BasicSandwich;
import structural_patterns.decorator.sandwitch.Beef;
import structural_patterns.decorator.sandwitch.Sandwich;
import structural_patterns.facade.MoviePlayerFacade;
import structural_patterns.flyWeight.DiscountFactory;
import structural_patterns.flyWeight.DiscountType;
import structural_patterns.flyWeight.IDiscount;
import structural_patterns.proxy.internet_proxy.Employee;
import structural_patterns.proxy.internet_proxy.InternetProxy;
import structural_patterns.proxy.sms_proxy.ISMSService;
import structural_patterns.proxy.sms_proxy.SMSService;
import structural_patterns.proxy.sms_proxy.SMSServiceProxy;

public class StructuralPatterns {

    public static void structuralPatternsDemo() {

        System.out.println("\n----------- PROXY PATTERN --------------\n");
        StructuralPatterns.proxyDemo();

        System.out.println("\n----------- Decorator PATTERN --------------\n");
        StructuralPatterns.decoratorDemo();

        System.out.println("\n----------- Adapter PATTERN --------------\n");
        StructuralPatterns.adapterDemo();

        System.out.println("\n----------- Facade PATTERN --------------\n");
        StructuralPatterns.facadeDemo();

        System.out.println("\n----------- FlyWeight PATTERN --------------\n");
        StructuralPatterns.flyWeightDemo();
    }

    private static void proxyDemo() {
        SMSServiceProxy smsServiceProxy = new SMSServiceProxy();

        String msg1 = smsServiceProxy.sendSMS("123456", "111222000", "Hello");
        String msg2 = smsServiceProxy.sendSMS("123456", "111222233", "Hello");
        String msg3 = smsServiceProxy.sendSMS("123456", "546064666", "Hello");
        String msg4 = smsServiceProxy.sendSMS("123456", "678903442", "Hello");
        String msg5 = smsServiceProxy.sendSMS("123456", "092983883", "Hello");
        String msg6 = smsServiceProxy.sendSMS("123456", "123905985", "Hello");
        String msg7 = smsServiceProxy.sendSMS("123456", "123905985", "Hello");

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(msg3);
        System.out.println(msg4);
        System.out.println(msg5);
        System.out.println(msg6);
        System.out.println(msg7);

        System.out.println("\n----------- Proxy Example 2 ----------------\n");

        InternetProxy internetProxy = new InternetProxy();
        internetProxy.getInternetAccess(
                new Employee.EmployeeBuilder()
                        .setName("Ahmed")
                        .setSecurityLevel(2)
                        .build()
        );
    }

    private static void decoratorDemo() {
        System.out.println("\n Decorator Example 1 \n");

        ISMSService smsService = new SMSService();
        String sms = smsService.sendSMS("123", "456", "Hello");
        System.out.println(sms);

        ISMSService emailService = new EmailService(new SMSService());
        String result = emailService.sendSMS("123", "456", "Hello");
        System.out.println(result);

        System.out.println("\n Decorator Example 2 \n");

        Sandwich sandwich = new BasicSandwich();
        System.out.println("Basic sandwich details: " + sandwich.getDesc() + ", " + sandwich.getCost() + "\n");

        Sandwich beefSandwich = new Beef(new BasicSandwich());
        System.out.println("Beef sandwich details: " + beefSandwich.getDesc() + ", " + beefSandwich.getCost());
    }

    private static void adapterDemo() {
        OldInterface comp1 = new ComponentA();
        OldInterface comp2 = new ComponentB();

        if (comp1.hasMoreElements()) {
            System.out.println(comp1.next());
        }

        if (comp2.hasMoreElements()) {
            System.out.println(comp2.next());
        }

        // Old interface is deprecated and I want to work with NewInterface,
        // Based on Open-Closed Principle I want to add new feature without modify the current code,
        // I will use adapter pattern that will convert old interface to new interface.

        NewInterface newComp1 = new OldToNewAdapter(comp1);
        NewInterface newComp2 = new OldToNewAdapter(comp2);

        if (newComp1.hasNext()) {
            System.out.println(newComp1.nextElement());
        }

        if (newComp2.hasNext()) {
            System.out.println(newComp2.nextElement());
        }
    }

    private static void facadeDemo() {
        MoviePlayerFacade moviePlayerFacade = new MoviePlayerFacade();
        moviePlayerFacade.playMovie("العيال كبرت");
    }

    private static void flyWeightDemo() {
        try {
            IDiscount dayDiscount = new DiscountFactory().getDiscountInstance(DiscountType.DAY);
            double disCountValue = dayDiscount.calcDiscount(String.valueOf(System.currentTimeMillis()), null);
            System.out.println("Day Discount = " + disCountValue);

            IDiscount itemDiscount = new DiscountFactory().getDiscountInstance(DiscountType.ITEM);
            double itemDiscountValue = itemDiscount.calcDiscount(String.valueOf(System.currentTimeMillis()), null);
            System.out.println("Item Discount = " + itemDiscountValue);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}