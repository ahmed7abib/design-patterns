package structural_patterns.adapter;

public class ComponentA implements OldInterface {

    @Override
    public String next() {
        return "ComponentA";
    }

    @Override
    public boolean hasMoreElements() {
        return true;
    }
}
