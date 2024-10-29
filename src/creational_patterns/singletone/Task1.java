package creational_patterns.singletone;

public class Task1 implements Runnable {

    @Override
    public void run() {
        Counter counter1 = Counter.getInstance();
        counter1.addOne();
        counter1.addOne();
        System.out.printf("Counter 1 = " + counter1.getCount());
        System.out.println();
    }
}
