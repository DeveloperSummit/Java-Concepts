package Java8Function;

import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionInterfacex {

    public static void main(String[] args) {

        Function<String, Integer> stringIntegerFunction=x->x.length();

        //apply method
        Integer anujkumar = stringIntegerFunction.apply("Anujkumar");
        System.out.println(anujkumar);

        Function<String,String> input1=s->s.toUpperCase();
        Function<String,String> input2=s->s.substring(1,4);
        Function<String, String> stringStringFunction = input1.andThen(input2);
        //apply method
        String ravikant = stringStringFunction.apply("Ravishment");
        System.out.println(ravikant);


        Function<Integer,Integer> list1=z->z*2;
        Function<Integer,Integer> liat2=c->c*c*c;

        Integer apply = list1.andThen(liat2).apply(2);
        System.out.println(apply);
        //TODO THIS IS REVERSE METHOD OF THE ANDTHEN
        Integer apply2 = list1.compose(liat2).apply(2);
        System.out.println(apply2);




    }
}
