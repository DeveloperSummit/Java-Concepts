package desingPatten.factorydesignpatten;

public class EmployeeFactory {

    public  static Employee getEmployee(String employeeType)
    {
        if(employeeType.trim().equalsIgnoreCase("Android"))
        {
            return new AndroidDeveloper();
        } else if (employeeType.trim().equalsIgnoreCase("Web")) {
            return new WebDeveloper();
        }else {
            return null;
        }

    }

}
