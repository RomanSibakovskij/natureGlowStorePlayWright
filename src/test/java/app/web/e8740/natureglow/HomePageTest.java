package app.web.e8740.natureglow;

import app.web.e8740.natureglow.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods {

    //navigate to sign up page test

    // Test 001 -> navigate to sign up page test
    @Test
    @DisplayName("Navigate To Sign Up Page Test")
    @Tag("Navigate_To_Sign_Up_Page")
    void navigateToRegisterPageTest(){
        navigateToSignUpPageTest();
    }

    //add single new arrival product to cart test

    // Test 003 -> add single new arrival product ("Cocoa Body Lotion") to cart out test (as a guest) (the single product page fails to open fully, test has failed)
    @Test
    @DisplayName("Add Single New Arrival Product To Cart Test (as a guest)")
    @Tag("Add_Single_New_Arrival_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void addSingleNewArrivalProductTest(){
        //add single new arrival product ("Cocoa Body Lotion") to cart out test (as a guest)
        addSingleHomePageNewArrivalProductToCartGuestTest();
    }

    //add multiple new arrival products to cart test

    // Test 003a -> add multiple new arrival products ("Coffee Scrub", "Rose Lip Butter") to cart out test (as a guest) (the single product page fails to open fully, test has failed)
    @Test
    @DisplayName("Add Multiple New Arrival Products To Cart Test (as a guest)")
    @Tag("Add_Multiple_New_Arrival_Products_To_Cart")
    @Tag("Test_As_A_Guest")
    void addMultipleNewArrivalProductsTest(){
        //add multiple new arrival products ("Coffee Scrub", "Rose Lip Butter") to cart out test (as a guest)
        addMultipleHomePageNewArrivalProductsToCartGuestTest();
    }

    //add single bestselling product to check out tests

    // Test 004 -> add single bestselling product ("Neem Shampoo") to check out test (as a guest) (the product fails to be added to check out, test has failed)
    @Test
    @DisplayName("Add Single Bestselling Product To Checkout Test (as a guest)")
    @Tag("Add_Single_Bestselling_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void addSingleBestSellingProductToCheckoutTest(){
        //add single bestselling product ("Neem Shampoo") to check out test (as a guest)
        addSingleHomePageProductToCheckoutGuestTest();
    }

}
