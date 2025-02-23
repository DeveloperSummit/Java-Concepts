package multithrading.executorsframework;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarirerCounttown {

    public static void main(String[] args) {


        int numberOfTheParties=4;
        CyclicBarrier cyclicBarrier=new CyclicBarrier(numberOfTheParties, new Runnable() {
            @Override
            public void run() {
                System.out.println("All Subsystem are up.System Start-up now");
            }
        });

        Thread thread1=new Thread(new SubSystem("webservice",1000,cyclicBarrier));
        Thread thread2=new Thread(new SubSystem("Database",1000,cyclicBarrier));
        Thread thread3=new Thread(new SubSystem("cashe",1000,cyclicBarrier));
        Thread thread4=new Thread(new SubSystem("messageServicing",1000,cyclicBarrier));

        thread2.start();
        thread1.start();
        thread3.start();
        thread4.start();
    }
}

class SubSystem implements Runnable{

    private String serviceName;
    private int initlizationTime;
    private CyclicBarrier cyclicBarrier;

    public SubSystem(String serviceName, int initlizationTime, CyclicBarrier cyclicBarrier) {
        this.serviceName = serviceName;
        this.initlizationTime = initlizationTime;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(serviceName+" Initlization Started.........!");
            Thread.sleep(initlizationTime);
            cyclicBarrier.await();

        }catch (Exception e)
        {
            Thread.currentThread().interrupt();
        }
    }
}
