package Registration;
import UserRepo.UserRepository;
import User.User;
import util.PasswordUtil;

public class Register {
    private UserRepository repository;

    public Register(UserRepository repository) {
        this.repository = repository;
    }

    public boolean registerUser(int id,
                                String username,
                                String email,
                                String password) {

        if (repository.userExists(email)) {
            return false;
        }
        String hashedPassword =
                PasswordUtil.hashPassword(password);

        User user = new User(
                id,
                username,
                email,
                hashedPassword
        );
        System.out.println("Account created successfully");
        repository.addUser(user);

        return true;
    }
}

