package course.se.taskmanager;
public class UserLogin {
    private UserRegistration userRegistration;
    public UserLogin(UserRegistration userRegistration) {
        this.userRegistration = userRegistration;
    }
    public boolean login(String username, String password) {
        return userRegistration.login(username, password);
    } }
