package Java8Function.openationalclass;

import java.util.Optional;

public class Test {

    private String name;

    public Optional<String> getName() {
        return Optional.ofNullable(null);
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }
}
