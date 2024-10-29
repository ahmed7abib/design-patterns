package creational_patterns.singletone;

public class Counter {

    private int counter;

    private static volatile Counter instance = null;

    private Counter() {
    }

    public static Counter getInstance() {
        if (instance == null) {
            synchronized (Counter.class) {
                if (instance == null) {
                    instance = new Counter();
                }
            }
        }

        return instance;
    }

    public void addOne() {
        counter++;
    }

    public String getCount() {
        return String.valueOf(counter);
    }
}
