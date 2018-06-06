package com.example.andrey.password_validator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Andrey on 2018-06-05.
 */

@RunWith(AndroidJUnit4.class)
public class EspressoUITest {

    @Rule
    public ActivityTestRule<MainActivity> myActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void enter_invalid_password() {
        onView(withId(R.id.passwordField)).perform(typeText("weakpassword"), ViewActions.closeSoftKeyboard());
        try {Thread.sleep(1000);}
        catch (Exception e) {System.out.println(e);}
        onView(withId(R.id.valdateButton)).perform(click());
        onView(withId(R.id.messageView)).check(matches(withText("weak password")));
    }

    @Test
    public void enter_valid_password() {
        onView(withId(R.id.passwordField)).perform(typeText("StrongPass1!"), ViewActions.closeSoftKeyboard());
        try {Thread.sleep(1000);}
        catch (Exception e) {System.out.println(e);}
        onView(withId(R.id.valdateButton)).perform(click());
        onView(withId(R.id.messageView)).check(matches(withText("strong password")));
    }

}
