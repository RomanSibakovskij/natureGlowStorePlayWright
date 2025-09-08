package app.web.e8740.natureglow.page.data.loggers;

import app.web.e8740.natureglow.*;
import com.microsoft.playwright.Page;

import org.slf4j.*;

public interface PageDataLoggers {

    public static final Logger logger = LoggerFactory.getLogger(PageDataLoggers.class);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page product data logger method
    default void logHomePageProductData(Page page) {
        HomePage homePage = new HomePage(page);
        System.out.println("Home page bestselling product section displayed data: " + "\n");

        //log home page bestselling product name(s)
        logger.info("Home page bestselling product name(s): " + homePage.getHomePageBestSellingProductName());
        //log home page bestselling product description(s)
        logger.info("Home page bestselling product description(s): " + homePage.getHomePageBestSellingProductDesc());
        //log home page bestselling product unit price(s)
        logger.info("Home page bestselling product unit price(s): " + homePage.getHomePageBestSellingProductUnitPrice() + "\n");

        System.out.println("Home page new arrivals section displayed data: " + "\n");

        //log home page new arrival product name(s)
        logger.info("Home page new arrival product name(s): " + homePage.getHomePageNewArrivalProductName());
        //log home page new arrival product category(ies)
        logger.info("Home page new arrival product category(ies): " + homePage.getHomePageNewArrivalProductCategory());
        //log home page new arrival product description(s)
        logger.info("Home page new arrival product description(s): " + homePage.getHomePageNewArrivalProductDesc());
        //log home page new arrival product unit price(s)
        logger.info("Home page new arrival product unit price(s): " + homePage.getHomePageNewArrivalProductUnitPrice());
        //log home page new arrival product availability(ies)
        logger.info("Home page new arrival product availability(ies): " + homePage.getHomePageNewArrivalProductAvailability());

        System.out.println("\n");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page customer review data logger method
    default void logHomePageCustomerReviewData(Page page) {
        HomePage homePage = new HomePage(page);

        System.out.println("Home page customer review section displayed data: " + "\n");

        //log home page customer review section customer name(s)
        logger.info("Home page customer review section customer name(s): " + homePage.getHomePageCustomerReviewCustomerName());
        //log home page customer review section customer occupation(s)
        logger.info("Home page customer review section customer occupation(s): " + homePage.getHomePageCustomerReviewCustomerOccupation());
        //log home page customer review section customer review text(s)
        logger.info("Home page customer review section customer review text(s): " + homePage.getHomePageCustomerReviewText());

        System.out.println("\n");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page FAQ section data logger method
    default void logHomePageFAQSectionData(Page page) {
        HomePage homePage = new HomePage(page);

        System.out.println("Home page FAQ section displayed data: " + "\n");

        //log home page FAQ section dropdown link text(s)
        logger.info("Home page FAQ section dropdown link text(s): " + homePage.getHomePageFAQDropdownLinkText());

        System.out.println("\n");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single product page product data logger method
    default void logSingleProductPageProductData(Page page) {
        SingleProductPage singleProductPage = new SingleProductPage(page);

        System.out.println("Single product page displayed product data: " + "\n");

        logger.info("Single product page displayed product name: " + singleProductPage.getSingleProductPageProductName());
        logger.info("Single product page displayed product category name: " + singleProductPage.getSingleProductPageProductCategoryName());
        logger.info("Single product page displayed product unit price: " + singleProductPage.getSingleProductPageProductUnitPrice());
        logger.info("Single product page displayed product description: " + singleProductPage.getSingleProductPageProductDescription());
        logger.info("Single product page displayed product availability: " + singleProductPage.getSingleProductPageProductAvailability());

        System.out.println("\n");
    }

    //single product page product features list data logger method
    default void logSingleProductPageProductFeaturesData(Page page) {
        SingleProductPage singleProductPage = new SingleProductPage(page);

        System.out.println("Single product page displayed product features data: " + "\n");

        logger.info("Single product page displayed product features: " + singleProductPage.getSingleProductPageProductFeaturesList());

        System.out.println("\n");
    }

    //single product page related product data logger method
    default void logSingleProductPageRelatedProductData(Page page) {
        SingleProductPage singleProductPage = new SingleProductPage(page);

        System.out.println("Single product page displayed related product data: " + "\n");

        logger.info("Single product page displayed related product name(s): " + singleProductPage.getSingleProductPageRelatedProductName());
        logger.info("Single product page displayed related product category name(s): " + singleProductPage.getSingleProductPageRelatedProductCategoryName());
        logger.info("Single product page displayed related product description(s): " + singleProductPage.getSingleProductPageRelatedProductDesc());
        logger.info("Single product page displayed related product unit price(s): " + singleProductPage.getSingleProductPageRelatedProductUnitPrice());
        logger.info("Single product page displayed related product availability(ies): " + singleProductPage.getSingleProductPageRelatedProductAvailability());

        System.out.println("\n");
    }

    //single product page customer review data logger method (if the product has submitted reviews)
    default void logSingleProductPageCustomerReviewData(Page page) {
        SingleProductPage singleProductPage = new SingleProductPage(page);

        System.out.println("Single product page displayed customer review data: " + "\n");

        logger.info("Single product page displayed customer review section customer name(s): " + singleProductPage.getSingleProductPageCustomerReviewProfileName());
        logger.info("Single product page displayed customer review section customer review(s): " + singleProductPage.getSingleProductPageCustomerReviewText());

        System.out.println("\n");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //shop dashboard page price range data logger method
    default void logShopDashboardPagePriceRangeData(Page page) {
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);

        System.out.println("Shop dashboard page displayed price range data: " + "\n");

        logger.info("Shop dashboard page displayed minimum price range: " + shopDashboardPage.getShopDashboardPageAsideMinPrice());
        logger.info("Shop dashboard page displayed current price range: " + shopDashboardPage.getShopDashboardPageAsideCurrentPrice());
        logger.info("Shop dashboard page displayed maximum price range: " + shopDashboardPage.getShopDashboardPageAsideMaxPrice());

        System.out.println("\n");
    }

    //shop dashboard page product data logger method
    default void logShopDashboardPageProductData(Page page) {
        ShopDashboardPage shopDashboardPage = new ShopDashboardPage(page);

        System.out.println("Shop dashboard page displayed product data: " + "\n");

        logger.info("Shop dashboard page displayed product name(s): " + shopDashboardPage.getShopDashboardPageProductName());
        logger.info("Shop dashboard page displayed product category name(s): " + shopDashboardPage.getShopDashboardPageProductCategoryName());
        logger.info("Shop dashboard page displayed product description(s): " + shopDashboardPage.getShopDashboardPageProductDescription());
        logger.info("Shop dashboard page displayed product unit price(s): " + shopDashboardPage.getShopDashboardPageProductUnitPrice());
        logger.info("Shop dashboard page displayed product availability(ies): " + shopDashboardPage.getShopDashboardPageProductAvailability());

        //throw an error if the logger logs empty list (when the product list doesn't load)
        if(shopDashboardPage.getShopDashboardPageProductName().isEmpty() && shopDashboardPage.getShopDashboardPageProductCategoryName().isEmpty() && shopDashboardPage.getShopDashboardPageProductDescription().isEmpty() && shopDashboardPage.getShopDashboardPageProductUnitPrice().isEmpty() && shopDashboardPage.getShopDashboardPageProductAvailability().isEmpty()) {
            throw new IllegalStateException("The shop dashboard page product list fails to be loaded, test has failed");
        }

        System.out.println("\n");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //checkout page product data logger data method
    default void logCheckoutPageProductData(Page page) {
        CheckoutPage checkoutPage = new CheckoutPage(page);

        System.out.println("Checkout page displayed product table data: " + "\n");

        logger.info("Checkout page displayed product name(s): " + checkoutPage.getCheckoutPageProductName());
        logger.info("Checkout page displayed product unit price(s): " + checkoutPage.getCheckoutPageProductUnitPrice());
        logger.info("Checkout page displayed product quantity(ies): " + checkoutPage.getCheckoutPageProductQuantity());

        //throw an error if the checkout page product table is empty
        if(checkoutPage.getCheckoutPageProductName().isEmpty() && checkoutPage.getCheckoutPageProductUnitPrice().isEmpty() && checkoutPage.getCheckoutPageProductQuantity().isEmpty()){
            throw new IllegalStateException("The checkout page product table content fails to be loaded, test has failed");
        }

        System.out.println("\n");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
