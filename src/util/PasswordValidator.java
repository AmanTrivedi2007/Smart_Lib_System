package util;

public class PasswordValidator {
    public static boolean isValidPassword(String password) {

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        if (password == null) {
            System.out.println("Password cannot be empty.");
            return false;
        }

        if (password.length() < 8) {
            System.out.println("Password must contain at least 8 characters.");
        }

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }

            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }

            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                hasSpecialCharacter = true;
            }
        }

        if (!hasUpperCase) {
            System.out.println("Password must contain at least one uppercase letter.");
        }

        if (!hasLowerCase) {
            System.out.println("Password must contain at least one lowercase letter.");
        }

        if (!hasDigit) {
            System.out.println("Password must contain at least one digit.");
        }

        if (!hasSpecialCharacter) {
            System.out.println("Password must contain at least one special character.");
        }

        return password.length() >= 8
                && hasUpperCase
                && hasLowerCase
                && hasDigit
                && hasSpecialCharacter;
    }
}

