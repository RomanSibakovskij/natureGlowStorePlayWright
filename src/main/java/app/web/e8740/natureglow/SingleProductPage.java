package app.web.e8740.natureglow;

import app.web.e8740.natureglow.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.*;
import java.util.stream.*;

public class SingleProductPage extends BasePage {

    //single product page web elements
    private Locator singleProductPageProductMainImg;
    private Locator singleProductPageProductName;
    private Locator singleProductPageProductCategorySubtext;
    private Locator singleProductPageProductCategoryName;
    private Locator singleProductPageProductUnitPrice;
    private Locator singleProductPageProductDescription;
    private Locator singleProductPageProductFeaturesSubtext;
    private Locator singleProductPageProductFeaturesListElements;
    private Locator singleProductPageProductAvailability;
    //buttons
    private Locator singleProductPageProductAddToCartBtn;
    private Locator singleProductPageProductQuickPurchaseBtn;
    private Locator singleProductPageProductBackToShopLink;
    //related products section
    private Locator singleProductPageRelatedProductsSectionTitle;
    //list elements
    private Locator singleProductPageRelatedProductImgElements;
    private Locator singleProductPageRelatedProductNameElements;
    private Locator singleProductPageRelatedProductCategoryNameElements;
    private Locator singleProductPageRelatedProductDescElements;
    private Locator singleProductPageRelatedProductUnitPriceElements;
    private Locator singleProductPageRelatedProductAvailabilityElements;
    private Locator singleProductPageRelatedProductViewDetailsBtnElements;
    private Locator singleProductPageRelatedProductQuickBuyBtnElements;
    //customer review
    private Locator singleProductPageCustomerReviewSectionTitle;
    //list elements (displayed when the product has submitted reviews)
    private Locator singleProductPageCustomerReviewProfileImgElements;
    private Locator singleProductPageCustomerReviewProfileNameElements;
    private Locator singleProductPageCustomerReviewSubmittedReviewStarElements;
    private Locator singleProductPageCustomerReviewSubtextElements;
    private Locator singleProductPageCustomerReviewTextElements;
    //leave review section
    private Locator singleProductPageLeaveReviewSectionTitle;
    //input form
    private Locator singleProductPageLeaveReviewRatingSubtext;
    //list elements
    private Locator singleProductPageLeaveReviewRatingStarElements;
    //singular elements
    private Locator singleProductPageLeaveReviewSubtext;
    private Locator singleProductPageLeaveReviewTextArea;
    //buttons
    private Locator singleProductPageLeaveReviewResetBtn;
    private Locator singleProductPageLeaveReviewSubmitBtn;

    public SingleProductPage(Page page) {
        super(page);

        singleProductPageProductMainImg = page.locator("//div[@class='bg-white p-4 rounded-2xl shadow border']/img");
        singleProductPageProductName = page.locator("//h1[@class='text-3xl font-bold text-green-800 mb-2']");
        singleProductPageProductCategoryName = page.locator("//p[@class='text-sm text-gray-600 italic mb-1']");
        singleProductPageProductUnitPrice = page.locator("//p[@class='text-lg font-semibold text-green-700 mb-3']");
        singleProductPageProductDescription = page.locator("//p[@class='text-gray-700 mb-4']");
        singleProductPageProductFeaturesSubtext = page.locator("//span[@class='font-semibold text-gray-600']");
        //list elements
        singleProductPageProductFeaturesListElements = page.locator("//ul[@class='list-disc list-inside text-sm text-gray-700']/li");
        //singular elements
        singleProductPageProductAvailability = page.locator("//span[@class='text-sm font-medium bg-green-200 p-1.5 rounded-lg text-red-500']");
        //buttons
        singleProductPageProductAddToCartBtn = page.locator("//div[@class='space-y-3 mt-4']/button");
        singleProductPageProductQuickPurchaseBtn = page.locator("//div[@class='space-y-3 mt-4']/a");
        singleProductPageProductBackToShopLink = page.locator("//a[@class='text-sm text-green-700 hover:underline']");
        //related products section
        singleProductPageRelatedProductsSectionTitle = page.locator("//section[1]/h3");
        //list elements
        singleProductPageRelatedProductImgElements = page.locator("//section[1]//img");
        singleProductPageRelatedProductNameElements = page.locator("//section[1]//div[@class='space-y-2 mt-4']/h3");
        singleProductPageRelatedProductCategoryNameElements = page.locator("//section[1]//p[@class='text-sm italic group-hover:text-green-500']");
        singleProductPageRelatedProductDescElements = page.locator("//section[1]//p[@class='text-gray-700 text-sm']");
        singleProductPageRelatedProductUnitPriceElements = page.locator("//section[1]//div[@class='flex items-center justify-between pt-2']/span[1]");
        singleProductPageRelatedProductAvailabilityElements = page.locator("//section[1]//div[@class='flex items-center justify-between pt-2']/span[2]");
        singleProductPageRelatedProductViewDetailsBtnElements = page.locator("//section[1]//div[@class='flex gap-3 w-full pt-3']/a[1]");
        singleProductPageRelatedProductQuickBuyBtnElements = page.locator("//section[1]//div[@class='flex gap-3 w-full pt-3']/a[2]");
        //singular elements
        singleProductPageCustomerReviewSectionTitle = page.locator("//section[2]/div[1]/h3");
        //list elements (displayed when the product has submitted reviews)
        singleProductPageCustomerReviewProfileImgElements = page.locator("//section[2]//div[@class='flex items-center gap-2']/img");
        singleProductPageCustomerReviewProfileNameElements = page.locator("//section[2]//div[@class='flex items-center gap-2']//h5");
        singleProductPageCustomerReviewSubmittedReviewStarElements = page.locator("//section[2]//div[@class='flex items-center gap-2']//span[@role='img']/span");
        singleProductPageCustomerReviewSubtextElements = page.locator("//section[2]//span[@class='text-green-800 font-semibold']");
        singleProductPageCustomerReviewTextElements = page.locator("//section[2]//span[@class='text-gray-800']");
        //leave review section
        singleProductPageLeaveReviewSectionTitle = page.locator("//section[2]/div[2]//h3");
        //input form
        singleProductPageLeaveReviewRatingSubtext = page.locator("//section[2]/div[2]//div[@class='bg-green-100 shadow-inner p-4 rounded-lg mt-2']/div[1]/label");
        //list elements
        singleProductPageLeaveReviewRatingStarElements = page.locator("//section[2]/div[2]//div[@class='bg-green-100 shadow-inner p-4 rounded-lg mt-2']/div[1]//span[@class='MuiRating-root MuiRating-sizeMedium css-r2qk9h']/input");
        //singular elements
        singleProductPageLeaveReviewSubtext = page.locator("//section[2]/div[2]//div[@class='bg-green-100 shadow-inner p-4 rounded-lg mt-2']/div[2]/label");
        singleProductPageLeaveReviewTextArea = page.locator("//section[2]/div[2]//div[@class='bg-green-100 shadow-inner p-4 rounded-lg mt-2']/div[2]/textarea");
        //buttons
        singleProductPageLeaveReviewResetBtn = page.locator("//section[2]/div[2]//div[@class='bg-green-100 shadow-inner p-4 rounded-lg mt-2']/div[3]/button[1]");
        singleProductPageLeaveReviewSubmitBtn = page.locator("//section[2]/div[2]//div[@class='bg-green-100 shadow-inner p-4 rounded-lg mt-2']/div[3]/button[2]");

    }

    //click "Add to Cart" button method
    public void clickAddToCartButton(){singleProductPageProductAddToCartBtn.click();}

    //single product page product data getters
    public String getSingleProductPageProductName(){return singleProductPageProductName.innerText();}
    public String getSingleProductPageProductCategoryName(){return singleProductPageProductCategoryName.innerText();}
    public String getSingleProductPageProductUnitPrice(){return singleProductPageProductUnitPrice.innerText();}
    public String getSingleProductPageProductDescription(){return singleProductPageProductDescription.innerText();}
    //list elements
    public List<String> getSingleProductPageProductFeaturesList(){
        int count = singleProductPageProductFeaturesListElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageProductFeaturesListElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //singular elements
    public String getSingleProductPageProductAvailability(){return singleProductPageProductAvailability.innerText();}
    //related products section (list elements)
    public List<String> getSingleProductPageRelatedProductName(){
        int count = singleProductPageRelatedProductNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageRelatedProductNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getSingleProductPageRelatedProductCategoryName(){
        int count = singleProductPageRelatedProductCategoryNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageRelatedProductCategoryNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getSingleProductPageRelatedProductDesc(){
        int count = singleProductPageRelatedProductDescElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageRelatedProductDescElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getSingleProductPageRelatedProductUnitPrice(){
        int count = singleProductPageRelatedProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageRelatedProductUnitPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getSingleProductPageRelatedProductAvailability(){
        int count = singleProductPageRelatedProductAvailabilityElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageRelatedProductAvailabilityElements.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //single product page text element getters
    public String getSingleProductPageFeaturesSubtext() {return singleProductPageProductFeaturesSubtext.innerText();}
    //buttons
    public String getSingleProductPageProductAddToCartBtnText(){return singleProductPageProductAddToCartBtn.innerText();}
    public String getSingleProductPageProductQuickPurchaseBtnText(){return singleProductPageProductQuickPurchaseBtn.innerText();}
    public String getSingleProductPageProductBackToShopLinkText(){return singleProductPageProductBackToShopLink.innerText();}
    //related products section
    public String getSingleProductPageRelatedProductsSectionTitle(){return singleProductPageRelatedProductsSectionTitle.innerText();}
    //list elements
    public List<String> getSingleProductPageRelatedProductViewDetailsBtnText(){
        int count = singleProductPageRelatedProductViewDetailsBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageRelatedProductViewDetailsBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getSingleProductPageRelatedProductQuickBuyBtnText(){
        int count = singleProductPageRelatedProductQuickBuyBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageRelatedProductQuickBuyBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //customer review section
    public String getSingleProductPageCustomerReviewSectionTitle(){return singleProductPageCustomerReviewSectionTitle.innerText();}
    //list elements
    public List<String> getSingleProductPageCustomerReviewProfileName(){
        int count = singleProductPageCustomerReviewProfileNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageCustomerReviewProfileNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getSingleProductPageCustomerReviewSubtext(){
        int count = singleProductPageCustomerReviewSubtextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageCustomerReviewSubtextElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getSingleProductPageCustomerReviewText(){
        int count = singleProductPageCustomerReviewTextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> singleProductPageCustomerReviewTextElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //leave review section
    public String getSingleProductPageLeaveReviewSectionTitle(){return singleProductPageLeaveReviewSectionTitle.innerText();}
    //input form
    public String getSingleProductPageLeaveReviewRatingSubtext(){return singleProductPageLeaveReviewRatingSubtext.innerText();}
    public String getSingleProductPageLeaveReviewSubtext(){return singleProductPageLeaveReviewSubtext.innerText();}
    //buttons
    public String getSingleProductPageLeaveReviewResetBtnText(){return singleProductPageLeaveReviewResetBtn.innerText();}
    public String getSingleProductPageLeaveReviewSubmitBtnText(){return singleProductPageLeaveReviewSubmitBtn.innerText();}

    //single product page web element assert method
    public boolean isSingleProductPageProductMainImgVisible() {return singleProductPageProductMainImg.isVisible();}
    public boolean isSingleProductPageProductNameVisible() {return singleProductPageProductName.isVisible();}
    public boolean isSingleProductPageProductCategoryNameVisible() {return singleProductPageProductCategoryName.isVisible();}
    public boolean isSingleProductPageProductUnitPriceVisible() {return singleProductPageProductUnitPrice.isVisible();}
    public boolean isSingleProductPageProductDescriptionVisible() {return singleProductPageProductDescription.isVisible();}
    public boolean isSingleProductPageProductFeaturesSubtextVisible() {return singleProductPageProductFeaturesSubtext.isVisible();}
    //list elements
    public boolean isSingleProductPageProductFeaturesListElementVisible(){
        int count = singleProductPageProductFeaturesListElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageProductFeaturesListElements.nth(i).isVisible());
    }
    //singular elements
    public boolean isSingleProductPageProductAvailabilityVisible() {return singleProductPageProductAvailability.isVisible();}
    //buttons
    public boolean isSingleProductPageProductAddToCartBtnVisible() {return singleProductPageProductAddToCartBtn.isVisible();}
    public boolean isSingleProductPageProductQuickPurchaseBtnVisible(){return singleProductPageProductQuickPurchaseBtn.isVisible();}
    public boolean isSingleProductPageProductBackToShopLinkVisible(){return singleProductPageProductBackToShopLink.isVisible();}
    //related products section
    public boolean isSingleProductPageRelatedProductsSectionTitleVisible() {return singleProductPageRelatedProductsSectionTitle.isVisible();}
    //list elements
    public boolean isSingleProductPageRelatedProductImgElementVisible(){
        int count = singleProductPageRelatedProductImgElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageRelatedProductImgElements.nth(i).isVisible());
    }
    public boolean isSingleProductPageRelatedProductNameElementVisible(){
        int count = singleProductPageRelatedProductNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageRelatedProductNameElements.nth(i).isVisible());
    }
    public boolean isSingleProductPageRelatedProductCategoryNameElementVisible(){
        int count = singleProductPageRelatedProductCategoryNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageRelatedProductCategoryNameElements.nth(i).isVisible());
    }
    public boolean isSingleProductPageRelatedProductDescElementVisible(){
        int count = singleProductPageRelatedProductDescElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageRelatedProductDescElements.nth(i).isVisible());
    }
    public boolean isSingleProductPageRelatedProductUnitPriceElementVisible(){
        int count = singleProductPageRelatedProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageRelatedProductUnitPriceElements.nth(i).isVisible());
    }
    public boolean isSingleProductPageRelatedProductAvailabilityElementVisible(){
        int count = singleProductPageRelatedProductAvailabilityElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageRelatedProductAvailabilityElements.nth(i).isVisible());
    }
    //buttons
    public boolean isSingleProductPageRelatedProductViewDetailsBtnElementVisible(){
        int count = singleProductPageRelatedProductViewDetailsBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageRelatedProductViewDetailsBtnElements.nth(i).isVisible());
    }
    public boolean isSingleProductPageRelatedProductQuickBuyBtnElementVisible(){
        int count = singleProductPageRelatedProductQuickBuyBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageRelatedProductQuickBuyBtnElements.nth(i).isVisible());
    }
    //customer review section
    public boolean isSingleProductPageCustomerReviewSectionTitleVisible(){return singleProductPageCustomerReviewSectionTitle.isVisible();}
    //list elements
    public boolean isSingleProductPageCustomerReviewProfileImgElementVisible(){
        int count = singleProductPageCustomerReviewProfileImgElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageCustomerReviewProfileImgElements.nth(i).isVisible());
    }
    public boolean isSingleProductPageCustomerReviewProfileNameElementVisible(){
        int count = singleProductPageCustomerReviewProfileNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageCustomerReviewProfileNameElements.nth(i).isVisible());
    }
    public boolean isSingleProductPageCustomerReviewSubmittedReviewStarElementVisible(){
        int count = singleProductPageCustomerReviewSubmittedReviewStarElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageCustomerReviewSubmittedReviewStarElements.nth(i).isVisible());
    }
    public boolean isSingleProductPageCustomerReviewSubtextElementVisible(){
        int count = singleProductPageCustomerReviewSubtextElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageCustomerReviewSubtextElements.nth(i).isVisible());
    }
    public boolean isSingleProductPageCustomerReviewTextElementVisible(){
        int count = singleProductPageCustomerReviewTextElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageCustomerReviewTextElements.nth(i).isVisible());
    }
    //leave review section
    public boolean isSingleProductPageLeaveReviewSectionTitleVisible(){return singleProductPageLeaveReviewSectionTitle.isVisible();}
    //input form
    public boolean isSingleProductPageLeaveReviewRatingSubtextVisible(){return singleProductPageLeaveReviewRatingSubtext.isVisible();}
    //list elements
    public boolean isSingleProductPageLeaveReviewRatingStarElementVisible(){
        int count = singleProductPageLeaveReviewRatingStarElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> singleProductPageLeaveReviewRatingStarElements.nth(i).isVisible());
    }
    //singular elements
    public boolean isSingleProductPageLeaveReviewSubtextVisible(){return singleProductPageLeaveReviewSubtext.isVisible();}
    public boolean isSingleProductPageLeaveReviewTextAreaVisible(){return singleProductPageLeaveReviewTextArea.isVisible();}
    //buttons
    public boolean isSingleProductPageLeaveReviewResetBtnVisible(){return singleProductPageLeaveReviewResetBtn.isVisible();}
    public boolean isSingleProductPageLeaveReviewSubmitBtnVisible(){return singleProductPageLeaveReviewSubmitBtn.isVisible();}

}
