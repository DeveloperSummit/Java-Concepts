package javax.versionx.java8v;

import java.util.Comparator;

public class Student {
    private int id;
    private String name;
    private String addresh;

    public Student(int id, String name, String addresh) {
        this.id = id;
        this.name = name;
        this.addresh = addresh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddresh() {
        return addresh;
    }

    public void setAddresh(String addresh) {
        this.addresh = addresh;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addresh='" + addresh + '\'' +
                '}';
    }

}
