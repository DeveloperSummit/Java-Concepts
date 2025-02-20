package multithrading;

import java.sql.SQLOutput;

public class JavaMainThread extends  Thread {

    @Override
    public void run() {
        System.out.println("Running...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("------------------- Thread Started -----------------------");
         JavaMainThread javaMainThread=new JavaMainThread();
        System.out.println(javaMainThread.getState()); // NEW
        javaMainThread.start();
        System.out.println(javaMainThread.getState()); //RUNABLE  AFTER START THE RUNNING
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(javaMainThread.getState()); //TIMe WAIT
        javaMainThread.join(); //Main Method wait for the current method finished.
        System.out.println(javaMainThread.getState()); //TERMINATE



    }
}
