import java.util.Scanner;

import Login.Login;
import User.User;
import UserRepo.UserRepository;
import util.EmailValidator;
import util.PasswordValidator;
import Registration.Register;
public class Main {
    static void main(String args[]) {
        System.out.println("welcome to the Smart Lib System");
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        UserRepository userRepository = new UserRepository();
        while (b){
            System.out.println("1.To Register");
            System.out.println("2.To login");
            int authChoice = sc.nextInt();
            sc.nextLine();
            switch (authChoice){
                case 1->{
                    int id = (int)(Math.random() * 1_000_000_000L);

                    System.out.println("Please enter you user name");
                    String name = sc.nextLine();

                    System.out.println("please enter you email");
                    boolean flagEmail = true;
                    String email = " ";

                    while (flagEmail){
                        email = sc.nextLine();
                        if(EmailValidator.isValidEmail(email)){
                            System.out.println("Email is correct");
                            flagEmail = false;
                        }
                        else {
                            System.out.println("please enter a valid Email address");
                        }
                    }

                    System.out.println("Please enter your password");
                    String password = " ";
                    boolean flagPassword = true;

                    while (flagPassword){
                        password = sc.nextLine();
                        if(PasswordValidator.isValidPassword(password)){
                            System.out.println("your password is valid");
                            flagPassword = false;
                        }
                        else {
                            System.out.println("please enter another password");
                        }
                    }


                    Register register = new Register(userRepository);
                    register.registerUser(id,name,email,password);
                }
                case 2->{
                    System.out.println("please enter your credential to login");
                    System.out.println("please enter your Email");
                    String email = sc.nextLine();
                    System.out.println("please enter your Password");
                    String password = sc.nextLine();
                    Login login = new Login(userRepository);
                    login.loginUser(email,password);
                }
                default -> {
                    System.out.println("Please enter a valid Choice");
                }
            }
        }
    }
}
