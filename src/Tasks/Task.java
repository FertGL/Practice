package Tasks;

public class Task implements Runnable{

    private long counter;
    private volatile boolean isRunning;

    Task() {
        isRunning = true;
    }
    @Override
    public void run() {
        while (isRunning) {
            counter++;
        }

        System.out.println(counter);
    }

    public void stop() {
        isRunning = false;
    }

    public long getCounter() {
        return counter;
    }
}
