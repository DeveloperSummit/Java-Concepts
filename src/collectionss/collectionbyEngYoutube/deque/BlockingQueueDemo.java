package collectionss.collectionbyEngYoutube.deque;

import javax.versionx.java8v.A;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class BlockingQueueDemo {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> blockingQueue1=new SynchronousQueue<>();
        try {
            blockingQueue1.put(1);
         //   blockingQueue1.put(2);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("blockingQueue1 "+blockingQueue1.take());



        BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<>(5);
        Thread producer =new Thread(new producer(blockingQueue));
        Thread consumer=new Thread(new Consumer(blockingQueue));
        producer.start();
        consumer.start();


    }



}

class  Consumer implements  Runnable {
    BlockingQueue<Integer> arrayBlockingQueue;

    public Consumer(BlockingQueue arrayBlockingQueue){
        this.arrayBlockingQueue=arrayBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer take = arrayBlockingQueue.take();
                System.out.println("Consumer : " + take);

                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }
}
class producer  implements  Runnable {

    private int count=0;

    BlockingQueue<Integer> arrayBlockingQueue;

    public producer(BlockingQueue arrayBlockingQueue)
    {
        this.arrayBlockingQueue=arrayBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {

            try {
                System.out.println("producer : " + count);
                arrayBlockingQueue.put(count++);
                System.out.println("Size : "+arrayBlockingQueue.size());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }

    }
}