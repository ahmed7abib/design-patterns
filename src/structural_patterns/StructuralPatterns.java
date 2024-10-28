package structural_patterns;

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
    }

    private static void decoratorDemo() {
        ISMSService smsService = new SMSService();
        String sms = smsService.sendSMS("123", "456", "Hello");
        System.out.println(sms);
        System.out.println("--------------------------------");

        ISMSService emailService = new EmailService(new SMSService());
        String result = emailService.sendSMS("123", "456", "Hello");
        System.out.println(result);
        System.out.println("--------------------------------");

        Sandwich sandwich = new BasicSandwich();
        System.out.println("Basic sandwich details: " + sandwich.getDesc() + ", " + sandwich.getCost());
        System.out.println("--------------------------------");

        Sandwich beefSandwich = new Beef(new BasicSandwich());
        System.out.println("Beef sandwich details: " + beefSandwich.getDesc() + ", " + beefSandwich.getCost());
    }
}
