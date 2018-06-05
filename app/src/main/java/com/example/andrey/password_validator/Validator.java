package com.example.andrey.password_validator;

import java.util.Set;

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
            if (Character.isDigit(password.charAt(i))) hasDigit=true;
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))) hasSpecialCharacter=true;
        }
        if (hasDigit==false || hasSpecialCharacter==false) return false;

        //has lowercase and uppercase
        if (password.toUpperCase()!=password)  hasLowercase=true;
        if (password.toLowerCase()!=password) hasUppercase=true;
        if (hasLowercase==false || hasUppercase==false) return false;

        return true;
    }
}
