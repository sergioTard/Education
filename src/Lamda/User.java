package Lamda;

public class User {

    private String password;
    private String User;

    public User(String User, String password) {
        this.password = password;
        this.User = User;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return User;
    }
}
