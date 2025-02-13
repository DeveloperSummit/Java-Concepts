package collectionss.collectionbyEngYoutube;

import java.util.*;

public class MapMain {

    public static void main(String[] args) {


        Map<Integer, Student> studentMap = new HashMap<>(); studentMap.put(2, new Student("Bob", 2));
        studentMap.put(3, new Student("Charlie", 3));
        studentMap.put(4, new Student("Diana", 4));

        studentMap.put(1, new Student("Alice", 1));


        studentMap.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey())).forEach(System.out::println);


        Map<Student, Integer> fruitMap = new IdentityHashMap<>();

        Student s1 = new Student("Apple", 1);
        Student s2 = new Student("Apple",1);

        // Add some fruits to the map
        fruitMap.put(s1, 10);
        fruitMap.put(s2, 200);


        System.out.println(fruitMap.hashCode());


        fruitMap.entrySet().stream() .forEach(System.out::println);


        SortedMap<String,Integer> navigableMap = new TreeMap<>();






    }
}
