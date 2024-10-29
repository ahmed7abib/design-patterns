package structural_patterns.adapter;

public class OldToNewAdapter implements NewInterface {

    private final OldInterface oldInterface;

    public OldToNewAdapter(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public boolean hasNext() {
        return oldInterface.hasMoreElements();
    }

    @Override
    public String nextElement() {
        return oldInterface.next();
    }
}
