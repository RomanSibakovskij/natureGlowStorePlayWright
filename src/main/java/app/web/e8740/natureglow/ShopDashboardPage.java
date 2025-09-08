package app.web.e8740.natureglow;

import app.web.e8740.natureglow.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShopDashboardPage extends BasePage {

    //shop dashboard page web elements
    private Locator shopDashboardPageTitle;
    private Locator shopDashboardPageSubtitle;
    //aside category section
    private Locator shopDashboardPageAsideCategorySectionTitle;
    //list elements
    private Locator shopDashboardPageAsideCategoryRadioBtnElements;
    private Locator shopDashboardPageAsideCategorySubtextElements;
    //aside price range section
    private Locator shopDashboardPageAsidePriceRangeSectionTitle;
    //slider elements
    private Locator shopDashboardPageAsidePriceRangeSliderBar;
    private Locator shopDashboardPageAsideMinPriceRange;
    private Locator shopDashboardPageAsideCurrentPriceRange;
    private Locator shopDashboardPageAsideMaxPriceRange;
    //aside availability section
    private Locator shopDashboardPageAsideAvailabilitySectionTitle;
    //list elements
    private Locator shopDashboardPageAsideAvailabilityCheckboxElements;
    private Locator shopDashboardPageAsideAvailabilitySubtextElements;
    //main
    private Locator shopDashboardPageSearchBarInputField;
    private Locator shopDashboardPageSearchButton;
    private Locator shopDashboardPageSortByDropdownMenu;
    //list elements
    private Locator shopDashboardPageSortByDropdownOptionElements;
    private Locator shopDashboardPagePaginationButtonElements;
    //product table (list elements)
    private Locator shopDashboardPageProductImgElements;
    private Locator shopDashboardPageProductNameElements;
    private Locator shopDashboardPageProductCategoryNameElements;
    private Locator shopDashboardPageProductDescriptionElements;
    private Locator shopDashboardPageProductUnitPriceElements;
    private Locator shopDashboardPageProductAvailabilityElements;
    private Locator shopDashboardPageProductViewDetailsBtnElements;
    private Locator shopDashboardPageProductQuickBuyBtnElements;

    public ShopDashboardPage(Page page) {
        super(page);

        shopDashboardPageTitle = page.locator("//h1[@class='text-4xl font-extrabold text-green-800']");
        shopDashboardPageSubtitle = page.locator("//p[@class='text-green-600 text-sm mt-2']");
        //aside category section
        shopDashboardPageAsideCategorySectionTitle = page.locator("//aside/div/div[1]/h3");
        //list elements
        shopDashboardPageAsideCategoryRadioBtnElements = page.locator("//aside/div/div[1]//li/input");
        shopDashboardPageAsideCategorySubtextElements = page.locator("//aside/div/div[1]//li/label");
        //aside price range section
        shopDashboardPageAsidePriceRangeSectionTitle = page.locator("//aside/div/div[2]/h3");
        //slider elements
        shopDashboardPageAsidePriceRangeSliderBar = page.locator("//aside/div/div[2]/input");
        shopDashboardPageAsideMinPriceRange = page.locator("//aside/div/div[2]//p[1]");
        shopDashboardPageAsideCurrentPriceRange = page.locator("//aside/div/div[2]//p[2]");
        shopDashboardPageAsideMaxPriceRange = page.locator("//aside/div/div[2]//p[3]");
        //aside availability section
        shopDashboardPageAsideAvailabilitySectionTitle = page.locator("//aside/div/div[3]/h3");
        //list elements
        shopDashboardPageAsideAvailabilityCheckboxElements = page.locator("//aside/div/div[3]//li/input");
        shopDashboardPageAsideAvailabilitySubtextElements = page.locator("//aside/div/div[3]//li/label");
        //main
        shopDashboardPageSearchBarInputField = page.locator("//input[@name='search']");
        shopDashboardPageSearchButton = page.locator("//div[@class='relative']/button");
        shopDashboardPageSortByDropdownMenu = page.locator("//select");
        //list elements
        shopDashboardPageSortByDropdownOptionElements = page.locator("//select/option");
        shopDashboardPagePaginationButtonElements = page.locator("//section[3]/button");
        //product table (list elements)
        shopDashboardPageProductImgElements = page.locator("//section[2]//img");
        shopDashboardPageProductNameElements = page.locator("//section[2]//div[@class='space-y-2 mt-4']/h3");
        shopDashboardPageProductCategoryNameElements = page.locator("//section[2]//div[@class='space-y-2 mt-4']/p[1]");
        shopDashboardPageProductDescriptionElements = page.locator("//section[2]//div[@class='space-y-2 mt-4']/p[2]");
        shopDashboardPageProductUnitPriceElements = page.locator("//section[2]//div[@class='flex items-center justify-between pt-2']/span[1]");
        shopDashboardPageProductAvailabilityElements = page.locator("//section[2]//div[@class='flex items-center justify-between pt-2']/span[2]");
        shopDashboardPageProductViewDetailsBtnElements = page.locator("//section[2]//div[@class='flex gap-4 w-full pt-3']/a[1]");
        shopDashboardPageProductQuickBuyBtnElements = page.locator("//section[2]//div[@class='flex gap-4 w-full pt-3']/a[2]");

    }

    //shop dashboard page product data getters
    public List<String> getShopDashboardPageProductName() {
        int count = shopDashboardPageProductNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashboardPageProductNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopDashboardPageProductCategoryName() {
        int count = shopDashboardPageProductCategoryNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashboardPageProductCategoryNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopDashboardPageProductDescription() {
        int count = shopDashboardPageProductDescriptionElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashboardPageProductDescriptionElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopDashboardPageProductUnitPrice() {
        int count = shopDashboardPageProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashboardPageProductUnitPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopDashboardPageProductAvailability() {
        int count = shopDashboardPageProductAvailabilityElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashboardPageProductAvailabilityElements.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //aside price range getters
    public String getShopDashboardPageAsideMinPrice(){
        String text = shopDashboardPageAsideMinPriceRange.innerText();
        java.util.regex.Matcher m = java.util.regex.Pattern
                .compile("\\$\\s*\\d+")
                .matcher(text);
        if (m.find()) {
            return m.group().replace(" ", ""); // price with '$'
        }
        return "";
    }
    public String getShopDashboardPageAsideCurrentPrice(){
        String text = shopDashboardPageAsideCurrentPriceRange.innerText();
        java.util.regex.Matcher m = java.util.regex.Pattern
                .compile("\\$\\s*\\d+")
                .matcher(text);
        if (m.find()) {
            return m.group().replace(" ", ""); // price with '$'
        }
        return "";
    }
    public String getShopDashboardPageAsideMaxPrice(){
        String text = shopDashboardPageAsideMaxPriceRange.innerText();
        java.util.regex.Matcher m = java.util.regex.Pattern
                .compile("\\$\\s*\\d+")
                .matcher(text);
        if (m.find()) {
            return m.group().replace(" ", ""); // price with '$'
        }
        return "";
    }

    //shop dashboard page text element getters
    public String getShopDashboardPageTitle() {return shopDashboardPageTitle.innerText();}
    public String getShopDashboardPageSubtitle() {return shopDashboardPageSubtitle.innerText();}
    //aside category section
    public String getShopDashboardPageAsideCategorySectionTitle() {return shopDashboardPageAsideCategorySectionTitle.innerText();}
    //list elements
    public List<String> getShopDashboardPageAsideCategorySubtext() {
        int count = shopDashboardPageAsideCategorySubtextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashboardPageAsideCategorySubtextElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //aside price range section
    public String getShopDashboardPageAsidePriceRangeSectionTitle() {return shopDashboardPageAsidePriceRangeSectionTitle.innerText();}
    //slider elements
    public String getShopDashboardPageAsideMinPriceRange() {
        String text = shopDashboardPageAsideMinPriceRange.innerText();
        for (String part : text.split("\\s+")) {
            if (part.startsWith("min:")) {
                return part;
            }
        }
        return "";
    }
    public String getShopDashboardPageAsideCurrentPriceRange() {
        String text = shopDashboardPageAsideCurrentPriceRange.innerText();
        for (String part : text.split("\\s+")) {
            if (part.startsWith("crnt:")) {
                return part.replace("$", "").trim();
            }
        }
        return "";
    }
    public String getShopDashboardPageAsideMaxPriceRange() {
        String text = shopDashboardPageAsideMaxPriceRange.innerText();
        for (String part : text.split("\\s+")) {
            if (part.startsWith("max:")) {
                return part;
            }
        }
        return "";
    }
    //aside availability section
    public String getShopDashboardPageAsideAvailabilitySectionTitle() {return shopDashboardPageAsideAvailabilitySectionTitle.innerText();}
    //list elements
    public List<String> getShopDashboardPageAsideAvailabilitySubtext() {
        int count = shopDashboardPageAsideAvailabilitySubtextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashboardPageAsideAvailabilitySubtextElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //main
    public String getShopDashboardPageSearchButtonText(){return shopDashboardPageSearchButton.innerText();}
    //list elements
    public List<String> getShopDashboardPageProductViewDetailsBtnText() {
        int count = shopDashboardPageProductViewDetailsBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashboardPageProductViewDetailsBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopDashboardPageProductQuickBuyBtnText() {
        int count = shopDashboardPageProductQuickBuyBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashboardPageProductQuickBuyBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getShopDashboardPagePaginationButtonText() {
        int count = shopDashboardPagePaginationButtonElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> shopDashboardPagePaginationButtonElements.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //shop dashboard page web element assert methods
    public boolean isShopDashboardPageTitleVisible() {return shopDashboardPageTitle.isVisible();}
    public boolean isShopDashboardPageSubtitleVisible() {return shopDashboardPageSubtitle.isVisible();}
    //aside category section
    public boolean isShopDashboardPageAsideCategorySectionTitleVisible() {return shopDashboardPageAsideCategorySectionTitle.isVisible();}
    //list elements
    public boolean isShopDashboardPageAsideCategoryRadioBtnElementVisible() {
        int count = shopDashboardPageAsideCategoryRadioBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageAsideCategoryRadioBtnElements.nth(i).isVisible());
    }
    public boolean isShopDashboardPageAsideCategorySubtextElementVisible() {
        int count = shopDashboardPageAsideCategorySubtextElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageAsideCategorySubtextElements.nth(i).isVisible());
    }
    //aside price range section
    public boolean isShopDashboardPageAsidePriceRangeSectionTitleVisible() {return shopDashboardPageAsidePriceRangeSectionTitle.isVisible();}
    public boolean isShopDashboardPageAsidePriceRangeSliderBarVisible() {return shopDashboardPageAsidePriceRangeSliderBar.isVisible();}
    public boolean isShopDashboardPageAsideMinPriceRangeVisible() {return shopDashboardPageAsideMinPriceRange.isVisible();}
    public boolean isShopDashboardPageAsideCurrentPriceRangeVisible() {return shopDashboardPageAsideCurrentPriceRange.isVisible();}
    public boolean isShopDashboardPageAsideMaxPriceRangeVisible() {return shopDashboardPageAsideMaxPriceRange.isVisible();}
    //aside availability section
    public boolean isShopDashboardPageAsideAvailabilitySectionTitleVisible() {return shopDashboardPageAsideAvailabilitySectionTitle.isVisible();}
    //list elements
    public boolean isShopDashboardPageAsideAvailabilityCheckboxElementVisible() {
        int count = shopDashboardPageAsideAvailabilityCheckboxElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageAsideAvailabilityCheckboxElements.nth(i).isVisible());
    }
    public boolean isShopDashboardPageAsideAvailabilitySubtextElementVisible() {
        int count = shopDashboardPageAsideAvailabilitySubtextElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageAsideAvailabilitySubtextElements.nth(i).isVisible());
    }
    //main
    public boolean isShopDashboardPageSearchBarInputFieldVisible() {return shopDashboardPageSearchBarInputField.isVisible();}
    public boolean isShopDashboardPageSearchButtonVisible() {return shopDashboardPageSearchButton.isVisible();}
    public boolean isShopDashboardPageSortByDropdownMenuVisible() {return shopDashboardPageSortByDropdownMenu.isVisible();}
    //list elements
    public boolean isShopDashboardPagePaginationButtonElementVisible() {
        int count = shopDashboardPagePaginationButtonElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPagePaginationButtonElements.nth(i).isVisible());
    }
    //product table(list elements)
    public boolean isShopDashboardPageProductImgElementVisible() {
        int count = shopDashboardPageProductImgElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageProductImgElements.nth(i).isVisible());
    }
    public boolean isShopDashboardPageProductNameElementVisible() {
        int count = shopDashboardPageProductNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageProductNameElements.nth(i).isVisible());
    }
    public boolean isShopDashboardPageProductCategoryNameElementVisible() {
        int count = shopDashboardPageProductCategoryNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageProductCategoryNameElements.nth(i).isVisible());
    }
    public boolean isShopDashboardPageProductDescriptionElementVisible() {
        int count = shopDashboardPageProductDescriptionElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageProductDescriptionElements.nth(i).isVisible());
    }
    public boolean isShopDashboardPageProductUnitPriceElementVisible() {
        int count = shopDashboardPageProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageProductUnitPriceElements.nth(i).isVisible());
    }
    public boolean isShopDashboardPageProductAvailabilityElementVisible() {
        int count = shopDashboardPageProductAvailabilityElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageProductAvailabilityElements.nth(i).isVisible());
    }
    public boolean isShopDashboardPageProductViewDetailsBtnElementVisible() {
        int count = shopDashboardPageProductViewDetailsBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageProductViewDetailsBtnElements.nth(i).isVisible());
    }
    public boolean isShopDashboardPageProductQuickBuyBtnElementVisible() {
        int count = shopDashboardPageProductQuickBuyBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> shopDashboardPageProductQuickBuyBtnElements.nth(i).isVisible());
    }

}
