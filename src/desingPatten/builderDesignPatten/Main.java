package desingPatten.builderDesignPatten;

import exception.UncheckedException;

public class Main {
    public static void main(String[] args) {

        User anujSinghSta =  new User.UserBuilder()
                .setUserEmail("AnujSinghsta@gmail")
               // .setUserId("123")
                .setUserName("Anuj SinghSta").build();

        System.out.println(anujSinghSta);
    }
}
