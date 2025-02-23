package multithrading.executorsframework;

import java.util.concurrent.*;

public class ThreadScheduledExectorService {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        //TODO THIS IS USED FOR ONE TIME DELAY THE TASK AND PRINT THE VALUE
      /*  scheduler.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi..");
            }
        },5,TimeUnit.SECONDS);
        scheduler.shutdown();*/
        //TODO THIS IS USED FOR PRINT THE N-TIMES UNTIL SECHDULER THE SHOUTDOWN
        scheduler.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am Iron man");
            }
        },5,5,TimeUnit.SECONDS);

        scheduler.schedule(new Runnable() {
            @Override
            public void run() {
                scheduler.shutdown();
            }
        },25,TimeUnit.SECONDS);




    }
}
