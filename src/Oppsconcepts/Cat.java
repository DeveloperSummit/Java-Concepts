package Oppsconcepts;


public interface Cat {

    public static final int MAX_VALUE = 10;

    default int makeSound() {
        System.out.println("Meow");
        return 1;
    }

    public static void main1() {
        System.out.println("Main1");
    }

}
