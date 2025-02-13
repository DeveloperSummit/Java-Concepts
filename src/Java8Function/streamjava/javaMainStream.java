package Java8Function.streamjava;

import javax.versionx.java8v.Student;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javaMainStream {


    public static void main(String[] args) {

        //todo 1
        String aa[]={"Anuj","Kuldeep","Sandeep","Ravi"};
        Stream<String> stream = Arrays.stream(aa);
        List<String> dd= Arrays.asList("hapur","Pilkuwa","ghazibad","merrut");
        Stream<Integer> integerStream = Stream.of(3,4,21,0,5,1, 3, 3, 3, 3, 3, 3,4,555);


        List<Integer> collect = Stream.iterate(0, n -> n + 1)
                .filter(x->x%2==0) //TODO THIS USED FOR THE CHECK THE CONDITION TRUE OR FALSE (internally used the predicate Function)
                .map(modified->modified*2) ////TODO THIS USED FOR MODIFICATION DATA (internally used the  Function generic method<input,output>)
                .distinct()// TODO REMOVE THE REPEATED VALUE FROM THE STREAM
                .limit(10) //TODO WHERE YOU WANT TO PRINT THE DATA ARRAY SIZE
                .skip(2)//TODO FIRST TWO SKIP
                .sorted()// TODO SORT THE DATA DEFAULT USED THE ACSC (but we can used the customized)
                //.peek(s-> System.out.println(s)) //TODO THIS USED FOR PRINT ONLY THIS IS (Consumer interface implemented-> nothing returnee only taking)
                .collect(Collectors.toList());


        //TODO TERMINAL OPERATOR ==> MIN, MAX, COUNT, GET (Default MIN & MAX -> A-B)

        Integer max = Stream.iterate(1, x -> x + 1).limit(50).max((a, b) ->a-b).get();
        System.out.println(max);

        Integer min = Stream.iterate(1, x -> x + 1).limit(50).min((a, b) -> a-b).get();
        System.out.println(min);

        Long count = integerStream.distinct().count();
        System.out.println(count);


        //Custom Sorting With java 8  collection
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(4,"Sandeep","Hapur"));
        studentList.add(new Student(3,"Kuldeep","Ghazibad"));
        studentList.add(new Student(3,"Aayushi","England"));
        studentList.add(new Student(1,"Ravi","Gurgaon"));
        studentList.add(new Student(2,"Anuj","Banglore"));

        System.out.println("Before ==> "+studentList);

        //TODO - USED FOR THE AESC & + USED FOR DESC
        List<Student> IntegerSorted = studentList.stream().sorted((o1, o2)->o1.getId()-o2.getId()).toList();
        System.out.println("Integer Sorted "+IntegerSorted);

        //TODO THIS IS VERY VERY IMPORNAT METHOD
        //TODO USED THE REVERSE THE DATA

        List<Student> StringSorted  = studentList.stream().sorted((o1, o2)->o1.getName().compareTo(o2.getName())).peek(e-> {
            System.out.println(e);
        }).sorted(Comparator.comparing(Student::getName).reversed()).peek(output->{
            System.out.println(output);
        }).collect(Collectors.toList());
        //Collections.reverse(StringSorted);
       // System.out.println("String Sorted 1 "+StringSorted);

        //TODO ===============================================HASHMAP<KEY,VALUE>===================================================
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();
        map.put("sachin", 30);
        map.put("vishal", 10);
        map.put("Aman", 20);

        //TODO THIS IS USED FOR THE RETURN THE KEY
        List<String> collect1 = map.entrySet().stream().map(Map.Entry::getKey).sorted().toList();

        //TODO THIS IS USED FOR THE RETURN THE VALUE WITH SORTING  ORDER
        List<Map.Entry<String, Integer>> collect2 = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList();
        collect2.stream().forEach(e->{
            System.out.println(e.getKey());
        });

        //TODO THIS IS USED FOR THE RETURN THE VALUE WITH SORTING  ORDER
        List<Map.Entry<String, Integer>> reversedList = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // Sort by values in reverse order
                .collect(Collectors.toList());

    }
}
