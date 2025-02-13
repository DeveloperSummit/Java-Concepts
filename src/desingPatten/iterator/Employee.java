package desingPatten.iterator;

public class Employee {
    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private String name;
    private String address;
}
