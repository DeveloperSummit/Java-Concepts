package Oppsconcepts.innerclasses;

public class JavaTestMain {

    JavaTestMain javaTestMain=new JavaTestMain();

    public JavaTestMain getJavaTestMain() {
        return javaTestMain;
    }

    public static void main(String[] args) {

        //This is an example of a member inner class
        MemberInnerclass memberInnerclass=new MemberInnerclass();
        memberInnerclass.new InnerClass().printName();
        //This is an example of a static inner class
        MemberInnerclass.InnerStaticClass innerStaticClass=new MemberInnerclass.InnerStaticClass();
        innerStaticClass.printName();
        //This is an example of an anonymous inner class
        JavaTestMain.makepayment(ampiunt -> {
            System.out.println("Payment of "+ampiunt);
        });
        //This is an example of a local inner class
        JavaTestMain.localInnerClass();






    }
    private static void makepayment(AnoanynumeInterface anoanynumeInterface){
        anoanynumeInterface.Payment(10);
    }

    private static void localInnerClass(){
        class LocalInnerClass{
            public void printName() {
                System.out.println("LocalInnerClass");
            }
        }
        LocalInnerClass localInnerClass=new LocalInnerClass();
        localInnerClass.printName();
    }
}
