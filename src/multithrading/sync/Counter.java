package multithrading.sync;

public class Counter {

    private  int count=0;

    //public synchronized int increment()
    public  int increment()
    {
        synchronized (this){
            return  count++;
        }

    }



    public int getCount()
    {
      return  count;
    }

}
