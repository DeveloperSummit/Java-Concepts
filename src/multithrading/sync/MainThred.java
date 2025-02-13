package multithrading.sync;

public class MainThred extends  Thread {

    private  Count count;

    public MainThred(Count count) {

        this.count=count;
    }

    @Override
    public void run() {

        for (int i=0;i<200;i++)
        {
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count.increment();
        }





    }
}
