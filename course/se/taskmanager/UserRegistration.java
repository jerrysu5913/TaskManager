package course.se.taskmanager;
import java.util.HashMap;
import java.util.Map;
public class UserRegistration {
    private Map<String, String> users = new HashMap<>();
    public boolean register(String username, String password) {
        if (users.containsKey(username)) {
            return false; // 用户已存在 }
            users.put(username, password);
            return true;
        }
        public boolean login(String username, String password) {
            return users.containsKey(username) &&
                    users.get(username).equals(password);
        }
    }