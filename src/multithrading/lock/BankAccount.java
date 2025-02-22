package multithrading.lock;

import Java8Function.PrimitivesStream;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int bankammount=100;

    private  final Lock  lock=new ReentrantLock();


  //  public synchronized void withrow(int account) throws InterruptedException {
  public void withrow(int account) throws InterruptedException {

                //lock.lock(); same as sys
          //  if (lock.tryLock()) {
                if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {

                if (bankammount >= account) {
                    System.out.println("Ammount is processing....." + account+" : "+Thread.currentThread().getName());
                    bankammount -= account;
                    Thread.sleep(2000);
                    System.out.println("Total balance --- " + bankammount);
                    lock.unlock();
                } else {
                    System.out.println("No balance in your account......!");
                }
            }else
            {
                System.out.println("waiting for the lock key - "+Thread.currentThread().getName());
            }
    }




}
