package desingPatten.builderDesignPatten;

public  class Test {


    public static void main(String[] args) {


        //TODO FOR THE STATIC CLASS

        GFG.SubClass subClass = new GFG.SubClass();
        GFG.SubClass.m1();
        subClass.m2();
        String constantValue = subClass.CONSTANT_VALUE;
        System.out.println(constantValue);

        //TODO FOR THE NON-STATIC CLASS

        System.out.println("=======================================================");

        GFG.NestedSubclass nestedSubclass=new GFG(). new NestedSubclass();
        nestedSubclass.m2();
        String constantValue1 = nestedSubclass.CONSTANT_VALUE;
        System.out.println(constantValue1);
        GFG.NestedSubclass.m1();


    }


}
