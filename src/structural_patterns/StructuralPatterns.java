package structural_patterns;

import structural_patterns.adapter.*;
import structural_patterns.decorator.emailSender.EmailService;
import structural_patterns.decorator.sandwitch.BasicSandwich;
import structural_patterns.decorator.sandwitch.Beef;
import structural_patterns.decorator.sandwitch.Sandwich;
import structural_patterns.proxy.ISMSService;
import structural_patterns.proxy.SMSService;
import structural_patterns.proxy.SMSServiceProxy;

public class StructuralPatterns {

    public static void StructuralPatternsDemo() {

        System.out.println("----------- PROXY PATTERN --------------\n");
        StructuralPatterns.proxyDemo();

        System.out.println("----------- Decorator PATTERN --------------\n");
        StructuralPatterns.decoratorDemo();

        System.out.println("----------- Adapter PATTERN --------------\n");
        StructuralPatterns.adapterDemo();
    }

    private static void proxyDemo() {
        SMSServiceProxy smsServiceProxy = new SMSServiceProxy(new SMSService());

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
        System.out.println("\n");
    }

    private static void decoratorDemo() {
        System.out.println("Decorator Example 1 \n");

        ISMSService smsService = new SMSService();
        String sms = smsService.sendSMS("123", "456", "Hello");
        System.out.println(sms + "\n");

        ISMSService emailService = new EmailService(new SMSService());
        String result = emailService.sendSMS("123", "456", "Hello");
        System.out.println(result + "\n");

        System.out.println("Decorator Example 2 \n");

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

        System.out.println("\n");

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
}
