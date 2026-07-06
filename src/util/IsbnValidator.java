package util;

import java.util.regex.Pattern;

public class IsbnValidator {
    public static final Pattern PATTERN = Pattern.compile("^(978[ \\-]?)(?:(?!\\d)[\\w]{3})?(\\d{12}|\\d{10}[xX])$");

    public static boolean isValid(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            return false;
        }
        return PATTERN.matcher(isbn).matches();
    }
}
