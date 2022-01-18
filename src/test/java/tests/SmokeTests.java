package tests;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SmokeTests extends BaseTest{

    private static final long DEFAULT_WAITING_TIME = 90;


    @Test
    public void checkMainComponentsOnHomePage(){
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        assertTrue(getHomePage().isLogoVisible());
        assertTrue(getHomePage().isCartIconVisible());
        assertTrue(getHomePage().isSignInButtonVisible());
        assertTrue(getHomePage().isSearchFieldVisible());
        assertTrue(getHomePage().isCartIconVisible());
        assertTrue(getHomePage().isWishIconVisible());

    }

    @Test
    public void checkSignInPage(){

        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickSignInButton();
        getSignInPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        assertTrue(getSignInPage().isEmailFieldVisible());
        assertTrue(getSignInPage().isPasswordFieldVisible());
        assertTrue(getSignInPage().isSignInWithFacebookButtonVisible());
        assertTrue(getSignInPage().isSignInWithGoogleButtonVisible());
        assertTrue(getSignInPage().isSubmitSignInButtonVisible());
        getSignInPage().clickSubmitSignInButton();
        getSignInPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getSignInPage().getErrorMessage());
        assertTrue(getSignInPage().isErrorMessageVisible());

    }

    @Test
    public void checkCartPage(){
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickCartIcon();
        getCartPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getCartPage().getTotalValueField());
        getCartPage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        assertTrue(getCartPage().isContactOrderFormVisible());
        assertTrue(getCartPage().isPaymentOrderFormVisible());
        assertTrue(getCartPage().isOrderingNumberFieldVisible());
        assertTrue(getCartPage().isSubmitOrderButtonVisible());
        assertTrue(getCartPage().isTotalValueFieldVisible());

    }

}
