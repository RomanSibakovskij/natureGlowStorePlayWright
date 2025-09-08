package app.web.e8740.natureglow;

import app.web.e8740.natureglow.utilities.*;
import com.microsoft.playwright.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckoutPage extends BasePage {

    //checkout page web elements
    private Locator checkoutPageTitle;
    private Locator checkoutPageSubtitle;
    //customer info section
    private Locator checkoutPageCustomerInfoSectionTitle;
    //(guest) input form
    private Locator checkoutPageFullNameSubtext;
    private Locator checkoutPageFullNameInputField;
    private Locator checkoutPageEmailSubtext;
    private Locator checkoutPageEmailInputField;
    private Locator checkoutPagePhoneSubtext;
    private Locator checkoutPagePhoneInputField;
    private Locator checkoutPageAddressSubtext;
    private Locator checkoutPageAddressInputField;
    private Locator checkoutPageOrderNoteSubtext;
    private Locator checkoutPageOrderNoteTextArea;
    //products table
    private Locator checkoutPageProductTableSectionTitle;
    //list elements
    private Locator checkoutPageProductImgElements;
    private Locator checkoutPageProductNameElements;
    private Locator checkoutPageProductPriceElements;
    private Locator checkoutPageProductQtySubtextElements;
    private Locator checkoutPageProductQtyInputFieldElements;
    private Locator checkoutPageProductRemoveBtnElements;
    //order summary section
    //list elements
    private Locator checkoutPageOrderSummarySectionTitle;
    private Locator checkoutPageOrderProductNameElements;
    private Locator checkoutPageOrderProductUnitPriceElements;
    //singular elements
    private Locator checkoutPageOrderShippingSubtext;
    private Locator checkoutPageOrderShippingPrice;
    private Locator checkoutPageOrderSubtotalSubtext;
    private Locator checkoutPageOrderSubtotalPrice;
    private Locator checkoutPageOrderTotalSubtext;
    private Locator checkoutPageOrderTotalPrice;
    //payment method section
    private Locator checkoutPagePayMethodSectionTitle;
    //list elements
    private Locator checkoutPagePayMethodBtnElements;
    //button
    private Locator checkoutPagePlaceOrderButton;

    public CheckoutPage(Page page) {
        super(page);

        checkoutPageTitle = page.locator("//section[1]/h1");
        checkoutPageSubtitle = page.locator("//section[1]/p");
        //customer info section
        checkoutPageCustomerInfoSectionTitle = page.locator("//section[2]/h1");
        //(guest) input form
        checkoutPageFullNameSubtext = page.locator("//section[2]/div/div[1]/label");
        checkoutPageFullNameInputField = page.locator("//section[2]/div/div[1]/input");
        checkoutPageEmailSubtext = page.locator("//section[2]/div/div[2]/label");
        checkoutPageEmailInputField = page.locator("//section[2]/div/div[2]/input");
        checkoutPagePhoneSubtext = page.locator("//section[2]/div/div[3]/label");
        checkoutPagePhoneInputField = page.locator("//section[2]/div/div[3]/input");
        checkoutPageAddressSubtext = page.locator("//section[2]/div/div[4]/label");
        checkoutPageAddressInputField = page.locator("//section[2]/div/div[4]/input");
        checkoutPageOrderNoteSubtext = page.locator("//section[2]/div/div[5]/label");
        checkoutPageOrderNoteTextArea = page.locator("//section[2]/div/div[5]/textarea");
        //products table
        checkoutPageProductTableSectionTitle = page.locator("//section[3]/h3");
        //list elements
        checkoutPageProductImgElements = page.locator("//section[3]/div//img");
        checkoutPageProductNameElements = page.locator("//section[3]/div//h2");
        checkoutPageProductPriceElements = page.locator("//section[3]/div//p");
        checkoutPageProductQtySubtextElements = page.locator("//section[3]/div//div[@class='mt-2 flex items-center justify-center md:justify-start gap-2']/label");
        checkoutPageProductQtyInputFieldElements = page.locator("//section[3]/div//div[@class='mt-2 flex items-center justify-center md:justify-start gap-2']/input");
        checkoutPageProductRemoveBtnElements = page.locator("//section[3]/div//button");
        //order summary section (list elements)
        checkoutPageOrderSummarySectionTitle = page.locator("//section[4]/h3");
        checkoutPageOrderProductNameElements = page.locator("//section[4]/div[@class='flex justify-between text-sm']/span[1]");
        checkoutPageOrderProductUnitPriceElements = page.locator("//section[4]/div[@class='flex justify-between text-sm']/span[2]");
        //singular elements
        checkoutPageOrderShippingSubtext = page.locator("//section[4]/div[@class='flex justify-between text-sm text-green-500']/span[1]");
        checkoutPageOrderShippingPrice = page.locator("//section[4]/div[@class='flex justify-between text-sm text-green-500']/span[2]");
        checkoutPageOrderSubtotalSubtext = page.locator("//section[4]/div[@class='flex justify-between text-sm text-green-600']/span[1]");
        checkoutPageOrderSubtotalPrice = page.locator("//section[4]/div[@class='flex justify-between text-sm text-green-600']/span[2]");
        checkoutPageOrderTotalSubtext = page.locator("//section[4]/div[@class='flex justify-between text-sm text-green-900']/span[1]");
        checkoutPageOrderTotalPrice = page.locator("//section[4]/div[@class='flex justify-between text-sm text-green-900']/span[2]");
        //payment method section
        checkoutPagePayMethodSectionTitle = page.locator("//section[5]/h3");
        //list elements
        checkoutPagePayMethodBtnElements = page.locator("//section[5]/div[1]/button");
        //button
        checkoutPagePlaceOrderButton = page.locator("//section[5]/div[2]/button");

    }

    //checkout page product data getters
    public List<String> getCheckoutPageProductName(){
        int count = checkoutPageProductNameElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageProductNameElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getCheckoutPageProductUnitPrice(){
        int count = checkoutPageProductPriceElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageProductPriceElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    public List<String> getCheckoutPageProductQuantity(){
        int count = checkoutPageProductQtyInputFieldElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageProductQtyInputFieldElements.nth(i).innerText())
                .collect(Collectors.toList());
    }

    //checkout page text element getters
    public String getCheckoutPageTitle() {return checkoutPageTitle.innerText();}
    public String getCheckoutPageSubtitle() {return checkoutPageSubtitle.innerText();}
    //customer info section
    public String getCheckoutPageCustomerInfoSectionTitle() {return checkoutPageCustomerInfoSectionTitle.innerText();}
    //input form
    public String getCheckoutPageFullNameSubtext() {return checkoutPageFullNameSubtext.innerText();}
    public String getCheckoutPageEmailSubtext() {return checkoutPageEmailSubtext.innerText();}
    public String getCheckoutPagePhoneSubtext() {return checkoutPagePhoneSubtext.innerText();}
    public String getCheckoutPageAddressSubtext() {return checkoutPageAddressSubtext.innerText();}
    public String getCheckoutPageOrderNoteSubtext() {return checkoutPageOrderNoteSubtext.innerText();}
    //product table
    public String getCheckoutPageProductTableSectionTitle() {return checkoutPageProductTableSectionTitle.innerText();}
    //list elements
    public List<String> getCheckoutPageProductQtySubtext(){
        int count = checkoutPageProductQtySubtextElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPageProductQtySubtextElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //order summary section
    public String getCheckoutPageOrderSummarySectionTitle() {return checkoutPageOrderSummarySectionTitle.innerText();}
    public String getCheckoutPageOrderShippingSubtext() {return checkoutPageOrderShippingSubtext.innerText();}
    public String getCheckoutPageOrderSubtotalSubtext() {return checkoutPageOrderSubtotalSubtext.innerText();}
    public String getCheckoutPageOrderTotalSubtext() {return checkoutPageOrderTotalSubtext.innerText();}
    //payment method section
    public String getCheckoutPagePayMethodSectionTitle() {return checkoutPagePayMethodSectionTitle.innerText();}
    //list elements
    public List<String> getCheckoutPagePayMethodBtnText(){
        int count = checkoutPagePayMethodBtnElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> checkoutPagePayMethodBtnElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //button
    public String getCheckoutPagePlaceOrderBtnText() {return checkoutPagePlaceOrderButton.innerText();}

    //checkout page web element assert methods
    public boolean isCheckoutPageTitleVisible() {return checkoutPageTitle.isVisible();}
    public boolean isCheckoutPageSubtitleVisible() {return checkoutPageSubtitle.isVisible();}
    //customer info section
    public boolean isCheckoutPageCustomerInfoSectionTitleVisible() {return checkoutPageCustomerInfoSectionTitle.isVisible();}
    //input form
    public boolean isCheckoutPageFullNameSubtextVisible() {return checkoutPageFullNameSubtext.isVisible();}
    public boolean isCheckoutPageFullNameInputFieldVisible() {return checkoutPageFullNameInputField.isVisible();}
    public boolean isCheckoutPageEmailSubtextVisible() {return checkoutPageEmailSubtext.isVisible();}
    public boolean isCheckoutPageEmailInputFieldVisible() {return checkoutPageEmailInputField.isVisible();}
    public boolean isCheckoutPagePhoneSubtextVisible() {return checkoutPagePhoneSubtext.isVisible();}
    public boolean isCheckoutPagePhoneInputFieldVisible() {return checkoutPagePhoneInputField.isVisible();}
    public boolean isCheckoutPageAddressSubtextVisible() {return checkoutPageAddressSubtext.isVisible();}
    public boolean isCheckoutPageAddressInputFieldVisible() {return checkoutPageAddressInputField.isVisible();}
    public boolean isCheckoutPageOrderNoteSubtextVisible() {return checkoutPageOrderNoteSubtext.isVisible();}
    public boolean isCheckoutPageOrderNoteTextAreaVisible() {return checkoutPageOrderNoteTextArea.isVisible();}
    //product table
    public boolean isCheckoutPageProductTableSectionTitleVisible() {return checkoutPageProductTableSectionTitle.isVisible();}
    //list elements
    public boolean isCheckoutPageProductImgElementVisible() {
        int count = checkoutPageProductImgElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductImgElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageProductNameElementVisible() {
        int count = checkoutPageProductNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductNameElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageProductPriceElementVisible() {
        int count = checkoutPageProductPriceElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductPriceElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageProductQtySubtextElementVisible() {
        int count = checkoutPageProductQtySubtextElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductQtySubtextElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageProductQtyInputFieldElementVisible() {
        int count = checkoutPageProductQtyInputFieldElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductQtyInputFieldElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageProductRemoveBtnElementVisible() {
        int count = checkoutPageProductRemoveBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageProductRemoveBtnElements.nth(i).isVisible());
    }
    //order summary section
    public boolean isCheckoutPageOrderSummarySectionTitleVisible() {return checkoutPageOrderSummarySectionTitle.isVisible();}
    //list elements
    public boolean isCheckoutPageOrderProductNameElementVisible() {
        int count = checkoutPageOrderProductNameElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageOrderProductNameElements.nth(i).isVisible());
    }
    public boolean isCheckoutPageOrderProductUnitPriceElementVisible() {
        int count = checkoutPageOrderProductUnitPriceElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPageOrderProductUnitPriceElements.nth(i).isVisible());
    }
    //singular elements
    public boolean isCheckoutPageOrderShippingSubtextVisible() {return checkoutPageOrderShippingSubtext.isVisible();}
    public boolean isCheckoutPageOrderShippingPriceVisible() {return checkoutPageOrderShippingPrice.isVisible();}
    public boolean isCheckoutPageOrderSubtotalSubtextVisible() {return checkoutPageOrderSubtotalSubtext.isVisible();}
    public boolean isCheckoutPageOrderOrderSubtotalPriceVisible() {return checkoutPageOrderSubtotalPrice.isVisible();}
    public boolean isCheckoutPageOrderTotalSubtextVisible() {return checkoutPageOrderTotalSubtext.isVisible();}
    public boolean isCheckoutPageOrderTotalPriceVisible() {return checkoutPageOrderTotalPrice.isVisible();}
    //payment method section
    public boolean isCheckoutPagePayMethodSectionTitleVisible() {return checkoutPagePayMethodSectionTitle.isVisible();}
    //list elements
    public boolean isCheckoutPagePayMethodBtnElementsVisible() {
        int count = checkoutPagePayMethodBtnElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> checkoutPagePayMethodBtnElements.nth(i).isVisible());
    }
    //button
    public boolean isCheckoutPagePlaceOrderButtonVisible() {return checkoutPagePlaceOrderButton.isVisible();}

}
