package structural_patterns.composite.employees;

import java.util.ArrayList;
import java.util.List;

public class Head extends Employee {

    private final String name;
    private final List<Employee> employees = new ArrayList<>();

    public Head(String name, String position) {
        super(name, position);
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getAllEmployees() {
        return this.employees;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println(name + " lead employees: ");
        for (Employee employee : employees) {
            employee.showDetails();
        }
        System.out.println();
    }
}
