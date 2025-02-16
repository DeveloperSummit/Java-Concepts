package Java8Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class   ConsumerFun {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 3, 2, 3, 5);
        Consumer<Integer> xx=xxs->{System.out.println(xxs);};
        list.forEach(e->{
            xx.accept(e+100);
        });


    }
}
