package multithrading.threadcommunication;

public class ThreadCommunication {

    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource();
        Thread thread=new Thread(new producer(sharedResource));
        Thread thread1=new Thread(new consumer(sharedResource));
        thread.start();
        thread1.start();

    }
}
