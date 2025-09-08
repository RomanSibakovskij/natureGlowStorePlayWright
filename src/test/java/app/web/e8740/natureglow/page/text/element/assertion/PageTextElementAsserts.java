package app.web.e8740.natureglow.page.text.element.assertion;

import app.web.e8740.natureglow.*;
import com.microsoft.playwright.Page;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public interface PageTextElementAsserts {

 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page text element assert test method (elements that all pages have)
    default void isGeneralPageTextElementAsExpected(Page page){
        GeneralPage generalPage = new GeneralPage(page);
        //header
        //assert the header navbar link texts are as expected (as a list)
        List<String> expectedHeaderNavbarLinkTexts = Arrays.asList("HOME", "SHOP", "ABOUT US", "CONTACT US");
        List<String> actualHeaderNavbarLinkTexts = generalPage.getHeaderNavbarLinkText();
        assertEquals(expectedHeaderNavbarLinkTexts, actualHeaderNavbarLinkTexts, "The general page header navbar link text list doesn't match expectations.");
        //footer
        //assert the footer nature glow subtext is as expected
        assertEquals("Naturally crafted skincare essentials that nourish your skin and respect the planet. Ethical. Organic. You.", generalPage.getFooterNatureGlowSubtext(), "The general page footer nature glow subtext doesn't match expectations");
        //explore section
        //assert the footer explore section title is as expected
        assertEquals("Explore", generalPage.getFooterExploreSectionTitle(), "The general page footer explore section title doesn't match expectations.");
        //assert the footer explore section link texts are as expected (as a list)
        List<String> expectedFooterExploreSectionLinkTexts = Arrays.asList("Home", "Shop", "About Us", "Contact");
        List<String> actualFooterExploreSectionLinkTexts = generalPage.getFooterExploreSectionLinkText();
        assertEquals(expectedFooterExploreSectionLinkTexts, actualFooterExploreSectionLinkTexts, "The general page footer explore section link text list doesn't match expectations.");
        //helpful links section
        //assert the footer helpful links section title is as expected
        assertEquals("Helpful Links", generalPage.getFooterHelpfulLinksSectionTitle(), "The general page footer helpful links section title doesn't match expectations.");
        //assert the footer explore section link texts are as expected (as a list)
        List<String> expectedFooterHelpfulLinkTexts = Arrays.asList("FAQs", "Shipping & Returns", "Privacy Policy", "Terms of Service");
        List<String> actualFooterHelpfulLinkTexts = generalPage.getFooterHelpfulLinkText();
        assertEquals(expectedFooterHelpfulLinkTexts, actualFooterHelpfulLinkTexts, "The general page footer helpful links section link text list doesn't match expectations.");
        //get in touch section
        //assert the footer get in touch section title is as expected
        assertEquals("Get in Touch", generalPage.getFooterGetInTouchSectionTitle(), "The general page footer get in touch section title doesn't match expectations.");
        //assert the footer get in touch phone is as expected
        assertEquals("\uD83D\uDCDE +8801882585833", generalPage.getFooterGetInTouchPhone(), "The general page footer get in touch phone doesn't match expectations.");
        //assert the footer get in touch support email is as expected
        assertEquals("✉\uFE0F support@natureglow.com", generalPage.getFooterGetInTouchSupportEmail(), "The general page footer get in touch support email doesn't match expectations.");
        //assert the footer get in touch work time is as expected
        assertEquals("Sat - Thu | 9:00 AM - 6:00 PM", generalPage.getFooterGetInTouchWorkTime(), "The general page footer get in touch work time doesn't match expectations.");
        //copyright section
        //assert the footer copyright text is as expected
        assertEquals("© 2025 NatureGlow — Designed & Developed by Mohammad Abu Naim", generalPage.getFooterCopyrightText(), "The general page footer copyright text doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page text element assert test method
    default void isHomePageTextElementAsExpected(Page page){
        HomePage homePage = new HomePage(page);
        //welcome image
        //assert the home page welcome image text is as expected
        assertEquals("Hey, Welcome to\n" + "NatureGlow\n" + "\n" + "Discover our handcrafted organic skincare products made with botanical ingredients. Free from toxins, full of love — because your skin deserves the best nature has to offer.", homePage.getHomePageWelcomeText(), "The home page welcome text doesn't match expectations.");
        //assert the home page welcome image shop now button text is as expected
        assertEquals("SHOP NOW", homePage.getHomePageWelcomeShopNowBtnText(), "The home page welcome image shop now button text doesn't match expectations.");
        //featured categories section
        //assert the home page featured categories section title is as expected
        assertEquals("Featured Categories", homePage.getHomePageFeaturedCategoriesSectionTitle(), "The home page featured categories section title doesn't match expectations.");
        //assert the home page featured categories section subtitle is as expected
        assertEquals("Explore our curated product categories", homePage.getHomePageFeaturedCategoriesSectionSubtitle(), "The home page featured categories section subtitle doesn't match expectations.");
        //list elements
        //assert the home page featured category names are as expected (as a list)
        List<String> expectedHomePageFeaturedCategoryNames = Arrays.asList("Face Care", "Body Care", "Hair Care", "Lip Care");
        List<String> actualHomePageFeaturedCategoryNames = homePage.getHomePageFeaturedCategoriesName();
        assertEquals(expectedHomePageFeaturedCategoryNames, actualHomePageFeaturedCategoryNames, "The home page featured category names list doesn't match expectations.");
        //assert the home page featured category descriptions are as expected (as a list)
        List<String> expectedHomePageFeaturedCategoryDesc = Arrays.asList("\uD83D\uDCA7 Gentle care for radiant skin", "\uD83D\uDCA1 Full body nourishing products", "\uD83C\uDF3F Restore shine and scalp health", "\uD83D\uDC96 Softness sealed with hydration");
        List<String> actualHomePageFeaturedCategoryDesc = homePage.getHomePageFeaturedCategoriesDesc();
        assertEquals(expectedHomePageFeaturedCategoryDesc, actualHomePageFeaturedCategoryDesc, "The home page featured category descriptions list doesn't match expectations.");
        //bestselling products section
        //assert the home page bestselling products section title is as expected
        assertEquals("Best Selling Products", homePage.getHomePageBestSellingProductsSectionTitle(), "The home page bestselling products section title doesn't match expectations.");
        //assert the home page bestselling products section subtitle is as expected
        assertEquals("Loved by our customers, made by nature.", homePage.getHomePageBestSellingProductsSectionSubtitle(), "The home page bestselling products section subtitle doesn't match expectations.");
        //list elements
        //assert the home page bestselling products quick purchase button texts are as expected (as a list)
        List<String> actualBestSellingProductsQuickPurchaseBtnText = homePage.getHomePageBestSellingProductsQuickPurchaseBtnText();
        assertTrue(actualBestSellingProductsQuickPurchaseBtnText.stream().allMatch(text -> text.equals("Quick Purchase")), "The home page bestselling product quick purchase button text list doesn't match expectations.");
        //new arrivals section
        //assert the home page new arrivals section title is as expected
        assertEquals("New Arrivals", homePage.getHomePageNewArrivalProductsSectionTitle(), "The home page new arrivals section title doesn't match expectations.");
        //assert the home page new arrivals section subtitle is as expected
        assertEquals("Nature’s newest touch.", homePage.getHomePageNewArrivalProductsSectionSubtitle(), "The home page new arrivals section subtitle doesn't match expectations.");
        //list elements
        //assert the home page new arrivals product view details button texts are as expected (as a list)
        List<String> actualHomePageNewArrivalProductViewDetailsBtnTexts = homePage.getHomePageNewArrivalProductsViewDetailsBtnText();
        assertTrue(actualHomePageNewArrivalProductViewDetailsBtnTexts.stream().allMatch(text -> text.equals("View Details")), "The home page new arrival view details button text list doesn't match expectations.");
        //list elements
        //assert the home page new arrivals product quick buy button texts are as expected (as a list)
        List<String> actualHomePageNewArrivalProductQuickBuyBtnTexts = homePage.getHomePageNewArrivalProductsQuickBuyBtnText();
        assertTrue(actualHomePageNewArrivalProductQuickBuyBtnTexts.stream().allMatch(text -> text.equals("Quick Buy")), "The home page new arrival quick buy button text list doesn't match expectations.");
        //radiant skin
        //assert the home page radiant skin image title is as expected
        assertEquals("Discover the Secret to Radiant Skin", homePage.getHomePageRadiantSkinTitle(), "The home page radiant skin image title doesn't match expectations.");
        //assert the home page radiant skin image text is as expected
        assertEquals("Pamper yourself with our exclusive spa collection made from natural ingredients, designed to rejuvenate your skin and soul.", homePage.getHomePageRadiantSkinText(), "The home page radiant skin image text doesn't match expectations.");
        //assert the home page radiant skin image shop now button text is as expected
        assertEquals("SHOP NOW", homePage.getHomePageRadiantSkinShopNowBtnText(), "The home page radiant skin image shop now button text doesn't match expectations.");
        //customer reviews section
        //assert the home page customer reviews section title is as expected
        assertEquals("What Customers Are Saying", homePage.getHomePageCustomersSectionTitle(), "The home page customer reviews section title doesn't match expectations.");
        //assert the home page customer reviews section subtitle is as expected
        assertEquals("Real stories from happy skin", homePage.getHomePageCustomersSectionSubtitle(), "The home page customer reviews section subtitle doesn't match expectations.");
        //FAQ section
        //assert the home page FAQ section title is as expected
        assertEquals("Frequently Asked Questions", homePage.getHomePageFAQSectionTitle(), "The home page FAQ section title doesn't match expectations.");
        //assert the home page FAQ section subtitle is as expected
        assertEquals("Your skincare queries—answered naturally.", homePage.getHomePageFAQSectionSubtitle(), "The home page FAQ section subtitle doesn't match expectations.");
        //newsletter section
        //assert the home page newsletter section title is as expected
        assertEquals("Subscribe to Our Newsletter", homePage.getHomePageNewsletterSectionTitle(), "The home page newsletter section title doesn't match expectations.");
        //assert the home page newsletter section subtitle is as expected
        assertEquals("Be the first to know about new arrivals, exclusive offers & natural beauty tips.", homePage.getHomePageNewsletterSectionSubtitle(), "The home page newsletter section subtitle doesn't match expectations.");
        //assert the home page newsletter section description is as expected
        assertEquals("We care about your privacy. No spam. Unsubscribe anytime.", homePage.getHomePageNewsletterDesc(), "The home page newsletter section description doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //login/signup dashboard page text element assert test method
    default void isLoginSignUpDashPageTextElementAsExpected(Page page){
        LoginSignUpDashboardPage loginSignUpDashboardPage = new LoginSignUpDashboardPage(page);
        //assert the login/signup dashboard page nature glow title is as expected
        assertEquals("Welcome Back to NatureGlow", loginSignUpDashboardPage.getLoginSignUpDashPageNatureGlowTitle(), "The login/signup dashboard page nature glow title doesn't match expectations.");
        //assert the login/signup dashboard page nature glow text is as expected
        assertEquals("Discover the goodness of nature. Sign in to continue your journey towards natural beauty.", loginSignUpDashboardPage.getLoginSignUpDashPageNatureGlowText(), "The login/signup dashboard page nature glow text doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //login/signup dashboard page (sign up version) text element assert test method
    default void isLoginSignUpDashPageSignUpTextElementAsExpected(Page page){
        LoginSignUpDashboardPage loginSignUpDashboardPage = new LoginSignUpDashboardPage(page);
        //assert the login/signup dashboard page nature glow (sign up version) title is as expected
        assertEquals("Join the NatureGlow Family", loginSignUpDashboardPage.getLoginSignUpDashPageNatureGlowTitle(), "The login/signup dashboard page nature glow title (sign up version) doesn't match expectations.");
        //assert the login/signup dashboard page nature glow text (sign up version) is as expected
        assertEquals("Create your account and start your journey towards clean and natural beauty.", loginSignUpDashboardPage.getLoginSignUpDashPageNatureGlowText(), "The login/signup dashboard page nature glow text (sign up version) doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //login/signup dashboard page login section text element assert test method
    default void isLoginSignUpDashPageLoginSectionTextElementAsExpected(Page page){
        LoginSignUpDashboardPage loginSignUpDashboardPage = new LoginSignUpDashboardPage(page);
        //login section
        //assert the login/signup dashboard page login section title is as expected
        assertEquals("Sign In", loginSignUpDashboardPage.getLoginSignUpDashPageLoginSectionTitle(), "The login/signup dashboard page login section title doesn't match expectations.");
        //input form
        //assert the login/signup dashboard page login email subtext is as expected
        assertEquals("Email", loginSignUpDashboardPage.getLoginSignUpDashPageLoginEmailSubtext(), "The login/signup dashboard page login email subtext doesn't match expectations.");
        //assert the login/signup dashboard page login password subtext is as expected
        assertEquals("Password", loginSignUpDashboardPage.getLoginSignUpDashPageLoginPasswordSubtext(), "The login/signup dashboard page login password subtext doesn't match expectations.");
        //assert the login/signup dashboard page login forgot password link text is as expected
        assertEquals("Forgot Password?", loginSignUpDashboardPage.getLoginSignUpDashPageForgotPasswordLinkText(), "The login/signup dashboard page forgot password link text doesn't match expectations.");
        //assert the login/signup dashboard page sign in button text is as expected
        assertEquals("Sign In", loginSignUpDashboardPage.getLoginSignUpDashPageSignInButtonText(), "The login/signup dashboard page sign in button text doesn't match expectations.");
        //alt sign in
        //assert the login/signup dashboard page sign in with text is as expected
        assertEquals("Or sign in with", loginSignUpDashboardPage.getLoginSignUpDashPageSignInWithText(), "The login/signup dashboard page sign in with text doesn't match expectations.");
        //assert the login/signup dashboard page google sign in button text is as expected
        assertEquals("Sign in with Google", loginSignUpDashboardPage.getLoginSignUpDashPageGoogleSignInButtonText(), "The login/signup dashboard page google sign in button text doesn't match expectations.");
        //assert the login/signup dashboard page facebook sign in button text is as expected
        assertEquals("Sign in with Facebook", loginSignUpDashboardPage.getLoginSignUpDashPageFacebookSignInButtonText(), "The login/signup dashboard page facebook sign in button text doesn't match expectations.");
        //assert the login/signup dashboard page sign up text is as expected
        assertEquals("Don't have an account? Sign Up here", loginSignUpDashboardPage.getLoginSignUpDashPageSignUpText(), "The login/signup dashboard page sign up text doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //login/signup dashboard page signup section text element assert test method
    default void isLoginSignUpDashPageSignUpSectionTextElementAsExpected(Page page){
        LoginSignUpDashboardPage loginSignUpDashboardPage = new LoginSignUpDashboardPage(page);
        //assert the login/signup dashboard page sign up section title is as expected
        assertEquals("Create Account", loginSignUpDashboardPage.getLoginSignUpDashPageSignUpSectionTitle(), "The login/signup dashboard page sign up section title doesn't match expectations.");
        //input form
        //assert the login/signup dashboard page sign up full name subtext is as expected
        assertEquals("Full Name", loginSignUpDashboardPage.getLoginSignUpDashPageSignUpFullNameSubtext(), "The login/signup dashboard page sign up full name subtext doesn't match expectations.");
        //assert the login/signup dashboard page sign up email subtext is as expected
        assertEquals("Email", loginSignUpDashboardPage.getLoginSignUpDashPageSignUpEmailSubtext(), "The login/signup dashboard page sign up email subtext doesn't match expectations.");
        //assert the login/signup dashboard page sign up password subtext is as expected
        assertEquals("Password", loginSignUpDashboardPage.getLoginSignUpDashPageSignUpPasswordSubtext(), "The login/signup dashboard page sign up password subtext doesn't match expectations.");
        //assert the login/signup dashboard page sign up button text is as expected
        assertEquals("Sign Up", loginSignUpDashboardPage.getLoginSignUpDashPageSignUpButtonText(), "The login/signup dashboard page sign up button text doesn't match expectations.");
        //assert the login/signup dashboard page sign up section sign in text is as expected
        assertEquals("Already have an account? Sign In here", loginSignUpDashboardPage.getLoginSignUpDashPageSignInText(), "The login/signup dashboard page sign up section sign in text doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single product page text element assert test method
    default void isSingleProductPageTextElementAsExpected(Page page){
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //assert the single product page product features subtext is as expected
        assertEquals("Features:", singleProductPage.getSingleProductPageFeaturesSubtext(), "The single product page product features subtext doesn't match expectations.");
        //buttons
        //assert the single product page product add to cart button text is as expected
        assertEquals("Add to Cart", singleProductPage.getSingleProductPageProductAddToCartBtnText(), "The single product page product add to cart button text doesn't match expectations.");
        //assert the single product page product quick purchase button text is as expected
        assertEquals("Quick Purchase", singleProductPage.getSingleProductPageProductQuickPurchaseBtnText(), "The single product page product quick purchase button text doesn't match expectations.");
        //assert the single product page product back to shop link text is as expected
        assertEquals("Back to Shop", singleProductPage.getSingleProductPageProductBackToShopLinkText(), "The single product page product back to shop link text doesn't match expectations.");
        //related products section
        //assert the single product page related product section title is as expected
        assertEquals("Related Products", singleProductPage.getSingleProductPageRelatedProductsSectionTitle(), "The single product page related product section title doesn't match expectations.");
        //list elements
        //assert the single product page related product view details button texts are as expected (as a list)
        List<String> actualSingleProductPageRelatedProductViewDetailsBtnTexts = singleProductPage.getSingleProductPageRelatedProductViewDetailsBtnText();
        assertTrue(actualSingleProductPageRelatedProductViewDetailsBtnTexts.stream().allMatch(text -> text.equals("View Details")), "The single product page related product view details button text list doesn't match expectations.");
        //assert the single product page related product quick buy button texts are as expected (as a list)
        List<String> actualSingleProductPageRelatedProductQuickBuyBtnTexts = singleProductPage.getSingleProductPageRelatedProductQuickBuyBtnText();
        assertTrue(actualSingleProductPageRelatedProductQuickBuyBtnTexts.stream().allMatch(text -> text.equals("Quick Buy")), "The single product page related product quick buy button text list doesn't match expectations.");
        //singular elements
        //assert the single product page customer review section title is as expected
        assertEquals("Customer Review", singleProductPage.getSingleProductPageCustomerReviewSectionTitle(), "The single product page customer review section title doesn't match expectations.");
        //leave review section
        //assert the single product page leave review section title is as expected
        assertEquals("Leave Review", singleProductPage.getSingleProductPageLeaveReviewSectionTitle(), "The single product page leave review section title doesn't match expectations.");
        //input form
        //assert the single product page leave review rating subtext is as expected
        assertEquals("Rating*", singleProductPage.getSingleProductPageLeaveReviewRatingSubtext(), "The single product page leave review rating subtext doesn't match expectations.");
        //assert the single product page leave review subtext is as expected
        assertEquals("Review*", singleProductPage.getSingleProductPageLeaveReviewSubtext(), "The single product page leave review subtext doesn't match expectations.");
        //buttons
        //assert the single product page leave review reset button text is as expected
        assertEquals("Reset", singleProductPage.getSingleProductPageLeaveReviewResetBtnText(), "The single product page leave review reset button text doesn't match expectations.");
        //assert the single product page leave review submit button text is as expected
        assertEquals("Submit Review", singleProductPage.getSingleProductPageLeaveReviewSubmitBtnText(), "The single product page leave review submit button text doesn't match expectations.");
    }

    //single product page customer review section text element assert test method (those are displayed if the product has submitted reviews)
    default void isSingleProductPageCustomerReviewSectionTextElementAsExpected(Page page){
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //assert the single product page customer review subtexts are as expected (as a list)
        List<String> actualSingleProductPageCustomerReviewSubtexts = singleProductPage.getSingleProductPageCustomerReviewSubtext();
        assertTrue(actualSingleProductPageCustomerReviewSubtexts.stream().allMatch(text -> text.equals("Review")), "The single product page customer review subtext list doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shop dashboard page text element assert test method
    default void isShopDashboardPageTextElementAsExpected(Page page){
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);
        //assert the shop dashboard page title is as expected
        assertEquals("Explore Natural Beauty", shopDashboardPage.getShopDashboardPageTitle(), "The shop dashboard page title doesn't match expectations.");
        //assert the shop dashboard page subtitle is as expected
        assertEquals("Find the perfect organic essentials for your everyday self-care", shopDashboardPage.getShopDashboardPageSubtitle(), "The shop dashboard page subtitle doesn't match expectations.");
        //aside category section
        //assert the shop dashboard page aside category section title is as expected
        assertEquals("Category", shopDashboardPage.getShopDashboardPageAsideCategorySectionTitle(), "The shop dashboard page aside category section title doesn't match expectations.");
        //list elements
        //assert the shop dashboard page aside category subtexts are as expected (as a list)
        List<String> expectedAsideCategorySubtexts = Arrays.asList("All", "Face Care", "Body Care", "Hair Care", "Lip Care");
        List<String> actualAsideCategorySubtexts = shopDashboardPage.getShopDashboardPageAsideCategorySubtext();
        assertEquals(expectedAsideCategorySubtexts, actualAsideCategorySubtexts, "The shop dashboard page aside category subtext list doesn't match expectations.");
        //aside price range section
        //assert the shop dashboard page aside price range section title is as expected
        assertEquals("Price Range", shopDashboardPage.getShopDashboardPageAsidePriceRangeSectionTitle(), "The shop dashboard page aside price range section title doesn't match expectations.");
        //assert the shop dashboard page aside min price range subtext is as expected
        assertEquals("min:", shopDashboardPage.getShopDashboardPageAsideMinPriceRange(), "The shop dashboard page min price range subtext doesn't match expectations.");
        //assert the shop dashboard page aside current price range subtext is as expected
        assertEquals("crnt:", shopDashboardPage.getShopDashboardPageAsideCurrentPriceRange(), "The shop dashboard page current price range subtext doesn't match expectations.");
        //assert the shop dashboard page aside max price range subtext is as expected
        assertEquals("max:", shopDashboardPage.getShopDashboardPageAsideMaxPriceRange(), "The shop dashboard page max price range subtext doesn't match expectations.");
        //aside availability section
        //assert the shop dashboard page aside availability section title is as expected
        assertEquals("Availability", shopDashboardPage.getShopDashboardPageAsideAvailabilitySectionTitle(), "The shop dashboard page aside availability section title doesn't match expectations.");
        //list elements
        //assert the shop dashboard page aside availability subtexts are as expected (as a list)
        List<String> expectedAsideAvailabilitySubtexts = Arrays.asList("In Stock", "Low Stock", "Coming Soon");
        List<String> actualAsideAvailabilitySubtexts = shopDashboardPage.getShopDashboardPageAsideAvailabilitySubtext();
        assertEquals(expectedAsideAvailabilitySubtexts, actualAsideAvailabilitySubtexts, "The shop dashboard page aside availability subtext list doesn't match expectations.");
        //main
        //assert the shop dashboard page search button text is as expected
        assertEquals("Search..", shopDashboardPage.getShopDashboardPageSearchButtonText(), "The shop dashboard page search button text doesn't match expectations.");
        //list elements
        //assert the shop dashboard page pagination button texts are as expected (as a list) (the assert returns empty list since the product list fails to be loaded)
//        List<String> expectedPaginationBtnTexts = Arrays.asList("Prev", "1", "2", "Next");
//        List<String> actualPaginationBtnTexts = shopDashboardPage.getShopDashboardPagePaginationButtonText();
//        assertEquals(expectedPaginationBtnTexts, actualPaginationBtnTexts, "The shop dashboard page pagination button text list doesn't match expectations.");
        //assert the shop dashboard page product view details button texts are as expected (as a list)
        List<String> actualShopDashPageProductViewDetailsBtnTexts = shopDashboardPage.getShopDashboardPageProductViewDetailsBtnText();
        assertTrue(actualShopDashPageProductViewDetailsBtnTexts.stream().allMatch(text -> text.equals("View Details")), "The shop dashboard page product view details button text list doesn't match expectations.");
        //list elements
        //assert the shop dashboard page product quick buy button texts are as expected (as a list)
        List<String> actualShopDashPageProductQuickBuyBtnTexts = shopDashboardPage.getShopDashboardPageProductQuickBuyBtnText();
        assertTrue(actualShopDashPageProductQuickBuyBtnTexts.stream().allMatch(text -> text.equals("Quick Buy")), "The shop dashboard page product quick buy button text list doesn't match expectations.");

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //checkout page text element assert test method
    default void isCheckoutPageTextElementAsExpected(Page page){
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page title is as expected
        assertEquals("Checkout & Order Summary", checkoutPage.getCheckoutPageTitle(), "The checkout page title doesn't match expectations.");
        //assert the checkout page subtitle is as expected
        assertEquals("Fill in your details and confirm your order to receive your naturally crafted products.", checkoutPage.getCheckoutPageSubtitle(), "The checkout page subtitle doesn't match expectations.");
        //customer info section
        //assert the checkout page customer info section title is as expected
        assertEquals("Customer Information", checkoutPage.getCheckoutPageCustomerInfoSectionTitle(), "The checkout page customer info section title doesn't match expectations.");
        //input form
        //assert the checkout page full name subtext is as expected
        assertEquals("Full Name*", checkoutPage.getCheckoutPageFullNameSubtext(), "The checkout page full name subtext doesn't match expectations.");
        //assert the checkout page email subtext is as expected
        assertEquals("Email (Optional)", checkoutPage.getCheckoutPageEmailSubtext(), "The checkout page email subtext doesn't match expectations.");
        //assert the checkout page phone subtext is as expected
        assertEquals("Phone Number*", checkoutPage.getCheckoutPagePhoneSubtext(), "The checkout page phone subtext doesn't match expectations.");
        //assert the checkout page address subtext is as expected
        assertEquals("Address*", checkoutPage.getCheckoutPageAddressSubtext(), "The checkout page address subtext doesn't match expectations.");
        //assert the checkout page order note subtext is as expected
        assertEquals("Order note (Optional)", checkoutPage.getCheckoutPageOrderNoteSubtext(), "The checkout page order note subtext doesn't match expectations.");
        //product table
        //assert the checkout page product table section title is as expected
        assertEquals("Your Products", checkoutPage.getCheckoutPageProductTableSectionTitle(), "The checkout page product table section title doesn't match expectations.");
        //list elements
        //assert the checkout page product quantity subtexts are as expected (as a list)
        List<String> actualProductTableQtySubtexts = checkoutPage.getCheckoutPageProductQtySubtext();
        assertTrue(actualProductTableQtySubtexts.stream().allMatch(text -> text.equals("Qty")), "The checkout page product quantity subtext list doesn't match expectations.");
        //order summary section
        //assert the checkout page order summary section title is as expected
        assertEquals("Order Summary", checkoutPage.getCheckoutPageOrderSummarySectionTitle(), "The checkout page order summary section title doesn't match expectations.");
        //assert the checkout page order summary subtext is as expected
        assertEquals("Summary", checkoutPage.getCheckoutPageOrderShippingSubtext(), "The checkout page order summary subtext doesn't match expectations.");
        //assert the checkout page order summary subtotal subtext is as expected
        assertEquals("Sub Total", checkoutPage.getCheckoutPageOrderSubtotalSubtext(), "The checkout page order subtotal subtext doesn't match expectations.");
        //assert the checkout page order summary total subtext is as expected
        assertEquals("Total", checkoutPage.getCheckoutPageOrderTotalSubtext(), "The checkout page order summary total subtext doesn't match expectations.");
        //payment method section
        //assert the checkout page payment method section title is as expected
        assertEquals("Payment Method", checkoutPage.getCheckoutPagePayMethodSectionTitle(), "The checkout page payment method section title doesn't match expectations.");
        //list elements
        //assert the checkout page payment method button texts are as expected (as a list)
        List<String> expectedPayMethodBtnTexts = Arrays.asList("Cash on Delivery", "Stripe", "SSLCommerz");
        List<String> actualPayMethodBtnTexts = checkoutPage.getCheckoutPagePayMethodBtnText();
        assertEquals(expectedPayMethodBtnTexts, actualPayMethodBtnTexts, "The checkout page payment method button text list doesn't match expectations.");
        //button
        //assert the checkout page place order button text is as expected
        assertEquals("Place Order", checkoutPage.getCheckoutPagePlaceOrderBtnText(), "The checkout page place order button text doesn't match expectations.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
