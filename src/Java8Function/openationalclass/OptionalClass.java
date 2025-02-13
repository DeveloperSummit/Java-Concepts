package Java8Function.openationalclass;

import java.sql.SQLOutput;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClass {


    /**
     * Key Methods for Optional
     * GET : used for Return the value
     * isPresent(): Checks if a value is present. true or false
     * ifPresent(Consumer<? super T> action): Executes the given action if a value is present.
     * orElse(T other): Returns the value if present, otherwise returns other.
     * orElseGet(Supplier<? extends T> other): Returns the value if present, otherwise invokes the supplier and returns its result.
     * orElseThrow(Supplier<? extends X> exceptionSupplier): Returns the value if present, otherwise throws an exception provided by the supplier.
     * */

    //TODO KEYWORDS GET, IS_PRESENT RETURN THE TRUE FALSE
    //TODO IS_PRESENT NO RETURN THE VALUE BECAUSE OF THE IT'S IMPLEMENT THE CONSUMER INTERFACE
    //TODO MAP, OR_ELSE, OR_ELSE_THROW
    public static void main(String[] args) {
        //TODO WITH THE HELP TO SET THE DATA
        Optional<String> optionname = Optional.of("SET DATA");
        Test test=new Test();
        test.setName("Anuj");
        //TODO GET()
        //String s = test.getName().get();
        //System.out.println("GET ==> "+s);
        //TODO IS_PRESENT TRUE FALSE
        if (test.getName().isPresent()) {
            System.out.println("IS_PRESENT==> "+test.getName());
        } else {
            System.out.println("no data found");
        }

        //TODO IS_PRESENT CONSUMER INTERFACE
        test.getName().ifPresent(S->{
            System.out.println("IF_PRESENT==> "+S);
        });

        //TODO OR_ELSE
        String s = test.getName().orElse("Data Set Not Found !");
        System.out.println("OR_ELSE ==>  "+s);

        //TODO MAP
        String S1 = test.getName().map(s1->s1.substring(2,3)).orElse("Data Set Not Found !");
        System.out.println("MAP==>  "+S1);

        //TODO orElseThrow
        String throwExceptionData = test.getName().orElseThrow(() -> new RuntimeException("Throw Exception Data"));
        System.out.println("orElseThrow ++> "+throwExceptionData);



    }
}
