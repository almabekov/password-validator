package com.example.andrey.password_validator;

/**
 * Created by Andrey on 2018-06-05.
 */

public class Validator {
    public static boolean validate(String password) {

        if (password.length()<8) return false;
        if (password.equals("password")) return false;
        return true;
    }
}
