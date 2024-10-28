package creation_patterns.prototype;

public interface ProtoType<T> {
    T copyInstance() throws Exception;
}
