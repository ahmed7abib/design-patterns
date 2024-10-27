import creational_patterns.prototype.RegularEmployee;
import creational_patterns.prototype.Address;

public class Main {
    public static void main(String[] args) {
        Main.prototypeDemo();
    }

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
}