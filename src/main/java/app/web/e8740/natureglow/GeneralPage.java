package app.web.e8740.natureglow;

import app.web.e8740.natureglow.utilities.BasePage;
import com.microsoft.playwright.*;

import java.util.*;
import java.util.stream.*;

public class GeneralPage extends BasePage {

    //general page web elements (elements all pages have)
    //header
    private Locator headerHomePageIconLink;
    //list elements
    private Locator headerNavbarLinkElements;
    //singular elements
    private Locator headerAccountLink;
    private Locator headerShoppingCartButton;
    //footer
    private Locator footerNatureGlowIcon;
    private Locator footerNatureGlowSubtext;
    //explore section
    private Locator footerExploreSectionTitle;
    //list elements
    private Locator footerExploreSectionLinkElements;
    //helpful links section
    private Locator footerHelpfulLinksSectionTitle;
    //list elements
    private Locator footerHelpfulLinkElements;
    //get in touch section
    private Locator footerGetInTouchSectionTitle;
    private Locator footerGetInTouchPhone;
    private Locator footerGetInTouchSupportEmail;
    private Locator footerGetInTouchWorkTime;
    //socials (list elements)
    private Locator footerSocialIconLinkElements;
    //copyright section
    private Locator footerCopyrightText;
    private Locator footerCreatorLink;

    public GeneralPage(Page page) {
        super(page);

        //header
        headerHomePageIconLink = page.locator("//div[@class='navbar-start']/a");
        //list elements
        headerNavbarLinkElements = page.locator("//ul[@class='menu menu-horizontal px-1']/a");
        //singular elements
        headerAccountLink = page.locator("//div[@class='navbar-end gap-2 items-center']/a[@title='SignIn Page']");
        headerShoppingCartButton = page.locator("//div[@class='navbar-end gap-2 items-center']/a[@title='Cart Items']");
        //footer
        footerNatureGlowIcon = page.locator("//div[@class='max-w-7xl mx-auto grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-10']/div[1]/img");
        footerNatureGlowSubtext = page.locator("//div[@class='max-w-7xl mx-auto grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-10']/div[1]/p");
        //explore section
        footerExploreSectionTitle = page.locator("//div[@class='max-w-7xl mx-auto grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-10']/div[2]/h4");
        //list elements
        footerExploreSectionLinkElements = page.locator("//div[@class='max-w-7xl mx-auto grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-10']/div[2]/ul/li/a");
        //helpful links section
        footerHelpfulLinksSectionTitle = page.locator("//div[@class='max-w-7xl mx-auto grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-10']/div[3]/h4");
        //list elements
        footerHelpfulLinkElements = page.locator("//div[@class='max-w-7xl mx-auto grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-10']/div[3]/ul/li/a");
        //get in touch section
        footerGetInTouchSectionTitle = page.locator("//div[@class='max-w-7xl mx-auto grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-10']/div[4]/h4");
        footerGetInTouchPhone = page.locator("//div[@class='max-w-7xl mx-auto grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-10']/div[4]/p[1]");
        footerGetInTouchSupportEmail = page.locator("//div[@class='max-w-7xl mx-auto grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-10']/div[4]/p[2]");
        footerGetInTouchWorkTime = page.locator("//div[@class='max-w-7xl mx-auto grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-10']/div[4]/p[3]");
        //socials(list elements)
        footerSocialIconLinkElements = page.locator("//div[@class='max-w-7xl mx-auto grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-10']/div[4]/div/a");
        //copyright section
        footerCopyrightText = page.locator("//div[@class='mt-10 border-t border-green-300 pt-6 text-center text-xs text-gray-500']");
        footerCreatorLink = page.locator("//div[@class='mt-10 border-t border-green-300 pt-6 text-center text-xs text-gray-500']/a");
    }

    //click header home page icon link method
    public void clickHeaderHomePageIconLink(){headerHomePageIconLink.click();}

    //click header navbar "Shop" link method
    public void clickSetHeaderNavbarLink(int index){headerNavbarLinkElements.nth(index).click();}

    //click "Account" link method
    public void clickAccountLink(){headerAccountLink.click();}

    //general page text element getters
    //header
    public List<String> getHeaderNavbarLinkText(){
        int count = headerNavbarLinkElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> headerNavbarLinkElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //footer
    public String getFooterNatureGlowSubtext(){return footerNatureGlowSubtext.innerText();}
    //explore section
    public String getFooterExploreSectionTitle(){return footerExploreSectionTitle.innerText();}
    //list elements
    public List<String> getFooterExploreSectionLinkText(){
        int count = footerExploreSectionLinkElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> footerExploreSectionLinkElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //helpful links section
    public String getFooterHelpfulLinksSectionTitle(){return footerHelpfulLinksSectionTitle.innerText();}
    //list elements
    public List<String> getFooterHelpfulLinkText(){
        int count = footerHelpfulLinkElements.count();
        return IntStream.range(0, count)
                .mapToObj(i -> footerHelpfulLinkElements.nth(i).innerText())
                .collect(Collectors.toList());
    }
    //get in touch section
    public String getFooterGetInTouchSectionTitle(){return footerGetInTouchSectionTitle.innerText();}
    public String getFooterGetInTouchPhone(){return footerGetInTouchPhone.innerText();}
    public String getFooterGetInTouchSupportEmail(){return footerGetInTouchSupportEmail.innerText();}
    public String getFooterGetInTouchWorkTime(){return footerGetInTouchWorkTime.innerText();}
    //copyright section
    public String getFooterCopyrightText(){return footerCopyrightText.innerText();}

    //general page web element assert methods
    public boolean isHeaderHomePageIconLinkVisible() {return headerHomePageIconLink.isVisible();}
    //list elements
    public boolean isHeaderNavbarLinkElementsVisible() {
        int count = headerNavbarLinkElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> headerNavbarLinkElements.nth(i).isVisible());
    }
    //singular elements
    public boolean isHeaderAccountLinkVisible() {return headerAccountLink.isVisible();}
    public boolean isHeaderShoppingCartButtonVisible() {return headerShoppingCartButton.isVisible();}
    //footer
    public boolean isFooterNatureGlowIconVisible() {return footerNatureGlowIcon.isVisible();}
    public boolean isFooterNatureGlowSubtextVisible() {return footerNatureGlowSubtext.isVisible();}
    //explore section
    public boolean isFooterExploreSectionTitleVisible() {return footerExploreSectionTitle.isVisible();}
    //list elements
    public boolean isFooterExploreSectionLinkElementsVisible() {
        int count = footerExploreSectionLinkElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> footerExploreSectionLinkElements.nth(i).isVisible());
    }
    //helpful links section
    public boolean isFooterHelpfulLinksSectionTitleVisible() {return footerHelpfulLinksSectionTitle.isVisible();}
    //list elements
    public boolean isFooterHelpfulLinksSectionLinkElementsVisible() {
        int count = footerHelpfulLinkElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> footerHelpfulLinkElements.nth(i).isVisible());
    }
    //get in touch section
    public boolean isFooterGetInTouchSectionTitleVisible() {return footerGetInTouchSectionTitle.isVisible();}
    public boolean isFooterGetInTouchPhoneVisible() {return footerGetInTouchPhone.isVisible();}
    public boolean isFooterGetInTouchSupportEmailVisible() {return footerGetInTouchSupportEmail.isVisible();}
    public boolean isFooterGetInTouchWorkTimeVisible() {return footerGetInTouchWorkTime.isVisible();}
    //socials (list elements)
    public boolean isFooterSocialIconLinkElementsVisible() {
        int count = footerSocialIconLinkElements.count();
        return IntStream.range(0, count)
                .allMatch(i -> footerSocialIconLinkElements.nth(i).isVisible());
    }
    //copyright section
    public boolean isFooterCopyrightTextVisible() {return footerCopyrightText.isVisible();}
    public boolean isFooterCreatorLinkVisible() {return footerCreatorLink.isVisible();}

}
