package app.web.e8740.natureglow;

import app.web.e8740.natureglow.utilities.*;
import com.microsoft.playwright.*;

public class LoginSignUpDashboardPage extends BasePage {

    //login/signup dashboard page web elements
    private Locator loginSignUpDashPageNatureGlowTitle;
    private Locator loginSignUpDashPageNatureGlowText;
    private Locator loginSignUpDashPageNatureGlowImage;
    //login section
    private Locator loginSignUpDashPageLoginSectionTitle;
    //input form
    private Locator loginSignUpDashPageLoginEmailSubtext;
    private Locator loginSignUpDashPageLoginEmailInputField;
    private Locator loginSignUpDashPageLoginPasswordSubtext;
    private Locator loginSignUpDashPageLoginPasswordInputField;
    private Locator loginSignUpDashPageLoginViewPasswordButton;
    private Locator loginSignUpDashPageForgotPasswordLink;
    private Locator loginSignUpDashPageSignInButton;
    //alt sign in
    private Locator loginSignUpDashPageSignInWithText;
    private Locator loginSignUpDashPageGoogleSignInButton;
    private Locator loginSignUpDashPageFacebookSignInButton;
    private Locator loginSignUpDashPageSignUpText;
    private Locator loginSignUpDashPageSignUpLink;
    //sign up section
    private Locator loginSignUpDashPageSignUpSectionTitle;
    //input form
    private Locator loginSignUpDashPageSignUpFullNameSubtext;
    private Locator loginSignUpDashPageSignUpFullNameInputField;
    private Locator loginSignUpDashPageSignUpEmailSubtext;
    private Locator loginSignUpDashPageSignUpEmailInputField;
    private Locator loginSignUpDashPageSignUpPasswordSubtext;
    private Locator loginSignUpDashPageSignUpPasswordInputField;
    private Locator loginSignUpDashPageSignUpViewPasswordButton;
    private Locator loginSignUpDashPageSignUpButton;
    private Locator loginSignUpDashPageSignInText;
    private Locator loginSignUpDashPageSignInLink;

    //valid sign up input data
    private String validFullName;
    private String validEmail;
    private String validPassword;

    public LoginSignUpDashboardPage(Page page) {
        super(page);

        loginSignUpDashPageNatureGlowTitle = page.locator("//h2[@class='text-3xl font-bold text-green-800']");
        loginSignUpDashPageNatureGlowText = page.locator("//p[@class='text-green-700 text-sm']");
        loginSignUpDashPageNatureGlowImage = page.locator("//img[@class='mx-auto lg:h-96']");
        //login section
        loginSignUpDashPageLoginSectionTitle = page.locator("//h3");
        //input field
        loginSignUpDashPageLoginEmailSubtext = page.locator("//form/div[1]/label");
        loginSignUpDashPageLoginEmailInputField = page.locator("//form/div[1]//input");
        loginSignUpDashPageLoginPasswordSubtext = page.locator("//form/div[2]/label");
        loginSignUpDashPageLoginPasswordInputField = page.locator("//form/div[2]//input");
        loginSignUpDashPageLoginViewPasswordButton = page.locator("//form/div[2]//span");
        loginSignUpDashPageForgotPasswordLink = page.locator("//form/div[2]//a");
        loginSignUpDashPageSignInButton = page.locator("//form/button");
        //alt sign in
        loginSignUpDashPageSignInWithText = page.locator("//form/div[@class='flex items-center gap-3 text-sm text-gray-400']");
        loginSignUpDashPageGoogleSignInButton = page.locator("//form/div[@class='flex flex-col gap-3']/button[1]");
        loginSignUpDashPageFacebookSignInButton = page.locator("//form/div[@class='flex flex-col gap-3']/button[2]");
        loginSignUpDashPageSignUpText = page.locator("//form/p[@class='text-sm text-center text-gray-600']");
        loginSignUpDashPageSignUpLink = page.locator("//form/p[@class='text-sm text-center text-gray-600']/a");
        //sign in section
        loginSignUpDashPageSignUpSectionTitle = page.locator("//form/h3");
        //input form
        loginSignUpDashPageSignUpFullNameSubtext = page.locator("//form/div[1]/label");
        loginSignUpDashPageSignUpFullNameInputField = page.locator("//form/div[1]//input");
        loginSignUpDashPageSignUpEmailSubtext = page.locator("//form/div[2]/label");
        loginSignUpDashPageSignUpEmailInputField = page.locator("//form/div[2]//input");
        loginSignUpDashPageSignUpPasswordSubtext = page.locator("//form/div[3]/label");
        loginSignUpDashPageSignUpPasswordInputField = page.locator("//form/div[3]//input");
        loginSignUpDashPageSignUpViewPasswordButton = page.locator("//form/div[3]//span//*[name()='svg']");
        loginSignUpDashPageSignUpButton = page.locator("//form/button[@type='submit']");
        loginSignUpDashPageSignInText = page.locator("//form/p");
        loginSignUpDashPageSignInLink = page.locator("//form/p/a");

    }

    //click "Sign Up" link method
    public void clickSignInLink(){loginSignUpDashPageSignUpLink.click();}

    //valid sign up input data getter
    public void validSignUpInputDataGetter(){

        validFullName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        validEmail = TestDataGenerator.generateRandomEmailAddress(9);
        validPassword = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid user sign up generated data: " + "\n");

        logger.info("Valid generated user sign up full name: " + validFullName);
        logger.info("Valid generated user sign up email: " + validEmail);
        logger.info("Valid generated user sign up password: " + validPassword);

        System.out.println("\n");
    }

    //valid sign up data input methods
    public void inputValidFullNameIntoFullNameInputField(){loginSignUpDashPageSignUpFullNameInputField.fill(validFullName);}
    public void inputValidEmailIntoEmailInputField(){loginSignUpDashPageSignUpEmailInputField.fill(validEmail);}
    public void inputValidPasswordIntoPasswordInputField(){loginSignUpDashPageSignUpPasswordInputField.fill(validPassword);}

    //click "View Password" (sign up) button method
    public void clickSignUpViewPasswordButton(){loginSignUpDashPageSignUpViewPasswordButton.click();}

    //click "Sign Up" button method (the simple click() fails to work with this button)
    public void clickSignUpButton(){
        // Get the underlying element handle from the Locator
        ElementHandle signUpButtonElement = loginSignUpDashPageSignUpButton.elementHandle();

        if (signUpButtonElement != null) {
            // Trigger a JS click on the element
            page.evaluate("element => element.click()", signUpButtonElement);
        } else {
            throw new RuntimeException("Sign Up button element not found on the page.");
        }
    }

    //login/signup dashboard page text element getters
    public String getLoginSignUpDashPageNatureGlowTitle() {return loginSignUpDashPageNatureGlowTitle.innerText();}
    public String getLoginSignUpDashPageNatureGlowText() {return loginSignUpDashPageNatureGlowText.innerText();}
    //login section
    public String getLoginSignUpDashPageLoginSectionTitle() {return loginSignUpDashPageLoginSectionTitle.innerText();}
    //input form
    public String getLoginSignUpDashPageLoginEmailSubtext() {return loginSignUpDashPageLoginEmailSubtext.innerText();}
    public String getLoginSignUpDashPageLoginPasswordSubtext() {return loginSignUpDashPageLoginPasswordSubtext.innerText();}
    public String getLoginSignUpDashPageForgotPasswordLinkText() {return loginSignUpDashPageForgotPasswordLink.innerText();}
    public String getLoginSignUpDashPageSignInButtonText() {return loginSignUpDashPageSignInButton.innerText();}
    //alt sign in
    public String getLoginSignUpDashPageSignInWithText() {return loginSignUpDashPageSignInWithText.innerText();}
    public String getLoginSignUpDashPageGoogleSignInButtonText() {return loginSignUpDashPageGoogleSignInButton.innerText();}
    public String getLoginSignUpDashPageFacebookSignInButtonText() {return loginSignUpDashPageFacebookSignInButton.innerText();}
    public String getLoginSignUpDashPageSignUpText() {return loginSignUpDashPageSignUpText.innerText();}

    //sign up section
    public String getLoginSignUpDashPageSignUpSectionTitle() {return loginSignUpDashPageSignUpSectionTitle.innerText();}
    //input field
    public String getLoginSignUpDashPageSignUpFullNameSubtext() {return loginSignUpDashPageSignUpFullNameSubtext.innerText();}
    public String getLoginSignUpDashPageSignUpEmailSubtext() {return loginSignUpDashPageSignUpEmailSubtext.innerText();}
    public String getLoginSignUpDashPageSignUpPasswordSubtext() {return loginSignUpDashPageSignUpPasswordSubtext.innerText();}
    public String getLoginSignUpDashPageSignUpButtonText() {return loginSignUpDashPageSignUpButton.innerText();}
    public String getLoginSignUpDashPageSignInText() {return loginSignUpDashPageSignInText.innerText();}

    //login/signup dashboard page web element assert methods
    public boolean isLoginSignUpDashPageNatureGlowTitleVisible() {return loginSignUpDashPageNatureGlowTitle.isVisible();}
    public boolean isLoginSignUpDashPageNatureGlowTextVisible() {return loginSignUpDashPageNatureGlowText.isVisible();}
    public boolean isLoginSignUpDashPageNatureGlowImageVisible() {return loginSignUpDashPageNatureGlowImage.isVisible();}
    //login section
    public boolean isLoginSignUpDashPageLoginSectionTitleVisible() {return loginSignUpDashPageLoginSectionTitle.isVisible();}
    public boolean isLoginSignUpDashPageLoginEmailSubtextVisible() {return loginSignUpDashPageLoginEmailSubtext.isVisible();}
    public boolean isLoginSignUpDashPageLoginEmailInputFieldVisible() {return loginSignUpDashPageLoginEmailInputField.isVisible();}
    public boolean isLoginSignUpDashPageLoginPasswordSubtextVisible() {return loginSignUpDashPageLoginPasswordSubtext.isVisible();}
    public boolean isLoginSignUpDashPageLoginPasswordInputFieldVisible() {return loginSignUpDashPageLoginPasswordInputField.isVisible();}
    public boolean isLoginSignUpDashPageLoginViewPasswordButtonVisible() {return loginSignUpDashPageLoginViewPasswordButton.isVisible();}
    public boolean isLoginSignUpDashPageForgotPasswordLinkVisible() {return loginSignUpDashPageForgotPasswordLink.isVisible();}
    public boolean isLoginSignUpDashPageSignInButtonVisible() {return loginSignUpDashPageSignInButton.isVisible();}
    //alt sign in
    public boolean isLoginSignUpDashPageSignInWithTextVisible() {return loginSignUpDashPageSignInWithText.isVisible();}
    public boolean isLoginSignUpDashPageGoogleSignInButtonVisible() {return loginSignUpDashPageSignInButton.isVisible();}
    public boolean isLoginSignUpDashPageFacebookSignInButtonVisible() {return loginSignUpDashPageSignInButton.isVisible();}
    public boolean isLoginSignUpDashPageSignUpTextVisible() {return loginSignUpDashPageSignUpText.isVisible();}
    public boolean isLoginSignUpDashPageSignUpLinkVisible() {return loginSignUpDashPageSignUpLink.isVisible();}

    //sign up section
    public boolean isLoginSignUpDashPageSignUpSectionTitleVisible() {return loginSignUpDashPageSignUpSectionTitle.isVisible();}
    //input form
    public boolean isLoginSignUpDashPageSignUpFullNameSubtextVisible() {return loginSignUpDashPageSignUpFullNameSubtext.isVisible();}
    public boolean isLoginSignUpDashPageSignUpFullNameInputFieldVisible() {return loginSignUpDashPageSignUpFullNameInputField.isVisible();}
    public boolean isLoginSignUpDashPageSignUpEmailSubtextVisible() {return loginSignUpDashPageSignUpEmailSubtext.isVisible();}
    public boolean isLoginSignUpDashPageSignUpEmailInputFieldVisible() {return loginSignUpDashPageSignUpEmailInputField.isVisible();}
    public boolean isLoginSignUpDashPageSignUpPasswordSubtextVisible() {return loginSignUpDashPageSignUpPasswordSubtext.isVisible();}
    public boolean isLoginSignUpDashPageSignUpPasswordInputFieldVisible() {return loginSignUpDashPageSignUpPasswordInputField.isVisible();}
    public boolean isLoginSignUpDashPageSignUpViewPasswordButtonVisible() {return loginSignUpDashPageSignUpViewPasswordButton.isVisible();}
    public boolean isLoginSignUpDashPageSignUpButtonVisible() {return loginSignUpDashPageSignUpButton.isVisible();}
    public boolean isLoginSignUpDashPageSignInTextVisible() {return loginSignUpDashPageSignInText.isVisible();}
    public boolean isLoginSignUpDashPageSignInLinkVisible() {return loginSignUpDashPageSignInLink.isVisible();}
}
