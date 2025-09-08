package app.web.e8740.natureglow.page.web.element.assertion;

import app.web.e8740.natureglow.*;
import com.microsoft.playwright.Page;

import static org.junit.jupiter.api.Assertions.assertTrue;

public interface PageWebElementAsserts {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page web element assert test method (elements all pages have)
    default void isGeneralPageWebElementVisible(Page page) {
        GeneralPage generalPage = new GeneralPage(page);
        //header
        //assert header homepage icon link is displayed
        assertTrue(generalPage.isHeaderHomePageIconLinkVisible(), "The header home page icon link isn't visible.");
        //list elements
        //assert header navbar links are displayed
        assertTrue(generalPage.isHeaderNavbarLinkElementsVisible(), "The header navbar links aren't visible.");
        //singular elements
        //assert header homepage shopping cart button is displayed
        assertTrue(generalPage.isHeaderShoppingCartButtonVisible(), "The header shopping cart button isn't visible.");
        //footer
        //assert footer nature glow icon is displayed
        assertTrue(generalPage.isFooterNatureGlowIconVisible(), "The footer nature glow icon isn't visible.");
        //assert footer nature glow subtext is displayed
        assertTrue(generalPage.isFooterNatureGlowSubtextVisible(), "The footer nature glow subtext isn't visible.");
        //explore section
        //assert footer explore section title is displayed
        assertTrue(generalPage.isFooterExploreSectionTitleVisible(), "The footer explore section title isn't visible.");
        //list elements
        //assert footer explore section links are displayed
        assertTrue(generalPage.isFooterExploreSectionLinkElementsVisible(), "The footer explore section links aren't visible.");
        //helpful links section
        //assert footer helpful links section title is displayed
        assertTrue(generalPage.isFooterHelpfulLinksSectionTitleVisible(), "The footer helpful links section title isn't visible.");
        //list elements
        //assert footer helpful links are displayed
        assertTrue(generalPage.isFooterHelpfulLinksSectionLinkElementsVisible(), "The footer helpful links aren't visible.");
        //get in touch section
        //assert footer get in touch section title is displayed
        assertTrue(generalPage.isFooterGetInTouchSectionTitleVisible(), "The footer get in touch section title isn't visible.");
        //assert footer get in touch phone is displayed
        assertTrue(generalPage.isFooterGetInTouchPhoneVisible(), "The footer get in touch phone isn't visible.");
        //assert footer get in touch support email is displayed
        assertTrue(generalPage.isFooterGetInTouchSupportEmailVisible(), "The footer get in touch support email isn't visible.");
        //assert footer get in touch work time is displayed
        assertTrue(generalPage.isFooterGetInTouchWorkTimeVisible(), "The footer get in touch work time isn't visible.");
        //socials (list elements)
        //assert footer social icon links are displayed
        assertTrue(generalPage.isFooterSocialIconLinkElementsVisible(), "The footer social icon links aren't visible.");
        //copyright section
        //assert footer copyright text is displayed
        assertTrue(generalPage.isFooterCopyrightTextVisible(), "The footer copyright text isn't visible.");
        //assert footer creator link is displayed
        assertTrue(generalPage.isFooterCreatorLinkVisible(), "The footer creator link isn't visible.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page web element assert test method
    default void isHomePageWebElementVisible(Page page) {
        HomePage homePage = new HomePage(page);
        //welcome image section
        //assert the home page welcome image is displayed
        assertTrue(homePage.isHomePageWelcomeImageVisible(), "The home page welcome image isn't visible.");
        //assert the home page welcome text is displayed
        assertTrue(homePage.isHomePageWelcomeTextVisible(), "The home page welcome text isn't visible.");
        //assert the home page welcome image shop button is displayed
        assertTrue(homePage.isHomePageWelcomeImgShopBtnVisible(), "The home page welcome image shop button isn't visible.");
        //featured categories section
        //assert the home page featured categories section title is displayed
        assertTrue(homePage.isHomePageFeaturedCategoriesSectionTitleVisible(), "The home page featured categories section title isn't visible.");
        //assert the home page featured categories section subtitle is displayed
        assertTrue(homePage.isHomePageFeaturedCategoriesSectionSubtitleVisible(), "The home page featured categories section subtitle isn't visible.");
        //list elements
        //assert the home page featured categories images are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedCategoriesImgElementVisible(), "The home page featured categories images aren't visible.");
        //assert the home page featured categories links are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedCategoriesLinkElementVisible(), "The home page featured categories links aren't visible.");
        //assert the home page featured categories names are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedCategoriesNameElementVisible(), "The home page featured categories names aren't visible.");
        //assert the home page featured categories descriptions are displayed (as a list)
        assertTrue(homePage.isHomePageFeaturedCategoriesDescElementVisible(), "The home page featured categories descriptions aren't visible.");
        //bestselling products section
        //assert the home page bestselling products section title is displayed
        assertTrue(homePage.isHomePageBestSellingProductsSectionTitleVisible(), "The home page bestselling products section title isn't visible.");
        //assert the home page bestselling products section subtitle is displayed
        assertTrue(homePage.isHomePageBestSellingProductsSectionSubtitleVisible(), "The home page bestselling products section subtitle isn't visible.");
        //products table (list elements)
        //assert the home page bestselling product images are displayed (as a list)
        assertTrue(homePage.isHomePageBestSellingProductImgElementVisible(), "The home page bestselling product images aren't visible.");
        //assert the home page bestselling product names are displayed (as a list)
        assertTrue(homePage.isHomePageBestSellingProductNameElementVisible(), "The home page bestselling product names aren't visible.");
        //assert the home page bestselling product descriptions are displayed (as a list)
        assertTrue(homePage.isHomePageBestSellingProductDescElementVisible(), "The home page bestselling product descriptions aren't visible.");
        //assert the home page bestselling product unit prices are displayed (as a list)
        assertTrue(homePage.isHomePageBestSellingProductUnitPriceElementVisible(), "The home page bestselling product unit prices aren't visible.");
        //assert the home page bestselling product quick purchase buttons are displayed (as a list)
        assertTrue(homePage.isHomePageBestSellingProductQuickPurchaseBtnElementVisible(), "The home page bestselling product quick purchase buttons aren't visible.");
        //new arrival products section
        //assert the home page new arrival products section title is displayed
        assertTrue(homePage.isHomePageNewArrivalProductsSectionTitleVisible(), "The home page new arrival products section title isn't visible.");
        //assert the home page new arrival products section subtitle is displayed
        assertTrue(homePage.isHomePageNewArrivalProductsSectionSubtitleVisible(), "The home page new arrival products section subtitle isn't visible.");
        //products table (list elements)
        //assert the home page new arrival product images are displayed (as a list)
        assertTrue(homePage.isHomePageNewArrivalProductImgElementVisible(), "The home page new arrival product images aren't visible.");
        //assert the home page new arrival product names are displayed (as a list)
        assertTrue(homePage.isHomePageNewArrivalProductNameElementVisible(), "The home page new arrival product names aren't visible.");
        //assert the home page new arrival product categories are displayed (as a list)
        assertTrue(homePage.isHomePageNewArrivalProductCategoryElementVisible(), "The home page new arrival product categories aren't visible.");
        //assert the home page new arrival product description are displayed (as a list)
        assertTrue(homePage.isHomePageNewArrivalProductDescElementVisible(), "The home page new arrival product descriptions aren't visible.");
        //assert the home page new arrival product unit prices are displayed (as a list)
        assertTrue(homePage.isHomePageNewArrivalProductUnitPriceElementVisible(), "The home page new arrival product unit prices aren't visible.");
        //assert the home page new arrival product availabilities are displayed (as a list)
        assertTrue(homePage.isHomePageNewArrivalProductAvailabilityElementVisible(), "The home page new arrival product availabilities aren't visible.");
        //assert the home page new arrival product view details buttons are displayed (as a list)
        assertTrue(homePage.isHomePageNewArrivalProductViewDetailsBtnElementVisible(), "The home page new arrival product view details buttons aren't visible.");
        //assert the home page new arrival product quick purchase buttons are displayed (as a list)
        assertTrue(homePage.isHomePageNewArrivalProductQuickBuyBtnElementVisible(), "The home page new arrival product quick purchase buttons aren't visible.");
        //radiant skin
        //assert the home page radiant skin image is displayed
        assertTrue(homePage.isHomePageRadiantSkinImageVisible(), "The home page radiant skin image isn't visible.");
        //assert the home page radiant skin title is displayed
        assertTrue(homePage.isHomePageRadiantSkinTitleVisible(), "The home page radiant skin title isn't visible.");
        //assert the home page radiant skin text is displayed
        assertTrue(homePage.isHomePageRadiantSkinTextVisible(), "The home page radiant skin text isn't visible.");
        //assert the home page radiant skin image shop button is displayed
        assertTrue(homePage.isHomePageRadiantSkinImgShopBtnVisible(), "The home page radiant skin image shop button isn't visible.");
        //customer reviews section
        //assert the home page customer reviews section title is displayed
        assertTrue(homePage.isHomePageCustomersSectionTitleVisible(), "The home page customer reviews section title isn't visible.");
        //assert the home page customer reviews section subtitle is displayed
        assertTrue(homePage.isHomePageCustomersSectionSubtitleVisible(), "The home page customer reviews section subtitle isn't visible.");
        //list elements
        //assert the home page customer reviews texts are displayed (as a list)
        assertTrue(homePage.isHomePageCustomerReviewTextElementVisible(), "The home page customer reviews section texts aren't visible.");
        //assert the home page customer reviews stars are displayed (as a list)
        assertTrue(homePage.isHomePageCustomerReviewStarElementVisible(), "The home page customer reviews section review stars aren't visible.");
        //assert the home page customer pictures are displayed (as a list)
        assertTrue(homePage.isHomePageCustomerPictureElementVisible(), "The home page customer pictures aren't visible.");
        //assert the home page customer names are displayed (as a list)
        assertTrue(homePage.isHomePageCustomerNameElementVisible(), "The home page customer names aren't visible.");
        //assert the home page customer titles are displayed (as a list) (the titles cannot be found with VALID selector)
        //assertTrue(homePage.isHomePageCustomerOccupationElementVisible(), "The home page customer titles aren't visible.");
        //FAQ section
        //assert the home page FAQ section title is displayed
        assertTrue(homePage.isHomePageFAQSectionTitleVisible(), "The home page FAQ section title isn't visible.");
        //assert the home page FAQ section subtitle is displayed
        assertTrue(homePage.isHomePageFAQSectionSubtitleVisible(), "The home page FAQ section subtitle isn't visible.");
        //list elements
        //assert the home page FAQ dropdown links are displayed (as a list)
        assertTrue(homePage.isHomePageFAQDropdownLinkElementVisible(), "The home page FAQ dropdown links aren't visible.");
        //newsletter section
        //assert the home page newsletter section title is displayed
        assertTrue(homePage.isHomePageNewsletterSectionTitleVisible(), "The home page newsletter section title isn't visible.");
        //assert the home page newsletter section subtitle is displayed
        assertTrue(homePage.isHomePageNewsletterSectionSubtitleVisible(), "The home page newsletter section subtitle isn't visible.");
        //assert the home page newsletter section email input field is displayed
        assertTrue(homePage.isHomePageNewsletterEmailInputFieldVisible(), "The home page newsletter section email input field isn't visible.");
        //assert the home page newsletter section subscribe button is displayed
        assertTrue(homePage.isHomePageNewsletterSubscribeBtnVisible(), "The home page newsletter section subscribe button isn't visible.");
        //assert the home page newsletter section description is displayed
        assertTrue(homePage.isHomePageNewsletterDescVisible(), "The home page newsletter section description isn't visible.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //login/signup dashboard page web element assert test method
    default void isLoginSignUpDashPageWebElementVisible(Page page) {
        LoginSignUpDashboardPage loginSignUpDashboardPage = new LoginSignUpDashboardPage(page);
        //assert the login/signup dashboard page nature glow image title is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageNatureGlowTitleVisible(), "The login/signup dashboard page nature glow image title isn't visible.");
        //assert the login/signup dashboard page nature glow image text is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageNatureGlowTextVisible(), "The login/signup dashboard page nature glow image text isn't visible.");
        //assert the login/signup dashboard page nature glow image is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageNatureGlowImageVisible(), "The login/signup dashboard page nature glow image isn't visible.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //login/signup dashboard page login section web element assert test method
    default void isLoginSignUpDashPageLoginSectionWebElementVisible(Page page) {
        LoginSignUpDashboardPage loginSignUpDashboardPage = new LoginSignUpDashboardPage(page);
        //login section
        //assert the login/signup dashboard page login section title is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageLoginSectionTitleVisible(), "The login/signup dashboard page login section title isn't visible.");
        //input form
        //assert the login/signup dashboard page email subtext is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageLoginEmailSubtextVisible(), "The login/signup dashboard page nature email subtext isn't visible.");
        //assert the login/signup dashboard page email input field is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageLoginEmailInputFieldVisible(), "The login/signup dashboard page email input field isn't visible.");
        //assert the login/signup dashboard page password subtext is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageLoginPasswordSubtextVisible(), "The login/signup dashboard page nature password subtext isn't visible.");
        //assert the login/signup dashboard page password input field is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageLoginPasswordInputFieldVisible(), "The login/signup dashboard page password input field isn't visible.");
        //assert the login/signup dashboard page view password button is displayed (the element isn't visible with valid selector)
        //assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageLoginViewPasswordButtonVisible(), "The login/signup dashboard page view password button isn't visible.");
        //assert the login/signup dashboard page forgot password link is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageForgotPasswordLinkVisible(), "The login/signup dashboard page forgot password link isn't visible.");
        //assert the login/signup dashboard page sign in button is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignInButtonVisible(), "The login/signup dashboard page sign in button isn't visible.");
        //alt sign in
        //assert the login/signup dashboard page sign in text is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignInWithTextVisible(), "The login/signup dashboard page sign in text isn't visible.");
        //assert the login/signup dashboard page google sign in button is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageGoogleSignInButtonVisible(), "The login/signup dashboard page google sign in button isn't visible.");
        //assert the login/signup dashboard page facebook sign in button is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageFacebookSignInButtonVisible(), "The login/signup dashboard page facebook sign in button isn't visible.");
        //assert the login/signup dashboard page sign up text is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignUpTextVisible(), "The login/signup dashboard page sign up text isn't visible.");
        //assert the login/signup dashboard page sign up link is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignUpLinkVisible(), "The login/signup dashboard page sign up link isn't visible.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //login/signup dashboard page signup section web element assert test method
    default void isLoginSignUpDashPageSignUpSectionWebElementVisible(Page page) {
        LoginSignUpDashboardPage loginSignUpDashboardPage = new LoginSignUpDashboardPage(page);
        //assert the login/signup dashboard page sign up section title is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignUpSectionTitleVisible(), "The login/signup dashboard page sign up section title isn't visible.");
        //input form
        //assert the login/signup dashboard page sign up full name subtext is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignUpFullNameSubtextVisible(), "The login/signup dashboard page sign up full name subtext isn't visible.");
        //assert the login/signup dashboard page sign up full name input field is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignUpFullNameInputFieldVisible(), "The login/signup dashboard page sign up full name input field isn't visible.");
        //assert the login/signup dashboard page sign up email subtext is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignUpEmailSubtextVisible(), "The login/signup dashboard page sign up email subtext isn't visible.");
        //assert the login/signup dashboard page sign up email input field is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignUpEmailInputFieldVisible(), "The login/signup dashboard page sign up email input field isn't visible.");
        //assert the login/signup dashboard page sign up password subtext is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignUpPasswordSubtextVisible(), "The login/signup dashboard page sign up password subtext isn't visible.");
        //assert the login/signup dashboard page sign up password input field is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignUpPasswordInputFieldVisible(), "The login/signup dashboard page sign up password input field isn't visible.");
        //assert the login/signup dashboard page sign up view password button is displayed (element isn't visible with valid selector)
        //assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignUpViewPasswordButtonVisible(), "The login/signup dashboard page sign up view password button isn't visible.");
        //assert the login/signup dashboard page sign up button is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignUpButtonVisible(), "The login/signup dashboard page sign up button isn't visible.");
        //assert the login/signup dashboard page sign up section sign in text is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignInTextVisible(), "The login/signup dashboard page sign up section sign in text isn't visible.");
        //assert the login/signup dashboard page sign up section sign in link is displayed
        assertTrue(loginSignUpDashboardPage.isLoginSignUpDashPageSignInLinkVisible(), "The login/signup dashboard page sign up section sign in link isn't visible.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single product page web element assert test method
    default void isSingleProductPageWebElementVisible(Page page) {
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //assert the single product page product main image is visible
        assertTrue(singleProductPage.isSingleProductPageProductMainImgVisible(), "The single product page product main image isn't visible.");
        //assert the single product page product name is visible
        assertTrue(singleProductPage.isSingleProductPageProductNameVisible(), "The single product page product name isn't visible.");
        //assert the single product page product category name is visible
        assertTrue(singleProductPage.isSingleProductPageProductCategoryNameVisible(), "The single product page product category name isn't visible.");
        //assert the single product page product unit price is visible
        assertTrue(singleProductPage.isSingleProductPageProductUnitPriceVisible(), "The single product page product unit price isn't visible.");
        //assert the single product page product description is visible
        assertTrue(singleProductPage.isSingleProductPageProductDescriptionVisible(), "The single product page product description isn't visible.");
        //assert the single product page product features subtext is visible
        assertTrue(singleProductPage.isSingleProductPageProductFeaturesSubtextVisible(), "The single product page product features subtext isn't visible.");
        //assert the single product page product availability is visible
        assertTrue(singleProductPage.isSingleProductPageProductAvailabilityVisible(), "The single product page product availability isn't visible.");
        //buttons
        //assert the single product page product add to cart button is visible
        assertTrue(singleProductPage.isSingleProductPageProductAddToCartBtnVisible(), "The single product page product add to cart button isn't visible.");
        //assert the single product page product quick purchase button is visible
        assertTrue(singleProductPage.isSingleProductPageProductQuickPurchaseBtnVisible(), "The single product page product quick purchase button isn't visible.");
        //assert the single product page product back to shop link is visible
        assertTrue(singleProductPage.isSingleProductPageProductBackToShopLinkVisible(), "The single product page product back to shop link isn't visible.");
        //related products section
        //assert the single product page related products section title is visible
        assertTrue(singleProductPage.isSingleProductPageRelatedProductsSectionTitleVisible(), "The single product page related products section title isn't visible.");
        //list elements
        //assert the single product page related product images are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageRelatedProductImgElementVisible(), "The single product page related product images aren't visible.");
        //assert the single product page related product names are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageRelatedProductNameElementVisible(), "The single product page related product names aren't visible.");
        //assert the single product page related product category names are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageRelatedProductCategoryNameElementVisible(), "The single product page related product category names aren't visible.");
        //assert the single product page related product descriptions are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageRelatedProductDescElementVisible(), "The single product page related product descriptions aren't visible.");
        //assert the single product page related product unit prices are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageRelatedProductUnitPriceElementVisible(), "The single product page related product unit prices aren't visible.");
        //assert the single product page related product availabilities are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageRelatedProductAvailabilityElementVisible(), "The single product page related product availabilities aren't visible.");
        //buttons
        //assert the single product page related product view details buttons are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageRelatedProductViewDetailsBtnElementVisible(), "The single product page related product view details buttons aren't visible.");
        //assert the single product page related product quick buy buttons are visible(as a list)
        assertTrue(singleProductPage.isSingleProductPageRelatedProductQuickBuyBtnElementVisible(), "The single product page related product quick buy buttons aren't visible.");
        //customer review section
        //assert the single product page customer review section title is visible
        assertTrue(singleProductPage.isSingleProductPageCustomerReviewSectionTitleVisible(), "The single product page customer review section title isn't visible.");
        //leave review section
        //assert the single product page leave review section title is visible
        assertTrue(singleProductPage.isSingleProductPageLeaveReviewSectionTitleVisible(), "The single product page leave review section title isn't visible.");
        //input form
        //assert the single product page leave review rating subtext is visible
        assertTrue(singleProductPage.isSingleProductPageLeaveReviewRatingSubtextVisible(), "The single product page leave review rating subtext isn't visible.");
        //list elements
        //assert the single product page leave review rating stars are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageLeaveReviewRatingStarElementVisible(), "The single product page leave review rating stars aren't visible.");
        //singular elements
        //assert the single product page leave review subtext is visible
        assertTrue(singleProductPage.isSingleProductPageLeaveReviewSubtextVisible(), "The single product page leave review subtext isn't visible.");
        //assert the single product page leave review text area is visible
        assertTrue(singleProductPage.isSingleProductPageLeaveReviewTextAreaVisible(), "The single product page leave review text area isn't visible.");
        //buttons
        //assert the single product page leave review reset button is visible
        assertTrue(singleProductPage.isSingleProductPageLeaveReviewResetBtnVisible(), "The single product page leave review reset button isn't visible.");
        //assert the single product page leave review submit button is visible
        assertTrue(singleProductPage.isSingleProductPageLeaveReviewSubmitBtnVisible(), "The single product page leave review submit button isn't visible.");
    }

    //single product page features list web element assert test method (not all products have this list)
    default void isSingleProductPageProductFeaturesListWebElementVisible(Page page){
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //assert the single product page product features are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageProductFeaturesListElementVisible(), "The single product page product features aren't visible.");
    }

    //single product page customer review section web element assert test method (those are displayed if the product has submitted reviews)
    default void isSingleProductPageCustomerReviewSectionWebElementVisible(Page page){
        SingleProductPage singleProductPage = new SingleProductPage(page);
        //assert the single product page customer review profile images are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageCustomerReviewProfileImgElementVisible(), "The single product page customer review profile images aren't visible.");
        //assert the single product page customer review profile names are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageCustomerReviewProfileNameElementVisible(), "The single product page customer review profile names aren't visible.");
        //assert the single product page customer review submitted review stars are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageCustomerReviewSubmittedReviewStarElementVisible(), "The single product page customer review submitted review stars aren't visible.");
        //assert the single product page customer review subtexts are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageCustomerReviewSubtextElementVisible(), "The single product page customer review subtexts aren't visible.");
        //assert the single product page customer review texts are visible (as a list)
        assertTrue(singleProductPage.isSingleProductPageCustomerReviewTextElementVisible(), "The single product page customer review texts aren't visible.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shop dashboard page web element test assert method
    default void  isShopDashboardPageWebElementVisible(Page page){
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);
        //assert the shop dashboard page title is visible
        assertTrue(shopDashboardPage.isShopDashboardPageTitleVisible(), "The shop dashboard page title isn't visible.");
        //assert the shop dashboard page subtitle is visible
        assertTrue(shopDashboardPage.isShopDashboardPageSubtitleVisible(), "The shop dashboard page subtitle isn't visible.");
        //aside category section
        //assert the shop dashboard page aside category section title is visible
        assertTrue(shopDashboardPage.isShopDashboardPageAsideCategorySectionTitleVisible(), "The shop dashboard page aside category section title isn't visible.");
        //list elements
        //assert the shop dashboard page aside category radio buttons are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageAsideCategoryRadioBtnElementVisible(), "The shop dashboard page aside category radio buttons aren't visible.");
        //assert the shop dashboard page aside category subtexts are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageAsideCategorySubtextElementVisible(), "The shop dashboard page aside category subtexts aren't visible.");
        //aside price range section
        //assert the shop dashboard page aside price range section title is visible
        assertTrue(shopDashboardPage.isShopDashboardPageAsidePriceRangeSectionTitleVisible(), "The shop dashboard page aside price range section title isn't visible.");
        //assert the shop dashboard page aside price range slider bar is visible
        assertTrue(shopDashboardPage.isShopDashboardPageAsidePriceRangeSliderBarVisible(), "The shop dashboard page aside price range slider bar isn't visible.");
        //assert the shop dashboard page aside min price range is visible
        assertTrue(shopDashboardPage.isShopDashboardPageAsideMinPriceRangeVisible(), "The shop dashboard page aside min price range isn't visible.");
        //assert the shop dashboard page aside current price range is visible
        assertTrue(shopDashboardPage.isShopDashboardPageAsideCurrentPriceRangeVisible(), "The shop dashboard page aside current price range isn't visible.");
        //assert the shop dashboard page aside max price range is visible
        assertTrue(shopDashboardPage.isShopDashboardPageAsideMaxPriceRangeVisible(), "The shop dashboard page aside max price range isn't visible.");
        //aside availability section
        //assert the shop dashboard page aside availability section title is visible
        assertTrue(shopDashboardPage.isShopDashboardPageAsideAvailabilitySectionTitleVisible(), "The shop dashboard page aside availability section title isn't visible.");
        //list elements
        //assert the shop dashboard page aside availability checkboxes are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageAsideAvailabilityCheckboxElementVisible(), "The shop dashboard page aside availability checkboxes aren't visible.");
        //assert the shop dashboard page aside availability subtexts are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageAsideAvailabilitySubtextElementVisible(), "The shop dashboard page aside availability subtexts aren't visible.");
        //main
        //assert the shop dashboard page search bar input field is visible
        assertTrue(shopDashboardPage.isShopDashboardPageSearchBarInputFieldVisible(), "The shop dashboard page search bar input field isn't visible.");
        //assert the shop dashboard page search button is visible
        assertTrue(shopDashboardPage.isShopDashboardPageSearchButtonVisible(), "The shop dashboard page search button isn't visible.");
        //assert the shop dashboard page sort by dropdown menu is visible
        assertTrue(shopDashboardPage.isShopDashboardPageSortByDropdownMenuVisible(), "The shop dashboard page sort by dropdown menu isn't visible.");
        //product table
        //assert the shop dashboard page product images are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageProductImgElementVisible(), "The shop dashboard page product images aren't visible.");
        //assert the shop dashboard page product names are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageProductNameElementVisible(), "The shop dashboard page product names aren't visible.");
        //assert the shop dashboard page product category names are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageProductCategoryNameElementVisible(), "The shop dashboard page product category names aren't visible.");
        //assert the shop dashboard page product descriptions are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageProductDescriptionElementVisible(), "The shop dashboard page product descriptions aren't visible.");
        //assert the shop dashboard page product unit prices are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageProductUnitPriceElementVisible(), "The shop dashboard page product unit prices aren't visible.");
        //assert the shop dashboard page product availabilities are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageProductAvailabilityElementVisible(), "The shop dashboard page product availabilities aren't visible.");
        //assert the shop dashboard page product view details buttons are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageProductViewDetailsBtnElementVisible(), "The shop dashboard page product view details buttons aren't visible.");
        //assert the shop dashboard page product quick buy buttons are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPageProductQuickBuyBtnElementVisible(), "The shop dashboard page product quick buy buttons aren't visible.");
        //assert the shop dashboard page pagination buttons are visible (as a list)
        assertTrue(shopDashboardPage.isShopDashboardPagePaginationButtonElementVisible(), "The shop dashboard page pagination buttons aren't visible.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //checkout page web element assert test method
    default void isCheckoutPageWebElementVisible(Page page) {
        CheckoutPage checkoutPage = new CheckoutPage(page);
        //assert the checkout page title is visible
        assertTrue(checkoutPage.isCheckoutPageTitleVisible(), "The checkout page title isn't visible.");
        //assert the checkout page subtitle is visible
        assertTrue(checkoutPage.isCheckoutPageSubtitleVisible(), "The checkout page subtitle isn't visible.");
        //customer info section
        //assert the checkout page customer info title is visible
        assertTrue(checkoutPage.isCheckoutPageCustomerInfoSectionTitleVisible(), "The checkout page customer info title isn't visible.");
        //input form
        //assert the checkout page full name subtext is visible
        assertTrue(checkoutPage.isCheckoutPageFullNameSubtextVisible(), "The checkout page full name subtext isn't visible.");
        //assert the checkout page full name input field is visible
        assertTrue(checkoutPage.isCheckoutPageFullNameInputFieldVisible(), "The checkout page full name input field isn't visible.");
        //assert the checkout page email subtext is visible
        assertTrue(checkoutPage.isCheckoutPageEmailSubtextVisible(), "The checkout page email subtext isn't visible.");
        //assert the checkout page email input field is visible
        assertTrue(checkoutPage.isCheckoutPageEmailInputFieldVisible(), "The checkout page email input field isn't visible.");
        //assert the checkout page phone subtext is visible
        assertTrue(checkoutPage.isCheckoutPagePhoneSubtextVisible(), "The checkout page phone subtext isn't visible.");
        //assert the checkout page phone input field is visible
        assertTrue(checkoutPage.isCheckoutPagePhoneInputFieldVisible(), "The checkout page phone input field isn't visible.");
        //assert the checkout page address subtext is visible
        assertTrue(checkoutPage.isCheckoutPageAddressSubtextVisible(), "The checkout page address subtext isn't visible.");
        //assert the checkout page address input field is visible
        assertTrue(checkoutPage.isCheckoutPageAddressInputFieldVisible(), "The checkout page address input field isn't visible.");
        //assert the checkout page order note subtext is visible
        assertTrue(checkoutPage.isCheckoutPageOrderNoteSubtextVisible(), "The checkout page order note subtext isn't visible.");
        //assert the checkout page order note text area is visible
        assertTrue(checkoutPage.isCheckoutPageOrderNoteTextAreaVisible(), "The checkout page order note text area isn't visible.");
        //product table
        //assert the checkout page product table section title is visible
        assertTrue(checkoutPage.isCheckoutPageProductTableSectionTitleVisible(), "The checkout page product table section title isn't visible.");
        //list elements
        //assert the checkout page product images are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductImgElementVisible(), "The checkout page product images aren't visible.");
        //assert the checkout page product names are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductNameElementVisible(), "The checkout page product names aren't visible.");
        //assert the checkout page product prices are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductPriceElementVisible(), "The checkout page product prices aren't visible.");
        //assert the checkout page product quantity subtexts are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductQtySubtextElementVisible(), "The checkout page product quantity subtext aren't visible.");
        //assert the checkout page product quantity input fields are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductQtyInputFieldElementVisible(), "The checkout page product quantity input fields aren't visible.");
        //assert the checkout page product remove buttons are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageProductRemoveBtnElementVisible(), "The checkout page product remove buttons aren't visible.");
        //order summary section
        //assert the checkout page order summary section title visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageOrderSummarySectionTitleVisible(), "The checkout page order summary section title isn't visible.");
        //list elements
        //assert the checkout page order summary product names are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageOrderProductNameElementVisible(), "The checkout page order summary product names aren't visible.");
        //assert the checkout page order summary product unit prices are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPageOrderProductUnitPriceElementVisible(), "The checkout page order summary product unit prices aren't visible.");
        //singular elements
        //assert the checkout page order summary shipping subtext is visible (element is invisible with valid selector)
        //assertTrue(checkoutPage.isCheckoutPageOrderShippingSubtextVisible(), "The checkout page order summary shipping subtext isn't visible.");
        //assert the checkout page order summary shipping price is visible (element is invisible with valid selector)
        //assertTrue(checkoutPage.isCheckoutPageOrderShippingPriceVisible(), "The checkout page order summary shipping price isn't visible.");
        //assert the checkout page order summary subtotal price subtext is visible
        assertTrue(checkoutPage.isCheckoutPageOrderSubtotalSubtextVisible(), "The checkout page order summary subtotal price subtext isn't visible.");
        //assert the checkout page order summary subtotal price is visible
        assertTrue(checkoutPage.isCheckoutPageOrderOrderSubtotalPriceVisible(), "The checkout page order summary subtotal price isn't visible.");
        //assert the checkout page order summary total price subtext is visible
        assertTrue(checkoutPage.isCheckoutPageOrderTotalSubtextVisible(), "The checkout page order summary total price subtext isn't visible.");
        //assert the checkout page order summary total price is visible
        assertTrue(checkoutPage.isCheckoutPageOrderTotalPriceVisible(), "The checkout page order summary total price isn't visible.");
        //payment section
        //assert the checkout page payment method section title is visible
        assertTrue(checkoutPage.isCheckoutPagePayMethodSectionTitleVisible(), "The checkout page payment method section title isn't visible.");
        //list elements
        //assert the checkout page payment method buttons are visible (as a list)
        assertTrue(checkoutPage.isCheckoutPagePayMethodBtnElementsVisible(), "The checkout page payment method buttons aren't visible.");
        //button
        //assert the checkout page place order button is visible
        assertTrue(checkoutPage.isCheckoutPagePlaceOrderButtonVisible(), "The checkout page place order button isn't visible.");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
