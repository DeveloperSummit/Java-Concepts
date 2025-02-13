package javaneww.version8new.methodRef;

public class MethodRefrence {


    public  MethodRefrence()
    {
        System.out.println("Constructor Invoked......!");


    }

    public  void print()
    {
        System.out.println("I am Method");
    }

    public static void staticMethod()
    {
        System.out.println("Hi I static method");
    }


    public static void main(String[] args) {

        //TODO THIS IS USED FOR THE STATIC METHOD IMPLEMENTATION OF THE FUNCTION INTERFACE
        MethodRefImpl nm = MethodRefrence::staticMethod;
        nm.sayHello();


        //TODO USED FOR THR CONSTRUCTOR
        nm=  MethodRefrence::new;
        nm.sayHello();

        //TODO USED FOR THE INSTANCE METHOD
        MethodRefImpl ff = new MethodRefrence()::print;
        ff.sayHello();


    }
}
