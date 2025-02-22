package multithrading.threadcommunication;

import java.util.function.Predicate;

public class SharedResource {

    private  int count;
    private boolean checkFlag;


    public synchronized void producer(int value)
    {
        if (checkFlag)
        {
            try {
                wait();
                System.out.println("Produce data "+value);
            }catch (InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

        }
        count=value;
        checkFlag=true;
        notify();


    }

    public synchronized void consumer()
    {
        if (!checkFlag)
        {
            try{
                wait();
                System.out.println("Consume data "+count);
            }catch (Exception  ex)
            {
                Thread.currentThread().interrupt();
            }
        }

        checkFlag=false;
        notify();



    }

}


class  producer implements  Runnable{

  private  SharedResource sharedResource;

    public  producer(SharedResource sharedResource){

        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.producer(i);
        }
    }
}


class  consumer implements  Runnable{

    private SharedResource sharedResource;

    public consumer(SharedResource sharedResource)
    {
        this.sharedResource=sharedResource;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.consumer();
        }

    }
}
