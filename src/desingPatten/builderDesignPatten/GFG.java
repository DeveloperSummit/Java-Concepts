package desingPatten.builderDesignPatten;

import javax.swing.plaf.PanelUI;
import java.util.stream.StreamSupport;

public class GFG {


    public final String CONSTANT_VALUE="SINGHSTA_FAMILY";

    public  static  void  m1()
    {
        System.out.println("I am static method m1 from GFG class");
    }

    public void m2()
    {
        System.out.println("I am non-static method from the GFG class");
    }

    static {
        System.out.println("I am static block from GFG class");
    }

    static  class SubClass{

        public final String CONSTANT_VALUE="SINGHSTA_FAMILY_1";

        public  static  void  m1()
        {
            System.out.println("I am static method m1 from Subclass class");
        }

        public void m2()
        {
            System.out.println("I am non-static method from the Subclass class");
        }

        static {
            System.out.println("I am static block from Subclass class");
        }



    }

    class NestedSubclass
    {

        public final String CONSTANT_VALUE="SINGHSTA_FAMILY_2";

        public  static  void  m1()
        {
            System.out.println("I am static method m1 from nestedSubclass class");
        }

        public void m2()
        {
            System.out.println("I am non-static method from the nestedSubclass class");
        }

        static {
            System.out.println("I am static block from nestedSubclass class");
        }
    }

}
