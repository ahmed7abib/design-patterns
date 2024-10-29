package structural_patterns.adapter;

public class ComponentB implements OldInterface {

    @Override
    public String next() {
        return "ComponentB";
    }

    @Override
    public boolean hasMoreElements() {
        return false;
    }
}