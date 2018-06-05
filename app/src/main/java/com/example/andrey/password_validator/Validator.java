package com.example.andrey.password_validator;

/**
 * Created by Andrey on 2018-06-05.
 */

public class Validator {
    public static boolean validate(String password) {

        if (password.length()<8) return false;
        if (password.equals("password")) return false;

        boolean hasLowercase=false;
        boolean hasDigit=false;
        boolean hasUppercase=false;
        boolean hasSpecialCharacter=false;

        //has digit
        for (int i=0;i<password.length();i++) {
            if (password.charAt(i)-'0'>=0 && password.charAt(i)-'0'<=9) hasDigit=true;

        }
        if (hasDigit==false || hasUppercase==false) return false;

        return true;
    }
}
