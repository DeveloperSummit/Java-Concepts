package multithrading.lifecylecons;

public class World extends  Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(1000); // current thread is sleep because of the I need to run main thread
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
