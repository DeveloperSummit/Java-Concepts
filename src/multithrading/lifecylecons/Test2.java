package multithrading.lifecylecons;

public class Test2 {

    public static void main(String[] args) {

        Runnable runnable=()-> {

                for (int i = 0; i <10 ; i++) {
                    System.out.println(i);
                }

        };
        Thread thread=new Thread(runnable);
        thread.start();

    }
}
