package app.web.e8740.natureglow;

import app.web.e8740.natureglow.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShopDashboardPageTest extends TestMethods{

    //add single shop dashboard product to cart tests

    // Test 005 -> add single shop dashboard product ("Mint Lip Balm") to cart test (as a guest) (the product list fails to show up, test has failed)
    @Test
    @DisplayName("Add Single Shop Dashboard Product To Cart Test (as a guest)")
    @Tag("Add_Single_Shop_Dash_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void addSingleShopDashProductToCartTest(){
        //add single shop dashboard product ("Mint Lip Balm") to cart test (as a guest)
        addSingleShopDashboardProductToCartGuestTest();
    }



}
