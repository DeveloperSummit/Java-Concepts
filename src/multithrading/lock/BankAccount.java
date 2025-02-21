package multithrading.lock;

import Java8Function.PrimitivesStream;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int bankammount=100;

    private  final Lock  lock=new ReentrantLock();


  //  public synchronized void withrow(int account) throws InterruptedException {
  public void withrow(int account) throws InterruptedException {

                //lock.lock(); same as sys
            if (bankammount>=account)
          {
            System.out.println("Ammount is processing....."+account);
            bankammount-=account;
            Thread.sleep(3000);
            System.out.println("Total balance --- "+bankammount);
            lock.unlock();
        }else
        {
            System.out.println("No balance in your account......!");
        }
    }




}
