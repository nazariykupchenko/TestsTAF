package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "d-flex justify-content-center")
    private WebElement totalValueField;

    @FindBy(xpath = "//*[@class='btn btn-primary mx-2']")
    private WebElement submitOrderButton;

    @FindBy(xpath = "//*[@class='payment order-form-group valid p-3 col-12 col-md-4']")
    private WebElement paymentOrderForm;

    @FindBy(xpath = "//*[@class='contact order-form-group valid p-3 col-12 col-md-4']")
    private WebElement contactOrderForm;

    @FindBy(xpath = "//form[@action='https://fixer.com.ua/cart']/div/h3")
    private WebElement orderingNumberField;

    public WebElement getTotalValueField(){
        return totalValueField;

    }

    public boolean isTotalValueFieldVisible(){
        return totalValueField.isDisplayed();
    }



    public boolean isSubmitOrderButtonVisible(){
        return submitOrderButton.isDisplayed();
    }


    public boolean isPaymentOrderFormVisible(){
        return paymentOrderForm.isDisplayed();
    }
    public boolean isContactOrderFormVisible(){
        return contactOrderForm.isDisplayed();
    }

    public boolean isOrderingNumberFieldVisible(){
        return orderingNumberField.isDisplayed();
    }




}
