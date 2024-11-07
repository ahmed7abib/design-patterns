package structural_patterns;

import structural_patterns.adapter.*;
import structural_patterns.bridge.operating_systems.using_bridge.Android;
import structural_patterns.bridge.operating_systems.using_bridge.Laptop;
import structural_patterns.bridge.operating_systems.using_bridge.SmartPhone;
import structural_patterns.bridge.operating_systems.using_bridge.Windows;
import structural_patterns.bridge.shapes.using_bridge.Circle;
import structural_patterns.bridge.shapes.using_bridge.Rectangle;
import structural_patterns.bridge.shapes.using_bridge.Red;
import structural_patterns.composite.employees.Head;
import structural_patterns.composite.employees.Manager;
import structural_patterns.composite.employees.RegularEmployee;
import structural_patterns.composite.views.Container;
import structural_patterns.composite.views.EditText;
import structural_patterns.composite.views.ImageView;
import structural_patterns.composite.views.TextView;
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

    public static void proxyDemo() {
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

    public static void decoratorDemo() {
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

    public static void adapterDemo() {
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

    public static void facadeDemo() {
        MoviePlayerFacade moviePlayerFacade = new MoviePlayerFacade();
        moviePlayerFacade.playMovie("العيال كبرت");
    }

    public static void flyWeightDemo() {
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

    public static void compositeDemo() {
        RegularEmployee saif = new RegularEmployee("Saif", "Regular Emp");
        RegularEmployee ahmed = new RegularEmployee("Ahmed", "Regular Emp");

        Head amr = new Head("Amr", "Head");
        Head essam = new Head("Essam", "Head");

        Manager manager = new Manager("Mohamed", "Manager");

        amr.addEmployee(saif);
        essam.addEmployee(saif);
        essam.addEmployee(ahmed);

        manager.addHead(essam);
        manager.addHead(amr);

        manager.showDetails();

        System.out.println("\nExample 2 \n");

        TextView textView = new TextView();
        ImageView imageView = new ImageView();
        EditText editText = new EditText();

        Container container = new Container();

        container.addComponent(textView);
        container.addComponent(imageView);
        container.addComponent(editText);

        container.showComponents();
    }

    public static void bridgeDemo() {
        SmartPhone smartPhoneAndroid = new SmartPhone(new Android());
        smartPhoneAndroid.start();
        smartPhoneAndroid.shutDown();

        Laptop laptop = new Laptop(new Windows());
        laptop.start();
        laptop.shutDown();

        System.out.println("\nExample 2 \n");

        Circle circle = new Circle(new Red());
        circle.draw();

        Rectangle rectangle = new Rectangle(new Red());
        rectangle.draw();

    }
}