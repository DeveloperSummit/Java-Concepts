package javax.versionx.java8v;

import java.util.ArrayList;
import java.util.List;

public class JavaMainX implements  A {

    public static void main(String[] args) {


        //we can used the interface 3 way
        //1
        A a=new A() {
            @Override
            public int getSalary() {
                return 100;
            }
        };
        System.out.println("Salary : "+a.getSalary());

        //2

        A aq=()->{
            return 10;
        };
        System.out.println("Salary "+aq.getSalary());

        //3
        System.out.println("Salary 3 "+new JavaMainX().getSalary());


        List<Student> list=new ArrayList<>();

        list.add(new Student(3,"Kuldeep","Ghazibad"));
        list.add(new Student(4,"Sandeep","Delhi"));
        list.add(new Student(1,"Ravi","Hapur"));
        list.add(new Student(2,"Anuj","Banglore"));

        list.stream().forEach(i->{
            System.out.println(i.getName());
        });
        System.out.println("----------------------------");
        list.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
        list.stream().forEach(e->{
            System.out.println(e.getName());
        });




    }

    @Override
    public int getSalary() {
        return 1000;
    }



}
