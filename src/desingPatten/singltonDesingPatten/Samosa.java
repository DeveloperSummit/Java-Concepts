package desingPatten.singltonDesingPatten;

import java.io.Serializable;

public class Samosa implements Cloneable, Serializable {

    private  String name;
    private static  Samosa samosa = null;
    private Samosa()
    {
        if (samosa!=null)
        {
            throw new RuntimeException("you are trying the break the singleton patten through the Reflection API");
        }

    }


    //TODO THIS LAZY PROCESS
    public static  Samosa getSamosa()
    {
        if (samosa==null)
        {
            synchronized (Samosa.class)
            {
                samosa=new Samosa();
          }


        }
        return samosa;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //
        return super.clone();
    }

   /* @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(i+"==> "+Thread.currentThread().getName()+"::"+Samosa.getSamosa()+"::"+samosa.hashCode());
            System.out.println(i+"==> "+Thread.currentThread().getName()+"::"+Samosa.getSamosa()+"::"+samosa.hashCode());


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }*/

    //TODO THIS METHOD USED FOR BREAK THE SERIALIZATION INPUT & OUTPUT STREAM
    public Object readResolve()
    {
        return samosa;
    }
}
