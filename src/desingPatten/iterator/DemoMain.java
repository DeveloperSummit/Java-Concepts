package desingPatten.iterator;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {


    public static void main(String[] args) {

        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("11","Test1"));

        boolean b = employees.iterator().hasNext();
        if (b)
        {
            System.out.println(employees.iterator().next());
        }else
        {
            System.out.println("No Data found !");
        }
    }
}
