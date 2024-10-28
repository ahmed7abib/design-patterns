package creation_patterns.singletone;

public class Task2 implements Runnable {

    @Override
    public void run() {
        Counter counter2 = Counter.getInstance();
        counter2.addOne();
        counter2.addOne();
        System.out.printf("Counter 2 = " + counter2.getCount());
        System.out.println();
    }
}