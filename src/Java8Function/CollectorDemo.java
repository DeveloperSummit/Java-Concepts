package Java8Function;


import Java8Function.streamjava.Student;
import com.sun.source.tree.Tree;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorDemo {

    public static void main(String[] args) {


        LinkedList

        List<Student> students = Arrays.asList(
                new Student("Alice", "123 Apple St"),
                new Student("Charlie", "789 Cherry St"),
                new Student("Alice", "123 Apple St"), // Duplicate
                new Student("Dave", "101 Durian St"),
                new Student("Bob", "456 Banana St")
                );


        //######################################## START-FLOW ##############################################################

        //Collertor

        //TODO 1  collect(Collectors.toList());
        ArrayList<String> fruitss = new ArrayList<>();
        fruitss.add("Banana");
        fruitss.add("Orange");
        fruitss.add("Mango");
        fruitss.add("Grapes");
        fruitss.add("Apple");
     //   fruitss.add("Mango");


        List<String> fruitList = fruitss.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println("First Example :  "+fruitList);

        //TODO 2  collect(Collectors.toSet());
        Set<String> collect8 = fruitss.stream().collect(Collectors.toSet());
        System.out.println("Remove the duplicate value : "+collect8);

        //TODO 3  collect(Collectors.toMap());
        Map<String, Integer> collect9 = fruitss.stream().collect(Collectors.toMap(s -> s.toUpperCase(), s -> s.length()));
        System.out.println("Convert list to map : "+collect9);

        //TODO 4 Collectors.joining(" *")
        String collect10 = fruitss.stream().collect(Collectors.joining(" *"));
        System.out.println(collect10);

        // TODO 5 you can convertc the any list to difffrent list
        ArrayList<String> collect11 = fruitss.stream().collect(Collectors.toCollection(() -> new ArrayList<>()));
        collect11.add("XYZ");
        System.out.println(collect11);

        ArrayDeque<String> collect12 = fruitss.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        // TODO 6 Summarizing Data with statistical data mathmatical funcetion
        List<Integer> list1 = Arrays.asList(3, 1, 4, 4, 6, 2, 3, 5, 4);
        IntSummaryStatistics collect13 = list1.stream().collect(Collectors.summarizingInt(s -> s));
        System.out.println("MAX "+collect13.getMax());
        System.out.println("Count "+collect13.getCount());
        System.out.println("Sum  "+collect13.getSum());
        System.out.println("AVG "+collect13.getAverage());

        //  TODO 7 Grouping element name wiht the help lenght.
                                         fruitss.stream().collect(Collectors.groupingBy(s -> s.length()));
                                         fruitss.stream().collect(Collectors.groupingBy(s-> s.length()>5, Collectors.counting()));
        Map<Integer, String> collect14 = fruitss.stream().collect(Collectors.groupingBy(s -> s.length(), Collectors.joining(",")));
        //Todo convert the HashMap to TreeMap
        TreeMap<Integer, Long> collect15 = fruitss.stream().collect(Collectors.groupingBy(s -> s.length(), TreeMap::new, Collectors.counting()));
        System.out.println("grouping : "+collect14);

        //todo partitiong element
        Map<Boolean, List<String>> collect16 = fruitss.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
        System.out.println("partitioningBy "+collect16);

        String collect17 = fruitss.stream().collect(Collectors.mapping(s -> s.toUpperCase(), Collectors.joining(",,")));
        System.out.println("Collectors.mapping  "+collect17);


        //Question Start 1:

        ArrayList<String> mynames = new ArrayList<>();

        // Add names to the list
        mynames.add("John");
        mynames.add("Jane");
        mynames.add("Alice");
        mynames.add("Bob");
        mynames.add("Charlie");



        //Todo names with lenght
        Map<Integer, String> collect18 = mynames.stream().collect(Collectors.groupingBy(s -> s.length(), Collectors.joining(",")));
        System.out.println("Names with length : "+collect18);

       // Question 2  find the count of the words

        String myName= "My Name is Anuj Kumar Name";
        String[] s1 = myName.split(" ");
        Map<String, Long> collect19 = Arrays.stream(s1).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println("Question 2 "+collect19);

        //Question 3 odd and even using the Collector partistion
        List<Integer> listNumber = Arrays.asList(2, 3, 3, 2, 3, 5);
        Map<Boolean, List<Integer>> collect20 = listNumber.stream().collect(Collectors.partitioningBy(number -> number % 2 == 0));
        System.out.println("Partisation :: "+collect20);


        HashMap<String, Integer> fruitmap = new HashMap<>();

        // Add fruits and their quantities to the map
        fruitmap.put("Apple", 20);
        fruitmap.put("Orange", 3);
        fruitmap.put("Banana", 3);

        IntSummaryStatistics collect21 = fruitmap.entrySet().stream().collect(Collectors.summarizingInt(s -> s.getValue()));
        System.out.println("Total sum values "+collect21.getSum());

        fruitmap.entrySet().forEach(e-> {
            System.out.println("Check Value "+e);
        });

        fruitmap.values().forEach(data-> System.out.println(data));
        fruitmap.keySet().forEach(data-> System.out.println(data));

        //Question 6 list to convert in the map
        List<String> list2 = Arrays.asList("Apple", "Banana", "graphics", "fig","Water manel");
        Map<String, Integer> collect22 = list2.stream().collect(Collectors.toMap(x -> x, s -> s.length()));
        System.out.println("Question 6  "+collect22);
        List<String> list3 = Arrays.asList("Apple", "Banana", "graphics", "fig","Banana","Water manel");

        Map<String, Integer> collect23 = list3.stream().collect(Collectors.toMap(x -> x, z -> 1, (a, b) -> a + b));
        System.out.println("Mearge function in java "+collect23);


        //######################################## CLOSE-FLOW ##############################################################


        //collector is used to combine the result of processing on the elements of a stream
        List<String> fruits = Arrays.asList("apple", "banasna", "orange");
        List<String> collect = fruits.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> list = Arrays.asList(2, 3, 3, 2, 3, 5);
        Set<Integer> collect1 = list.stream().sorted().collect(Collectors.toSet());
        System.out.println(collect1);

        //todo here we can use toMap to convert list to map
        //todo here we can use toMap to convert list to map
        Map<String, String> collect7 = fruits.stream().collect(Collectors.toMap(s -> s, s -> s.toUpperCase()));
        System.out.println("collect7 "+collect7);

        //String Joining with ",
        String collect2 = fruits.stream().map(data -> data.toUpperCase()).collect(Collectors.joining(",# "));
        System.out.println(collect2);


        IntSummaryStatistics collect3 = list.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println(collect3);
        System.out.println(collect3.getAverage());
        System.out.println(collect3.getCount());
        System.out.println(collect3.getMax());
        System.out.println(collect3.getMin());
        System.out.println(collect3.getSum());


        //todo grouping elements

        Map<Integer, List<String>> collect4 = fruits.stream().collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(collect4);


        Map<Integer, String> collect5 = fruits.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(",")));
        System.out.println(collect5);


       students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.mapping(Student::getAddress, Collectors.toList()))).forEach((k,v)->{
           System.out.println(k+" ** "+v);
           });

        Map<String, Long> collect6 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

        System.out.println(" collect6 "+collect6);




        // Finding and printing distinct students
        List<Student> distinctStudents = students.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct students: " + distinctStudents);


        Stream<Map.Entry<String, Long>> stream = students.stream().collect(Collectors.groupingBy(student -> student.getName(), Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).entrySet().stream();
        System.out.println("collect8 "+stream);


    }
}
