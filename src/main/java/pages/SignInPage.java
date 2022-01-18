package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@href='https://fixer.com.ua/login/google']")
    private WebElement signInWithGoogleButton;

    @FindBy(xpath = "//*[@href='https://fixer.com.ua/login/facebook']")
    private WebElement signInWithFacebookButton;

    @FindBy(xpath = "//input[@name='auth_login']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='auth_password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@class='btn btn-primary w-100']")
    private WebElement submitSignInButton;

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    private WebElement errorMessage;

    public WebElement getErrorMessage(){
        return errorMessage;
    }
    public boolean isErrorMessageVisible(){
        return errorMessage.isDisplayed();
    }

    public boolean isSignInWithGoogleButtonVisible(){
        return signInWithGoogleButton.isDisplayed();
    }

    public boolean isSignInWithFacebookButtonVisible(){
        return signInWithFacebookButton.isDisplayed();
    }

    public boolean isEmailFieldVisible(){
        return emailField.isDisplayed();
    }
    public boolean isPasswordFieldVisible(){
        return passwordField.isDisplayed();
    }

    public boolean isSubmitSignInButtonVisible(){
        return submitSignInButton.isDisplayed();
    }

    public void clickSubmitSignInButton(){
        submitSignInButton.click();
    }






}
