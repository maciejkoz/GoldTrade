package com.example.goldTradeDemo.common;

import java.util.regex.Pattern;

public class ValidationUtils {

    private static final Integer MIN_AGE = 18;

    private static Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");

    private static Pattern passwordPattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");

    public static boolean isNullOrEmpty(String value) {
        return  value == null || value.isEmpty();
    }

    public static boolean isNull(Object object) {
        return object == null;
    }

    public static boolean isUncorrectedEmail(String email) {
        return !emailPattern.matcher(email).matches();
    }

    public static boolean isUncorrectedPassword(String password) {
        return !passwordPattern.matcher(password).matches();
    }

    public static boolean isUncorrectedAge(Integer age) { return age <= MIN_AGE;}
}
