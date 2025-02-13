package collectionss.collectionbyEngYoutube;

import javax.versionx.java8v.A;
import java.util.*;

public class MainCollection {


    public static void main(String[] args) {

        ArrayList<String> fruitList = new ArrayList<>();

         fruitList.add("Mango");
         fruitList.add("Apple");
          fruitList.add("Banana");
          fruitList.add("Orange");

          fruitList.stream().forEach(e->{
                if (e.equals("Apple"))
                {
                    fruitList.add("Grapes");
                }
          });

        System.out.println(fruitList);

        // Create an ArrayList to store student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // Add some students to the list
        studentList.add(new Student("Charlie", 3));
        studentList.add(new Student("Diana", 4));
        studentList.add(new Student("Alice", 1));
        studentList.add(new Student("Bob", 2));







        studentList.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getId)).forEach(System.out::println);





        //ArrayList<String> fruitList = new ArrayList<>();

        // Add some fruits to the list
       // fruitList.add("Mango");
       // fruitList.add("Apple");
      //  fruitList.add("Banana");

      //  fruitList.add("Orange");

      //  fruitList.sort(Comparator.comparing(String::valueOf));

     //   fruitList.sort((a,b)-> -a.compareTo(b));

      //  fruitList.forEach(System.out::println);

      //  fruitList.stream().sorted(Comparator.comparing(String::valueOf)).forEach(System.out::println);

      //    fruitList.stream().sorted((a,b)->- a.compareTo(b)).forEach(System.out::println);


        //  fruitList.forEach(System.out::println);


        List<Integer> list=new ArrayList<>();
        Vector<Integer> vector=new Vector<>();

        Thread thread=new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                synchronized (MainCollection.class) {
                    list.add(i);
                }

            }
        });

        Thread thread1=new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                synchronized (MainCollection.class) {
                    list.add(i);
                }
            }
        });

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());




    }
}
