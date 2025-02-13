package multithrading.sync;

public class Count {
    public  int count=0;

    public void  increment()
    {
        synchronized (this) {
            count++;
        }
    }

    public  int getCount()
    {
       return count;
    }
}
