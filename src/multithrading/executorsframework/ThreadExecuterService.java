package multithrading.executorsframework;

import java.util.concurrent.*;

public class ThreadExecuterService {

   private static long strtaTime= System.currentTimeMillis();

    public static void main(String[] args) throws InterruptedException {

        //TODO BASIC THREAD STAGE 1
        //withoutThreadCallingTime(); //9000 millisecond
        //TODO CALLING WITH THREAD STAGE 2
      //  withThreadCallingTime();
        // taking time 9000 milisecound other wise we need to define the time for particular thread Thread.sleep(1000) just like that.
        //TODO CALLING WITH THREAD_ARRAY STAGE 3
       // withThreadArrayCallingTime();
        //TODO WITH EXECUTIMESERVICE
        withThreadExecutiveserviceCallingTime(); //THIS IS VERY MAIN , Here no need to start the thread & no need to join the thread it's automatically handle
    }

    private static void withThreadExecutiveserviceCallingTime() throws InterruptedException {
        long strtaTime= System.currentTimeMillis();
        ExecutorService service= Executors.newFixedThreadPool(9);

        for (int i = 1;i <10; i++) {
           /* try {
                // Simulate some work
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Task " + i + " was interrupted.");
            }*/
            int finalI = i;
            Future<?> submit = service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(" Factorial => " + factorial(finalI));
                }
            });


        }

            service.shutdown();
            service.awaitTermination(100,TimeUnit.SECONDS);
            System.out.println("withThreadExecutiveserviceCallingTime : Total time =>  "+(System.currentTimeMillis()-strtaTime));


    }

    private static void withThreadArrayCallingTime() {

         long strtaTime= System.currentTimeMillis();


        Thread thread[]=new Thread[9];
        for (int i = 1;i <10; i++) {
            int finalI = i;
            thread[i-1]=new Thread(()->{
                System.out.println(" Factorial => "+factorial(finalI));
            });
            thread[i-1].start();
        }
       for (Thread thread1: thread)
       {
           try {

               thread1.join();
           }catch (Exception e)
           {
               Thread.currentThread().interrupt();
           }
       }
        System.out.println("withThreadArrayCallingTime : Total time =>  "+(System.currentTimeMillis()-strtaTime));
    }

        private static void withThreadCallingTime() throws InterruptedException {
        for (int i = 1; i < 9; i++) {
            int finalI = i;
            Thread thread=new Thread(()->{
                System.out.println(" Factorial => "+factorial(finalI));
            });
            thread.start();
            Thread.sleep(1000);
        }
        System.out.println("Total time =>  "+(System.currentTimeMillis()-strtaTime));


    }

    private  static void withoutThreadCallingTime()
    {

        for (int i = 1; i < 10; i++) {
            System.out.println(" Factorial => "+factorial(i));
        }
        System.out.println("Total time =>  "+(System.currentTimeMillis()-strtaTime));
    }




    private static int factorial(int factValue) {
        try {
            Thread.sleep(1000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        int result = 1;
        for (int i = 1; i <= factValue; i++) {
            result *= i;
        }
        return result;
    }
}
