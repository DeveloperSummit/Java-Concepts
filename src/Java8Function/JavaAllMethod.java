package Java8Function;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class JavaAllMethod {


    public static void main(String[] args) {

        String myString = "Hello World";
        //how to convert the string to a list of characters in Java 8?

        System.out.println(myString.chars().filter(e->e=='l').count());



        List<Integer> list1 = List.of(36, 3, 2, 5, 6, 3, 2, 4).stream().toList();
        list1.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);

      //  list1.stream().iterator()

        Integer i = list1.stream().reduce(Integer::sum).get();
        System.out.println("output :"+i);


        List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "mango", "banana", "mango", "orange","A","D");
        List<String> list = fruits.stream().distinct().toList();
        AtomicInteger count = new AtomicInteger();
        list.forEach(e-> {
            count.set(0);
                    fruits.stream().filter(f -> f.equals(e))
                            .forEach(s -> {
                                count.getAndIncrement();
                            });
                    if (count.get() > 1) {
                        System.out.println("Count of " + e + " is " + count.get());
                    }

                }
        );





    }}