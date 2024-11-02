package structural_patterns.composite.employees;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    private final String name;
    private final List<Employee> heads = new ArrayList<>();

    public Manager(String name, String position) {
        super(name, position);
        this.name = name;
    }

    public void addHead(Employee head) {
        heads.add(head);
    }

    public void removeHead(Employee head) {
        heads.remove(head);
    }

    public List<Employee> getHeads() {
        return heads;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println(name + " lead heads: ");
        for (Employee head : heads) {
            head.showDetails();
        }
        System.out.println();
    }
}
