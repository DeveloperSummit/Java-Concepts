package desingPatten.singltonDesingPatten;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLOutput;

public class SignltonDesignPatten {

    public static void main(String[] args) throws Exception {



           // Using two threads to access the Singleton instance concurrently
                 Thread thread1 = new Thread(() -> {
                     Samosa singleton1 = Samosa.getSamosa();
                     System.out.println("Thread 1: " + singleton1.hashCode());
                 });

                 Thread thread2 = new Thread(() -> {
                  Samosa singleton1 = Samosa.getSamosa();
                 System.out.println("Thread 2: " + singleton1.hashCode());
               });

                  thread1.start();
                  thread2.start();



        System.out.println(Samosa.getSamosa().hashCode());
        System.out.println(Samosa.getSamosa().hashCode());

        System.out.println(EagerSiglton.getEagerSiglton().hashCode());
        System.out.println(EagerSiglton.getEagerSiglton().hashCode());

        /**
         * We can break the Singleton patten
         * {1} Reflection API -> Java Reflection is a process  modifying the at run time behavior dynamically
         * Solution 1 -> we can add the exception in private constructor.
         * Solution 2-> We can make the Enum class and make the INSTANCE variable.
         * {2} Through the Serialization and Deserialization we can make break the Singleton Code.
         * solution 1-> we have method readResolved. in Singleton class
         * {3} Clone the Object
         *
         * */


         Samosa samosa=  Samosa.getSamosa();
         System.out.println("#HASHCODE==> "+samosa.hashCode());
         //TODO 1 REFLECTION API BREAK THE SINGLETON PATTEN
         //TODO THIS CODE IS COMMENT BECAUSE OF WE ARE ACCESS THE PRIVATE CONSTRUCTOR WITH THE HELP OF REFLECTION API IN JAVA
         //TODO SOLUTION 1
         /*Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
         constructor.setAccessible(true);
         Samosa samosa1= constructor.newInstance();
         System.out.println("Reflection API "+samosa1.hashCode());*/

        //TODO SOLUTION 2 MAKE THE ENUM CLASS
         System.out.println("ENUM ==>"+SamosEnum.INSTANCE.hashCode());

         //TODO THIS IS BREAK THE SINGLETON PATTEN WITH THE HELP OF SERIALIZATION AND DESERIALIZATION PATTEN THROUGH INPUT & OUTPUT STREAM
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        objectOutputStream.writeObject(samosa);

        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa samosa1=(Samosa)inputStream.readObject();
        System.out.println("#OUTPUT_STREAM==> "+samosa1.hashCode());



        // TODO BREAK THE SINGLETON PATTEN
         //TODO THIS IS USED FOR CLONE THE OBJECT WITH THE HELP OF CLONEABLE INTERFACE METHOD NAME (CLONE)
         System.out.println("Clone call==>"+samosa.clone().hashCode());
         //TODO SOLUTION RETURN DIRECTLY THE SAMOSA OBJECT










    }
}
