package desingPatten.abstractfactorydesignpatten;

public class MainExecusation {

    public static void main(String[] args) {
        EmployeFactory employeFactory=new EmployeFactory();
        Employee employeeDetails = employeFactory.getEmployeeDetails(new AndroidDeveloperFactory());
        int salary = employeeDetails.salary();
        String name =employeeDetails.name();

        System.out.println(name+"\nSalary= "+salary);


    }
}
