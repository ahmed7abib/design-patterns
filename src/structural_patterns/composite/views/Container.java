package structural_patterns.composite.views;

import java.util.ArrayList;
import java.util.List;

public class Container extends Component {

    private final List<Component> components = new ArrayList<>();

    public Container() {
        super("Container");
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public void showComponents() {
        for (Component component : components) {
            System.out.println("Container has childes: " + component);
        }
    }
}
