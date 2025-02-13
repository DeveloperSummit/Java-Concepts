package exception;

import java.security.spec.ECField;

public class MainException  {


    public static void main(String[] args)  {
        int a=5;
        int b=0;
      try {

          System.out.println(a/b);

      }catch (Exception e)
      {

            System.out.println("Exception block");
          throw  new UncheckedException("this value can't device by zero");

      }
      finally {
          System.out.println("Finally block");
      }

    }
}
