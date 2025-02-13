package multithrading.lifecylecons;

public class Main {

    public static void main(String[] args) throws InterruptedException {
       World t1=new World();
       System.out.println(t1.getName()+"  ==>  "+t1.getState().name());
       t1.start();
       System.out.println(t1.getName()+"  ==>  "+t1.getState().name());
       Thread.sleep(200); //main thread is sleep because we need to execute the t1 thread
        System.out.println(t1.getName()+"  ==>  "+t1.getState().name());
        t1.join(); // this join method is used for terminate the current (t1) thread.
        System.out.println(t1.getName()+"  ==>  "+t1.getState().name());

        String input = "abvfcdsertyacdfhsnkljiijbatyjsls;kjlhsgatsdjhslkjlksj";
        int output=21;





    }
}
