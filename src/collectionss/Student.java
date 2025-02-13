package collectionss;

import java.util.Comparator;

public class Student {
    public Integer id;
    public String name;
    public String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }


    public Student(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }



}

