package structural_patterns.composite.employees;

public abstract class Employee {

    private final String name;
    private final String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void showDetails() {
        System.out.println(position + " " + name);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Position: " + position;
    }
}