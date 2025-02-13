package Oppsconcepts.innerclasses;

import Oppsconcepts.Cat;

public class MemberInnerclass {

    private  String name = "Innerclass Class";

     class InnerClass {
        public void printName() {
            System.out.println(name);
        }
    }

    static  class InnerStaticClass {
        public void printName() {
            System.out.println("InnerStaticClass");
        }
    }


}
