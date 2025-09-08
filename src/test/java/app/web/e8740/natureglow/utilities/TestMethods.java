package app.web.e8740.natureglow.utilities;

import app.web.e8740.natureglow.*;
import app.web.e8740.natureglow.page.data.loggers.PageDataLoggers;
import app.web.e8740.natureglow.page.text.element.assertion.PageTextElementAsserts;
import app.web.e8740.natureglow.page.web.element.assertion.PageWebElementAsserts;
import com.microsoft.playwright.Page;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMethods extends BaseTest implements PageWebElementAsserts, PageTextElementAsserts, PageDataLoggers {


    //navigate to sign up page test method
    protected void navigateToSignUpPageTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        LoginSignUpDashboardPage loginSignUpDashboardPage = new LoginSignUpDashboardPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(1600);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //log home page product data
        logHomePageProductData(page);
        //log home page customer review data
        logHomePageCustomerReviewData(page);
        //log home page FAQ section data
        logHomePageFAQSectionData(page);
        //click "Account" link
        generalPage.clickAccountLink();
        //login/signup dashboard page web element assert
        isLoginSignUpDashPageWebElementVisible(page);
        //login/signup dashboard page login section web element assert
        isLoginSignUpDashPageLoginSectionWebElementVisible(page);
        //login/signup dashboard page text element assert
        isLoginSignUpDashPageTextElementAsExpected(page);
        //login/signup dashboard page login section text element assert
        isLoginSignUpDashPageLoginSectionTextElementAsExpected(page);
        //capture screenshot of the login/signup dashboard page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login SignUp Dashboard Page Display.png")).setFullPage(true));
        //click "Sign In" link
        loginSignUpDashboardPage.clickSignInLink();
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Navigate To Sign Up Page Test Result.png")).setFullPage(true));
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user signup test

    //valid user signup test method
    protected void validUserSignUpTest(){
        BasePage basePage = new BasePage(page);
        LoginSignUpDashboardPage loginSignUpDashboardPage = new LoginSignUpDashboardPage(page);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //login/signup dashboard page web element assert
        isLoginSignUpDashPageWebElementVisible(page);
        //login/signup dashboard page signup section web element assert
        isLoginSignUpDashPageSignUpSectionWebElementVisible(page);
        //login/signup dashboard page (sign up version) text element assert
        isLoginSignUpDashPageSignUpTextElementAsExpected(page);
        //login/signup dashboard page signup section text element assert
        isLoginSignUpDashPageSignUpSectionTextElementAsExpected(page);
        //capture screenshot of the login/signup dashboard page sign up section display before data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login SignUp Dashboard Page Sign Up Section Display Before Data Input.png")).setFullPage(true));
        //valid user sign up input data getter
        loginSignUpDashboardPage.validSignUpInputDataGetter();
        //input valid user full name into full name input field
        loginSignUpDashboardPage.inputValidFullNameIntoFullNameInputField();
        //input valid user email into email input field
        loginSignUpDashboardPage.inputValidEmailIntoEmailInputField();
        //input valid user password into password input field
        loginSignUpDashboardPage.inputValidPasswordIntoPasswordInputField();
        //click "View Password" button
        loginSignUpDashboardPage.clickSignUpViewPasswordButton();
        //capture screenshot of the login/signup dashboard page sign up section display after valid data input
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Login SignUp Dashboard Page Sign Up Section Display After Valid Data Input.png")).setFullPage(true));
        //click "Sign Up" button
        loginSignUpDashboardPage.clickSignUpButton();
        //assert the user gets back onto home page after successful sign-up, throw an error otherwise
        String expectedHomePageURL = "https://natureglow-740e8.web.app/";
        String actualPageURL = page.url();
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Valid User Sign Up Test Result.png")).setFullPage(true));
        assertEquals(expectedHomePageURL, actualPageURL, "The 'Sign Up' button click failed to be performed. Expected URL: " + expectedHomePageURL + ", but got: " + actualPageURL + " .Test has failed.");

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add single home page new arrival product to cart tests ("View Details" button click lets user to add the product to cart through single product page)

    //add single home page new arrival product ("Cocoa Body Lotion") to cart test method (as a guest)
    protected void addSingleHomePageNewArrivalProductToCartGuestTest(){
        BasePage basePage = new BasePage(page);
        HomePage homePage = new HomePage(page);
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(1100);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //log home page product data
        logHomePageProductData(page);
        //log home page customer review data
        logHomePageCustomerReviewData(page);
        //log home page FAQ section data
        logHomePageFAQSectionData(page);
        //click set product ("Cocoa Body Lotion") "View Details" button
        homePage.clickSetNewArrivalViewDetailsBtn(3);
        //capture screenshot of the single product page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Single Product ('Cocoa Body Lotion') Page Display.png")).setFullPage(true));
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //single product page web element assert
        isSingleProductPageWebElementVisible(page);
        //single product page features list web element assert
        isSingleProductPageProductFeaturesListWebElementVisible(page);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(page);
        //log single product page product data
        logSingleProductPageProductData(page);
        //log single product page product features data
        logSingleProductPageProductFeaturesData(page);
        //log single product page related products data
        logSingleProductPageRelatedProductData(page);
        //click "Add to Cart" button
        singleProductPage.clickAddToCartButton();
        //capture screenshot of the single product page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Product ('Cocoa Body Lotion') To Cart Test Result.png")).setFullPage(true));
    }

    //add multiple home page new arrival products ("Coffee Scrub", "Rose Lip Butter") to cart test method (as a guest)
    protected void addMultipleHomePageNewArrivalProductsToCartGuestTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        HomePage homePage = new HomePage(page);
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(1100);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //log home page product data
        logHomePageProductData(page);
        //log home page customer review data
        logHomePageCustomerReviewData(page);
        //log home page FAQ section data
        logHomePageFAQSectionData(page);
        //click set product ("Cocoa Body Lotion") "View Details" button
        homePage.clickSetNewArrivalViewDetailsBtn(3);
        //capture screenshot of the single product page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Single Home Page New Arrival Product ('Coffee Scrub') Page Display.png")).setFullPage(true));
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //single product page web element assert
        isSingleProductPageWebElementVisible(page);
        //single product page features list web element assert
        isSingleProductPageProductFeaturesListWebElementVisible(page);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(page);
        //log single product page product data
        logSingleProductPageProductData(page);
        //log single product page product features data
        logSingleProductPageProductFeaturesData(page);
        //log single product page related products data
        logSingleProductPageRelatedProductData(page);
        //click "Add to Cart" button
        singleProductPage.clickAddToCartButton();
        //capture screenshot of the single product page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Home Page New Arrival Product ('Coffee Scrub') To Cart.png")).setFullPage(true));
        //click home page logo to return to the home page
        generalPage.clickHeaderHomePageIconLink();
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //click set product ("Rose Lip Butter") "View Details" button
        homePage.clickSetNewArrivalViewDetailsBtn(7);
        //capture screenshot of the single product page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Single Home Page New Arrival Product ('Rose Lip Butter') Page Display.png")).setFullPage(true));
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //single product page web element assert
        isSingleProductPageWebElementVisible(page);
        //single product page features list web element assert
        isSingleProductPageProductFeaturesListWebElementVisible(page);
        //single product page customer review section web element assert
        isSingleProductPageCustomerReviewSectionWebElementVisible(page);
        //single product page text element assert
        isSingleProductPageTextElementAsExpected(page);
        //single product page customer section text element assert
        isSingleProductPageCustomerReviewSectionTextElementAsExpected(page);
        //log single product page product data
        logSingleProductPageProductData(page);
        //log single product page product features data
        logSingleProductPageProductFeaturesData(page);
        //log single product page related products data
        logSingleProductPageRelatedProductData(page);
        //log single product page customer review section data
        logSingleProductPageCustomerReviewData(page);
        //click "Add to Cart" button
        singleProductPage.clickAddToCartButton();
        //capture screenshot of the single product page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Multiple Home Page New Arrival Products ('Coffee Scrub', 'Rose Lip Butter') To Cart Test Result.png")).setFullPage(true));
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add single home page bestselling product to check out tests (since the user with this category products gets straight to check out page after clicking either "Quick Purchase" or "Quick Buy" buttons)

    //add single home page bestselling ("Neem Shampoo") product to check out test method (as a guest)
    protected void addSingleHomePageProductToCheckoutGuestTest(){
        BasePage basePage = new BasePage(page);
        HomePage homePage = new HomePage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(1100);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //log home page product data
        logHomePageProductData(page);
        //log home page customer review data
        logHomePageCustomerReviewData(page);
        //log home page FAQ section data
        logHomePageFAQSectionData(page);
        //click set product ("Neem Shampoo") "Quick Purchase" button
        homePage.clickSetBestSellingQuickBuyBtn(2);
        //wait for elements to load
        basePage.waitForPageLoad(1100);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //capture screenshot of the checkout page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Checkout Page Display.png")).setFullPage(true));
        //checkout page web element assert
        isCheckoutPageWebElementVisible(page);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(page);
        //log checkout page product data
        logCheckoutPageProductData(page);
        //capture screenshot of the test result
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Add Single Home Page BestSelling Product To Checkout Test Result (guest).png")).setFullPage(true));
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add single shop dashboard product to cart tests

    //add single shop dashboard product ("Mint Lip Balm") to cart test method (as a guest)
    protected void addSingleShopDashboardProductToCartGuestTest(){
        BasePage basePage = new BasePage(page);
        GeneralPage generalPage = new GeneralPage(page);
        //wait for elements to load
        basePage.waitForPageLoad(1100);
        //general page web element assert
        isGeneralPageWebElementVisible(page);
        //general page text element assert
        isGeneralPageTextElementAsExpected(page);
        //home page web element assert
        isHomePageWebElementVisible(page);
        //home page text element assert
        isHomePageTextElementAsExpected(page);
        //capture screenshot of the home page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Home Page Display.png")).setFullPage(true));
        //log home page product data
        logHomePageProductData(page);
        //log home page customer review data
        logHomePageCustomerReviewData(page);
        //log home page FAQ section data
        logHomePageFAQSectionData(page);
        //click header navbar "Shop" link
        generalPage.clickSetHeaderNavbarLink(1);
        //wait for elements to load
        basePage.waitForPageLoad(1100);
        //shop dashboard web element assert
        isShopDashboardPageWebElementVisible(page);
        //shop dashboard text element assert
        isShopDashboardPageTextElementAsExpected(page);
        //log shop dashboard page price range data
        logShopDashboardPagePriceRangeData(page);
        //log shop dashboard page product data
        logShopDashboardPageProductData(page);
        //capture screenshot of the shop dashboard page display
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/resources/Shop Dashboard Page Display.png")).setFullPage(true));
    }

}
