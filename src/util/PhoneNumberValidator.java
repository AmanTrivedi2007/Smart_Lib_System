package util;

import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public static boolean isValid(long phone) {
        if (phone < 1000000000L || phone > 9999999999L) {
            return false;
        }

        long firstDigit = phone / 1000000000L;

        return firstDigit >= 6 && firstDigit <= 9;
    }
}
