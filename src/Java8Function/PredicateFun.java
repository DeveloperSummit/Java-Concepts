package Java8Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFun {

    public static void main(String[] args) {

        Predicate<Integer> numbercheck= x->x%2==0;
        List<Integer> list = Arrays.asList(2, 5, 3, 3, 5, 3,10);
        list.forEach(e->{
            System.out.println(numbercheck.test(e));
        });

        int sum = list.stream().filter(numbercheck).mapToInt(n -> n).max().getAsInt();
        System.out.println(sum);


    }
}
