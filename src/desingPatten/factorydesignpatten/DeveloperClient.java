package desingPatten.factorydesignpatten;

public class DeveloperClient {

    public static void main(String[] args) {
       Employee employee= EmployeeFactory.getEmployee("");
       System.out.println(employee.salary());

    }
}
