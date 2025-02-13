package desingPatten.singltonDesingPatten;

public class EagerSiglton {
    private static EagerSiglton eagerSiglton=new EagerSiglton();
    // TODO THIS IS USED FOR THE EAGER CONDITION PRE OBJECT CREATED. NO MATTER IS USED OR NOT
    public static EagerSiglton getEagerSiglton()
    {
        return eagerSiglton;
    }
}
