package multithrading.lock;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class lockMain  {

    public static void main(String[] args) throws InterruptedException {


        BankAccount bankAccount=new BankAccount();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                try {
                    bankAccount.withrow(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

  

        Thread thread1=new Thread(runnable,"Thread 1");
        Thread thread2=new Thread(runnable,"Thread 2");


        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();





    }


}
