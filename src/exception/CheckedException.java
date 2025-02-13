package exception;

//TODO THIS IS USED FOR THE COMPILE TIME ERROR
public class CheckedException extends  Exception{

    public CheckedException(String message) {
        super(message);
    }

    public CheckedException() {
        super();

    }
}
