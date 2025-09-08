package app.web.e8740.natureglow;

import app.web.e8740.natureglow.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.*;
import java.util.stream.*;

public class HomePage extends BasePage {

    //home page web elements
    //welcome image
    private Locator homePageWelcomeImage;
    private Locator homePageWelcomeText;
    private Locator homePageWelcomeImgShopBtn;
    //featured categories section
    private Locator homePageFeaturedCategoriesSectionTitle;
    private Locator homePageFeaturedCategoriesSectionSubtitle;
    //list elements
    private Locator homePageFeaturedCategoriesImgElements;
    private Locator homePageFeaturedCategoriesNameElements;
    private Locator homePageFeaturedCategoriesLinkElements;
    private Locator homePageFeaturedCategoriesDescElements;
    //bestselling products section
    private Locator homePageBestSellingProductsSectionTitle;
    private Locator homePageBestSellingProductsSectionSubtitle;
    //products table (list elements)
    private Locator homePageBestSellingProductImgElements;
    private Locator homePageBestSellingProductNameElements;
    private Locator homePageBestSellingProductDescElements;
    private Locator homePageBestSellingProductUnitPriceElements;
    private Locator homePageBestSellingProductQuickPurchaseBtnElements;
    //new arrival section
    private Locator homePageNewArrivalProductsSectionTitle;
    private Locator homePageNewArrivalProductsSectionSubtitle;
    //products table (list elements)
    private Locator homePageNewArrivalProductImgElements;
    private Locator homePageNewArrivalProductNameElements;
    private Locator homePageNewArrivalProductCategoryElements;
    private Locator homePageNewArrivalProductDescElements;
    private Locator homePageNewArrivalProductUnitPriceElements;
    private Locator homePageNewArrivalProductAvailabilityElements;
    private Locator homePageNewArrivalProductViewDetailsBtnElements;
    private Locator homePageNewArrivalProductQuickBuyBtnElements;
    //radiant skin
    private Locator homePageRadiantSkinImage;
    private Locator homePageRadiantSkinTitle;
    private Locator homePageRadiantSkinText;
    private Locator homePageRadiantSkinImgShopBtn;
    //customer reviews section
    private Locator homePageCustomersSectionTitle;
    private Locator homePageCustomersSectionSubtitle;
    //list elements
    private Locator homePageCustomerReviewTextElements;
    private Locator homePageCustomerReviewStarElements;
    private Locator homePageCustomerPictureElements;
    private Locator homePageCustomerNameElements;
    private Locator homePageCustomerOccupationElements;
    //FAQ section
    private Locator homePageFAQSectionTitle;
    private Locator homePageFAQSectionSubtitle;
    //list elements
    private Locator homePageFAQDropdownLinkElements;
    //newsletter section
    private Locator homePageNewsletterSectionTitle;
    private Locator homePageNewsletterSectionSubtitle;
    private Locator homePageNewsletterEmailInputField;
    private Locator homePageNewsletterSubscribeBtn;
    private Locator homePageNewsletterDesc;

    public HomePage(Page page) {
        super(page);

        //welcome image
        homePageWelcomeImage = page.locator("//section[1]//img");
        homePageWelcomeText = page.locator("//section[1]/div[1]");
        homePageWelcomeImgShopBtn = page.locator("//section[1]//a");
        //featured categories section
        homePageFeaturedCategoriesSectionTitle = page.locator("//section[2]/div[1]/h1");
        homePageFeaturedCategoriesSectionSubtitle = page.locator("//section[2]/div[1]/h3");
        //list elements
        homePageFeaturedCategoriesImgElements = page.locator("//section[2]/div[2]//img");
        homePageFeaturedCategoriesLinkElements = page.locator("//section[2]/div[2]//a");
        homePageFeaturedCategoriesNameElements = page.locator("//section[2]/div[2]//h2");
        homePageFeaturedCategoriesDescElements = page.locator("//section[2]/div[2]//p");
        //bestselling products section
        homePageBestSellingProductsSectionTitle = page.locator("//section[3]/div[1]/h1");
        homePageBestSellingProductsSectionSubtitle = page.locator("//section[3]/div[1]/h3");
        //products table (list elements)
        homePageBestSellingProductImgElements = page.locator("//section[3]/div[2]//img");
        homePageBestSellingProductNameElements = page.locator("//section[3]/div[2]//h2");
        homePageBestSellingProductDescElements = page.locator("//section[3]/div[2]//p");
        homePageBestSellingProductUnitPriceElements = page.locator("//section[3]/div[2]//h5");
        homePageBestSellingProductQuickPurchaseBtnElements = page.locator("//section[3]/div[2]//button");
        //new arrival section
        homePageNewArrivalProductsSectionTitle = page.locator("//section[4]/div[1]/h1");
        homePageNewArrivalProductsSectionSubtitle = page.locator("//section[4]/div[1]/h3");
        //products table (list elements)
        homePageNewArrivalProductImgElements = page.locator("//section[4]/div[2]//img");
        homePageNewArrivalProductNameElements = page.locator("//section[4]/div[2]//h3");
        homePageNewArrivalProductCategoryElements = page.locator("//section[4]/div[2]//p[1]");
        homePageNewArrivalProductDescElements = page.locator("//section[4]/div[2]//p[2]");
        homePageNewArrivalProductUnitPriceElements = page.locator("//section[4]/div[2]//span[1]");
        homePageNewArrivalProductAvailabilityElements = page.locator("//section[4]/div[2]//span[2]");
        homePageNewArrivalProductViewDetailsBtnElements = page.locator("//section[4]/div[2]//a[1]");
        homePageNewArrivalProductQuickBuyBtnElements = page.locator("//section[4]/div[2]//a[2]");
        //radiant skin
        homePageRadiantSkinImage = page.locator("//div[@class='flex flex-col md:flex-row items-center bg-green-50 rounded-md p-5 md:p-16 my-16 shadow-lg']//img");
        homePageRadiantSkinTitle = page.locator("//div[@class='flex flex-col md:flex-row items-center bg-green-50 rounded-md p-5 md:p-16 my-16 shadow-lg']//h2");
        homePageRadiantSkinText = page.locator("//div[@class='flex flex-col md:flex-row items-center bg-green-50 rounded-md p-5 md:p-16 my-16 shadow-lg']//p");
        homePageRadiantSkinImgShopBtn = page.locator("//div[@class='flex flex-col md:flex-row items-center bg-green-50 rounded-md p-5 md:p-16 my-16 shadow-lg']//a");
        //customer reviews section
        homePageCustomersSectionTitle = page.locator("//section[5]/div[1]/h1");
        homePageCustomersSectionSubtitle = page.locator("//section[5]/div[1]/h3");
        //list elements
        homePageCustomerReviewTextElements = page.locator("//section[5]/div[2]//p[@class='text-gray-700 italic mb-4']");
        homePageCustomerReviewStarElements = page.locator("//section[5]/div[2]//div[@class='flex gap-1 mb-6 text-yellow-500']");
        homePageCustomerPictureElements = page.locator("//section[5]/div[2]//img");
        homePageCustomerNameElements = page.locator("//section[5]/div[2]//h4");
        homePageCustomerOccupationElements = page.locator("//section[5]/div[2]//p[@class='text-sm text-gray-500']");
        //FAQ section
        homePageFAQSectionTitle = page.locator("//section[6]/div[1]/h2");
        homePageFAQSectionSubtitle = page.locator("//section[6]/div[1]/p");
        //list elements
        homePageFAQDropdownLinkElements = page.locator("//section[6]/div[2]//div[@class='collapse-title font-semibold text-green-800']");
        //newsletter section
        homePageNewsletterSectionTitle = page.locator("//section[7]/div/h2");
        homePageNewsletterSectionSubtitle = page.locator("//section[7]/div/p");
        homePageNewsletterEmailInputField = page.locator("//section[7]//input");
        homePageNewsletterSubscribeBtn = page.locator("//section[7]//button");
        homePageNewsletterDesc = page.locator("//section[7]/p");
    }

    //click set bestselling "Quick Buy" button method
    public void clickSetBestSellingQuickBuyBtn(int index){
        homePageBestSellingProductQuickPurchaseBtnElements.nth(index).scrollIntoViewIfNeeded();
        homePageBestSellingProductQuickPurchaseBtnElements.nth(index).click();
    }

    //click set new arrival "View Details" button method
    public void clickSetNewArrivalViewDetailsBtn(int index){
        homePageNewArrivalProductViewDetailsBtnElements.nth(index).scrollIntoViewIfNeeded();
        homePageNewArrivalProductViewDetailsBtnElements.nth(index).click();
    }

    //home page product data getters
    //bestselling products section
    public List<String> getHomePageBestSellingProductName(){
        int count = homePageBestSellingProductNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageBestSellingProductNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageBestSellingProductDesc(){
        int count = homePageBestSellingProductDescElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageBestSellingProductDescElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageBestSellingProductUnitPrice(){
        int count = homePageBestSellingProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageBestSellingProductUnitPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //new arrivals
    public List<String> getHomePageNewArrivalProductName(){
        int count = homePageNewArrivalProductNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageNewArrivalProductNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageNewArrivalProductCategory(){
        int count = homePageNewArrivalProductCategoryElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageNewArrivalProductCategoryElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageNewArrivalProductDesc(){
        int count = homePageNewArrivalProductDescElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageNewArrivalProductDescElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageNewArrivalProductUnitPrice(){
        int count = homePageNewArrivalProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageNewArrivalProductUnitPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageNewArrivalProductAvailability(){
        int count = homePageNewArrivalProductAvailabilityElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageNewArrivalProductAvailabilityElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //customer reviews
    public List<String> getHomePageCustomerReviewCustomerName(){
        int count = homePageCustomerNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageCustomerNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageCustomerReviewCustomerOccupation(){
        int count = homePageCustomerOccupationElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageCustomerOccupationElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageCustomerReviewText(){
        int count = homePageCustomerReviewTextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageCustomerReviewTextElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //FAQ section
    public List<String> getHomePageFAQDropdownLinkText(){
        int count = homePageFAQDropdownLinkElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageFAQDropdownLinkElements.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //home page text element getters
    //welcome image
    public String getHomePageWelcomeText() {
        String text = homePageWelcomeText.innerText();
        return text.replace("SHOP NOW", "").trim();
    }
    public String getHomePageWelcomeShopNowBtnText() {return homePageWelcomeImgShopBtn.innerText();}
    //featured categories section
    public String getHomePageFeaturedCategoriesSectionTitle() {return homePageFeaturedCategoriesSectionTitle.innerText();}
    public String getHomePageFeaturedCategoriesSectionSubtitle() {return homePageFeaturedCategoriesSectionSubtitle.innerText();}
    //list elements
    public List<String> getHomePageFeaturedCategoriesName(){
        int count = homePageFeaturedCategoriesNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageFeaturedCategoriesNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageFeaturedCategoriesDesc(){
        int count = homePageFeaturedCategoriesDescElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageFeaturedCategoriesDescElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //bestselling products section
    public String getHomePageBestSellingProductsSectionTitle() {return homePageBestSellingProductsSectionTitle.innerText();}
    public String getHomePageBestSellingProductsSectionSubtitle() {return homePageBestSellingProductsSectionSubtitle.innerText();}
    //list elements
    public List<String> getHomePageBestSellingProductsQuickPurchaseBtnText(){
        int count = homePageBestSellingProductQuickPurchaseBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageBestSellingProductQuickPurchaseBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //new arrival section
    public String getHomePageNewArrivalProductsSectionTitle() {return homePageNewArrivalProductsSectionTitle.innerText();}
    public String getHomePageNewArrivalProductsSectionSubtitle() {return homePageNewArrivalProductsSectionSubtitle.innerText();}
    //list elements
    public List<String> getHomePageNewArrivalProductsViewDetailsBtnText(){
        int count = homePageNewArrivalProductViewDetailsBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageNewArrivalProductViewDetailsBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getHomePageNewArrivalProductsQuickBuyBtnText(){
        int count = homePageNewArrivalProductQuickBuyBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> homePageNewArrivalProductQuickBuyBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //radiant skin
    public String getHomePageRadiantSkinTitle() {return homePageRadiantSkinTitle.innerText();}
    public String getHomePageRadiantSkinText() {return homePageRadiantSkinText.innerText();}
    public String getHomePageRadiantSkinShopNowBtnText() {return homePageRadiantSkinImgShopBtn.innerText();}
    //customer reviews section
    public String getHomePageCustomersSectionTitle() {return homePageCustomersSectionTitle.innerText();}
    public String getHomePageCustomersSectionSubtitle() {return homePageCustomersSectionSubtitle.innerText();}
    //FAQ section
    public String getHomePageFAQSectionTitle() {return homePageFAQSectionTitle.innerText();}
    public String getHomePageFAQSectionSubtitle() {return homePageFAQSectionSubtitle.innerText();}
    //newsletter section
    public String getHomePageNewsletterSectionTitle() {return homePageNewsletterSectionTitle.innerText();}
    public String getHomePageNewsletterSectionSubtitle() {return homePageNewsletterSectionSubtitle.innerText();}
    public String getHomePageNewsletterDesc() {return homePageNewsletterDesc.innerText();}

    //home page web element assert methods
    //welcome image
    public boolean isHomePageWelcomeImageVisible() {return homePageWelcomeImage.isVisible();}
    public boolean isHomePageWelcomeTextVisible() {return homePageWelcomeText.isVisible();}
    public boolean isHomePageWelcomeImgShopBtnVisible() {return homePageWelcomeImgShopBtn.isVisible();}
    //featured categories section
    public boolean isHomePageFeaturedCategoriesSectionTitleVisible() {return homePageFeaturedCategoriesSectionTitle.isVisible();}
    public boolean isHomePageFeaturedCategoriesSectionSubtitleVisible() {return homePageFeaturedCategoriesSectionSubtitle.isVisible();}
    //list elements
    public boolean isHomePageFeaturedCategoriesImgElementVisible() {
        int count = homePageFeaturedCategoriesImgElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageFeaturedCategoriesImgElements.nth(i).isVisible());
    }
    public boolean isHomePageFeaturedCategoriesLinkElementVisible() {
        int count = homePageFeaturedCategoriesLinkElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageFeaturedCategoriesLinkElements.nth(i).isVisible());
    }
    public boolean isHomePageFeaturedCategoriesNameElementVisible() {
        int count = homePageFeaturedCategoriesNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageFeaturedCategoriesNameElements.nth(i).isVisible());
    }
    public boolean isHomePageFeaturedCategoriesDescElementVisible() {
        int count = homePageFeaturedCategoriesDescElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageFeaturedCategoriesDescElements.nth(i).isVisible());
    }
    //bestselling products section
    public boolean isHomePageBestSellingProductsSectionTitleVisible() {return homePageBestSellingProductsSectionTitle.isVisible();}
    public boolean isHomePageBestSellingProductsSectionSubtitleVisible() {return homePageBestSellingProductsSectionSubtitle.isVisible();}
    //products table (list elements)
    public boolean isHomePageBestSellingProductImgElementVisible() {
        int count = homePageBestSellingProductImgElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageBestSellingProductImgElements.nth(i).isVisible());
    }
    public boolean isHomePageBestSellingProductNameElementVisible() {
        int count = homePageBestSellingProductNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageBestSellingProductNameElements.nth(i).isVisible());
    }
    public boolean isHomePageBestSellingProductDescElementVisible() {
        int count = homePageBestSellingProductDescElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageBestSellingProductDescElements.nth(i).isVisible());
    }
    public boolean isHomePageBestSellingProductUnitPriceElementVisible() {
        int count = homePageBestSellingProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageBestSellingProductUnitPriceElements.nth(i).isVisible());
    }
    public boolean isHomePageBestSellingProductQuickPurchaseBtnElementVisible() {
        int count = homePageBestSellingProductQuickPurchaseBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageBestSellingProductQuickPurchaseBtnElements.nth(i).isVisible());
    }
    //new arrivals section
    public boolean isHomePageNewArrivalProductsSectionTitleVisible() {return homePageNewArrivalProductsSectionTitle.isVisible();}
    public boolean isHomePageNewArrivalProductsSectionSubtitleVisible() {return homePageNewArrivalProductsSectionSubtitle.isVisible();}
    //products table (list elements)
    public boolean isHomePageNewArrivalProductImgElementVisible() {
        int count = homePageNewArrivalProductImgElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageNewArrivalProductImgElements.nth(i).isVisible());
    }
    public boolean isHomePageNewArrivalProductNameElementVisible() {
        int count = homePageNewArrivalProductNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageNewArrivalProductNameElements.nth(i).isVisible());
    }
    public boolean isHomePageNewArrivalProductCategoryElementVisible() {
        int count = homePageNewArrivalProductCategoryElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageNewArrivalProductCategoryElements.nth(i).isVisible());
    }
    public boolean isHomePageNewArrivalProductDescElementVisible() {
        int count = homePageNewArrivalProductDescElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageNewArrivalProductDescElements.nth(i).isVisible());
    }
    public boolean isHomePageNewArrivalProductUnitPriceElementVisible() {
        int count = homePageNewArrivalProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageNewArrivalProductUnitPriceElements.nth(i).isVisible());
    }
    public boolean isHomePageNewArrivalProductAvailabilityElementVisible() {
        int count = homePageNewArrivalProductAvailabilityElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageNewArrivalProductAvailabilityElements.nth(i).isVisible());
    }
    public boolean isHomePageNewArrivalProductViewDetailsBtnElementVisible() {
        int count = homePageNewArrivalProductViewDetailsBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageNewArrivalProductViewDetailsBtnElements.nth(i).isVisible());
    }
    public boolean isHomePageNewArrivalProductQuickBuyBtnElementVisible() {
        int count = homePageNewArrivalProductQuickBuyBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageNewArrivalProductQuickBuyBtnElements.nth(i).isVisible());
    }
    //radiant skin
    public boolean isHomePageRadiantSkinImageVisible() {return homePageRadiantSkinImage.isVisible();}
    public boolean isHomePageRadiantSkinTitleVisible() {return homePageRadiantSkinTitle.isVisible();}
    public boolean isHomePageRadiantSkinTextVisible() {return homePageRadiantSkinText.isVisible();}
    public boolean isHomePageRadiantSkinImgShopBtnVisible() {return homePageRadiantSkinImgShopBtn.isVisible();}
    //customer reviews section
    public boolean isHomePageCustomersSectionTitleVisible() {return homePageCustomersSectionTitle.isVisible();}
    public boolean isHomePageCustomersSectionSubtitleVisible() {return homePageCustomersSectionSubtitle.isVisible();}
    //list elements
    public boolean isHomePageCustomerReviewTextElementVisible() {
        int count = homePageCustomerReviewTextElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageCustomerReviewTextElements.nth(i).isVisible());
    }
    public boolean isHomePageCustomerReviewStarElementVisible() {
        int count = homePageCustomerReviewStarElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageCustomerReviewStarElements.nth(i).isVisible());
    }
    public boolean isHomePageCustomerPictureElementVisible() {
        int count = homePageCustomerPictureElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageCustomerPictureElements.nth(i).isVisible());
    }
    public boolean isHomePageCustomerNameElementVisible() {
        int count = homePageCustomerNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageCustomerNameElements.nth(i).isVisible());
    }
    public boolean isHomePageCustomerOccupationElementVisible() {
        int count = homePageCustomerOccupationElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageCustomerOccupationElements.nth(i).isVisible());
    }
    //FAQ section
    public boolean isHomePageFAQSectionTitleVisible() {return homePageFAQSectionTitle.isVisible();}
    public boolean isHomePageFAQSectionSubtitleVisible() {return homePageFAQSectionSubtitle.isVisible();}
    //list elements
    public boolean isHomePageFAQDropdownLinkElementVisible() {
        int count = homePageFAQDropdownLinkElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> homePageFAQDropdownLinkElements.nth(i).isVisible());
    }
    //newsletter section
    public boolean isHomePageNewsletterSectionTitleVisible() {return homePageNewsletterSectionTitle.isVisible();}
    public boolean isHomePageNewsletterSectionSubtitleVisible() {return homePageNewsletterSectionSubtitle.isVisible();}
    public boolean isHomePageNewsletterEmailInputFieldVisible() {return homePageNewsletterEmailInputField.isVisible();}
    public boolean isHomePageNewsletterSubscribeBtnVisible() {return homePageNewsletterSubscribeBtn.isVisible();}
    public boolean isHomePageNewsletterDescVisible() {return homePageNewsletterDesc.isVisible();}

}