package Java8Function;

import javax.versionx.java8v.A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class PrimitivesStream {

    public static void main(String[] args) {

        int [] numbers={3,4,4,4,23,24,4};
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println(min);
        String aa[] =new String[]{"dghhd"};
        Stream<Integer> stream = (Stream<Integer>) Arrays.stream(numbers);


        List<Integer> list=new ArrayList<>();




    }
}
