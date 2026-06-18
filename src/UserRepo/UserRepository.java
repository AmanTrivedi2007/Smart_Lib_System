package UserRepo;
import User.User;
import java.util.*;

public class UserRepository {
    private HashMap<String, User> users =
            new HashMap<>();

    public void addUser(User user) {
        users.put(user.getEmail(), user);
    }

    public User getUser(String email) {
        return users.get(email);
    }

    public boolean userExists(String email) {
        return users.containsKey(email);
    }
}
