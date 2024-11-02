package structural_patterns.composite.views;

public abstract class Component {
    private final String name;

    public Component(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}