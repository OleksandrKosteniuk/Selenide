package desktop.pages;

import abstractClasses.fragment.AbstractFragment;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CheckoutForGuestPage extends AbstractFragment {
    private static final String CHECKOUT_FOR_GUEST_PAGE_URL = "https://www.bookdepository.com/checkout/guest";
    //Buttons on the Checkout page for Guest
    private static final By BUY_NOW_BUTTON = By.xpath("//*[@id='paymentButtons']");
    private static final By CONTINUE_TO_PAYMENT_BUTTON = By.xpath("");
    //Error messages in the Delivery Address area the Checkout page for Guest
    private static final By EMAIL_ADDRESS_ERROR_MESSAGE = By.xpath("(//*[@class='error-block'])[1]");
    private static final By FULL_NAME_ERROR_MESSAGE = By.xpath("(//*[@class='error-block'])[2]");
    private static final By ADDRESS_LINE_1_ERROR_MESSAGE = By.xpath("(//*[@class='error-block'])[3]");
    private static final By TOWN_CITY_ERROR_MESSAGE = By.xpath("(//*[@class='error-block'])[5]");
    private static final By POSCODE_ZIP_ERROR_MESSAGE = By.xpath("(//*[@class='error-block'])[7]");
    //Input fields in the Delivery Address area the Checkout page for Guest
    private static final By EMAIL_ADDRESS_INPUT_FIELD = By.xpath("//*[@name='emailAddress']");
    private static final By FULL_NAME_INPUT_FIELD = By.xpath("//*[@name='delivery-fullName']");
    private static final By ADDRESS_LINE_1_INPUT_FIELD = By.xpath("//*[@name='delivery-addressLine1']");
    private static final By TOWN_CITY_INPUT_FIELD = By.xpath("//*[@name='delivery-city']");
    private static final By POSCODE_ZIP_INPUT_FIELD = By.xpath("//*[@name='delivery-postCode']");
    //Expected messages in the Delivery Address area the Checkout page for Guest
    private static final String EMAIL_ADDRESS_EXPECTED_ERROR_MESSAGE = "Please enter your email address";
    private static final String FULL_NAME_EXPECTED_ERROR_MESSAGE = "Please enter a first and last name";
    private static final String ADDRESS_LINE_1_EXPECTED_ERROR_MESSAGE = "Please enter your address line 1";
    private static final String TOWN_CITY_EXPECTED_ERROR_MESSAGE = "Please enter your town/city";
    private static final String POSCODE_ZIP_EXPECTED_ERROR_MESSAGE = "Please enter your postcode/ZIP or write 'No Postcode'";



    //Input fields in the Payment area on the Checkout page for Guest
    private static final By CARD_TYPE_INPUT_FIELD = By.xpath("//*[@name='emailAddress']");
    
    
    
    //Expected error messages in the Payment area on the Checkout page for Guest
    private static final String CARD_NUMBER_EXPECTED_ERROR_MESSAGE = "Your card number is not valid.";
    private static final String NAME_ON_CARD_EXPECTED_ERROR_MESSAGE = "Invalid";
    private static final String CVV2_NUMBER_EXPECTED_ERROR_MESSAGE = "Invalid";
        
    //Selectors in the Payment area on the Checkout page for Guest
    Select cardTypeSelect = new Select(DriverManager.getDriver().findElement(By.xpath("//*[@id='brandSelected']")));
    Select monthOfTheVisaSelect = new Select(DriverManager.getDriver().findElement(By.xpath("//*[@id='visacardValidToMonth']")));
    Select yearOfTheVisaSelect = new Select(DriverManager.getDriver().findElement(By.xpath("//*[@id='visacardValidToYear']")));
    Select monthOfTheMasterCardSelect = new Select(DriverManager.getDriver().findElement(By.xpath("//*[@id='mastercardValidToMonth']")));
    Select yearOfTheMasterSelect = new Select(DriverManager.getDriver().findElement(By.xpath("//*[@id='mastercardValidToYear']")));
    Select monthOfTheAmericanExpressSelect = new Select(DriverManager.getDriver().findElement(By.xpath("//*[@id='amexcardValidToMonth']")));
    Select yearOfTheAmericanExpressSelect = new Select(DriverManager.getDriver().findElement(By.xpath("//*[@id='amexcardValidToYear']")));
    Select monthOfTheMaestroSelect = new Select(DriverManager.getDriver().findElement(By.xpath("//*[@id='maestrocardValidToMonth']")));
    Select yearOfTheMaestroSelect = new Select(DriverManager.getDriver().findElement(By.xpath("//*[@id='maestrocardValidToYear']")));
        
    public String getPageUrl() {
        return CHECKOUT_FOR_GUEST_PAGE_URL;
    }

    public void clickOnThePayNowButton(){
        findElement(BUY_NOW_BUTTON).click();
    }

    




}
