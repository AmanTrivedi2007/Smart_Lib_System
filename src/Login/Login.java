package Login;

import User.User;
import UserRepo.UserRepository;
import util.PasswordUtil;

public class Login {

    private UserRepository repository;

    public Login(UserRepository repository) {
        this.repository = repository;
    }

    public User loginUser(String email, String password) {

        if (!repository.userExists(email)) {
            System.out.println("No account found with this email.");
            return null;
        }

        User user = repository.getUser(email);

        String hashedPassword = PasswordUtil.hashPassword(password);

        if (user.getPasswordHash().equals(hashedPassword)) {
            System.out.println("Login successful.");
            return user;
        } else {
            System.out.println("Incorrect password.");
            return null;
        }
    }
}
