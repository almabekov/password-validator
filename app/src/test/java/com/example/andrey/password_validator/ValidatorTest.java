package com.example.andrey.password_validator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Andrey on 2018-06-05.
 */

public class ValidatorTest {

    @Test
    public void Password_is_not_password() {
        assertTrue(!Validator.validate("password"));
    }

    @Test
    public void Password_is_less_than_8_characters() {
        assertTrue(!Validator.validate(""));
        assertTrue(!Validator.validate("abcdefg"));
    }
}
