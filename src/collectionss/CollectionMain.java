package collectionss;

import desingPatten.observrdesignpateen.Observer;

import javax.versionx.java8v.A;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionMain {

    public static void main(String[] args)  {

        List<Student> list=new ArrayList<Student>();
        list.add(new Student(5,"Ravi", "Hyderabad"));
        list.add(new Student(2,"Anuj","Bangalore"));
        list.add(new Student(1,"Kuldeep","Ghaziabad"));
        list.add(new Student(6,"Sandeep","Hapur"));
        list.add(new Student(3,"Aayushi","Londhon"));


        //TODO FIRST
       // Collections.sort(list, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        //TODO SECOUND
       /* Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });*/
        //TODO THREE
      //  Comparator<Student> sorthing=Comparator.comparing(Student::getCity).thenComparing(Student::getName).thenComparing(Student::getCity).thenComparing(Student::getCity);
       // Collections.sort(list, sorthing);
        //TODO HERE WE IMPLEMENTED THE SORTING BY USING THE COMPARATOR [I]  ON THE COMPARATOR CLASS
       // list.sort(new CityComparator());



        //TODO HERE WE IMPLEMENTED THE SORTING BY USING THE STREAM CLASS

        list.stream().sorted(Comparator.comparing(Student::getId).reversed().thenComparing(Student::getName).reversed()).map(data->data.name).peek(e->{
            System.out.println(e);
        }).limit(2).collect(Collectors.toList());


        List<Student> treeSet=new ArrayList<>();
        treeSet.add(new Student(2,"5", "Hyderabad"));
        treeSet.add(new Student(5,"3","Bangalore"));
        treeSet.add(new Student(5,"6","Ghaziabad"));
        treeSet.add(new Student(1,"1","Hapur"));
        treeSet.add(new Student(7,"7","Londhon"));

        System.out.println("---------------------------------");
        //TODO HERE WE IMPLEMENTED THE SORTING BY USING THE COMPARATOR [I]  ON THE COMPARATOR CLASS
        System.out.println(treeSet);
        Collections.sort(treeSet, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(treeSet);


        //TODO HERE WE IMPLEMENTED THE SORTING BY USING THE STREAM CLASS
       /* treeSet.stream().sorted(Comparator.comparing(Student::getName)).peek(e->{
            System.out.println(e);
        }).collect(Collectors.toList());
*/







    }
}
