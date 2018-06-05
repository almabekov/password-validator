package com.example.andrey.password_validator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Andrey on 2018-06-05.
 */

public class ValidatorTest {

    @Test
    public void password_is_not_password() {
        assertTrue(!Validator.validate("password")); //word "password"
    }

    @Test
    public void password_is_less_than_8_characters() {
        assertTrue(!Validator.validate(""));  //empty
        assertTrue(!Validator.validate("Abcde!1"));  //less that 8 characters
    }

    @Test
    public void at_least_has_one_digit() {
        assertTrue(!Validator.validate("Abcdefg!"));  //does not have digits
    }

    @Test
    public void both_lowercase_and_uppercase_letters() {
        assertTrue(!Validator.validate("abcdef!1"));  //does not have uppercase
        assertTrue(!Validator.validate("ABCDEF!1"));  //does not have lowercase
    }


    @Test
    public void has_special_character() {
        assertTrue(!Validator.validate("Abcdefg1")); //does not have special character
    }

    @Test
    public void correct_password() {
        assertTrue(Validator.validate("Abcdef5!"));
    }
}
