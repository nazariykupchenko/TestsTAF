package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class = 'logo']")
    private WebElement logo;

    @FindBy(xpath = "//*[span='Увійти']")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@href='https://fixer.com.ua/wishlist']")
    private WebElement wishIcon;

    @FindBy(xpath = "//*[@href='https://fixer.com.ua/cart']")
    private WebElement cartIcon;

    @FindBy(xpath = "//*[@id='q']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@class='search-button']")
    private WebElement searchButton;


    public boolean isLogoVisible() {
        return logo.isDisplayed();
    }

    public boolean isSignInButtonVisible(){
        return signInButton.isDisplayed();
    }

    public void clickSignInButton(){
        signInButton.click();
    }

    public boolean isSearchButtonVisible(){
        return searchButton.isDisplayed();
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public boolean isSearchFieldVisible(){
        return searchField.isDisplayed();
    }

    public void enterTextToSearchField(final String searchText){
        searchField.clear();
        searchField.sendKeys(searchText);
        clickSearchButton();

    }

    public boolean isCartIconVisible(){
        return cartIcon.isDisplayed();
    }

    public boolean isWishIconVisible(){
        return wishIcon.isDisplayed();
    }

    public void clickCartIcon(){
        cartIcon.click();
    }


}
