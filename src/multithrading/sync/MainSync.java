package multithrading.sync;

public class MainSync {

    public static void main(String[] args) {



        Count count=new Count();
        MainThred m1=new MainThred(count);
        MainThred m2=new MainThred(count);
        m1.start();
        m2.start();
        try {
            m1.join(); // I want to finished the this thread because of need to execute the next thread
            m2.join();
        }catch (Exception e)
        {
            System.out.println(e.getSuppressed());
        }
        finally {
            System.out.println("finally");
        }

        System.out.println(count.getCount());



    }
}
