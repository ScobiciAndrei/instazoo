package instazoo.payload;

public class InvalidLoginResponse {
    private String userName;
    private String password;

    public InvalidLoginResponse() {
        this.userName = "Invalid user name";
        this.password = "Invalid password";
    }
}
