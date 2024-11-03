package behaviourals_patterns.observer;

public class Student implements CoursesObserver {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notify " + name + " with message: " + message);
    }
}
