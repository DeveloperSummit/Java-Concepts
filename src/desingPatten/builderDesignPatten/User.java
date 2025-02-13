package desingPatten.builderDesignPatten;

public class User {

    private final String UserName;
    private final  String UserId;
    private final  String userEmail;

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", UserId='" + UserId + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }



    private User(UserBuilder userBuilder) {

        this.UserName=userBuilder.UserName;
        this.UserId=userBuilder.UserId;
        this.userEmail=userBuilder.userEmail;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserId() {
        return UserId;
    }

    public String getUserEmail() {
        return userEmail;
    }

     static  class UserBuilder {
         private String UserName;
         private String UserId;
         private String userEmail;

       /* public UserBuilder() {
        }*/

        public  static UserBuilder getUserBuilder()
        {
            return  new UserBuilder();
        }

        public UserBuilder setUserName(String userName) {
            UserName = userName;
            return this;

        }

        public UserBuilder setUserId(String userId) {
            UserId = userId;
            return this;
        }

        public UserBuilder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return  this;
        }

        public User build()
        {
            return  new User(this);
        }
    }
}
