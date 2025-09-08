package app.web.e8740.natureglow;

import app.web.e8740.natureglow.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class LoginSignUpDashPageTest extends TestMethods{

    //valid user signup test

    // Test 002 -> valid user signup test (the "Sign Up" button click fails to work in automation run, test has failed)
    @Test
    @DisplayName("Valid User Sign Up Test")
    @Tag("Valid_User_Sign_Up")
    void validUserAccountCreationTest(){
        //navigate to sign up page test
        navigateToSignUpPageTest();
        //valid user signup test
        validUserSignUpTest();
    }

}
