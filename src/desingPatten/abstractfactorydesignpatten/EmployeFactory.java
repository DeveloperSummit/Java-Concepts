package desingPatten.abstractfactorydesignpatten;

public class EmployeFactory {

    public Employee getEmployeeDetails(AbstractEmployeeFactory abstractEmployeeFactory)
    {
        return abstractEmployeeFactory.createObject();
    }
}
