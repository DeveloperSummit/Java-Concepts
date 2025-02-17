package collectionss.collectionbyEngYoutube.deque;

import java.util.ArrayDeque;
import java.util.concurrent.*;

public class BlockingQueueDemo2 {

    public static void main(String[] args) {

        BlockingQueue<Integer> blockingQueue=new SynchronousQueue<Integer>();





            Thread thread=new Thread(()->{
                try {
                    System.out.println("Data is adding.........!");
                    blockingQueue.put(2);
                    blockingQueue.put(23);

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            });

            Thread thread1=new Thread(()->{
                try{

                 //   Integer take = blockingQueue.take();
                   // Integer dd=blockingQueue.take();
                    System.out.println("Data is taking.....!"+blockingQueue);
                    //System.out.println(take+"::"+dd);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }


            });

            thread.start();
            thread1.start();
            try{
                thread.join();
                thread1.join();
            }catch (Exception e)
            {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }







    }
}
