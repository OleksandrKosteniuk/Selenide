package desktop.pages;

import abstractClasses.fragment.AbstractFragment;
import org.openqa.selenium.By;

public class BasketPage extends AbstractFragment {
    private static final String BASKET_PAGE_URL = "https://www.bookdepository.com/basket";
    private static final By DELIVERY_COST_IN_THE_ORDER_SUMMARY = By.xpath("//*[@class='delivery-text']/dd");
    private static final By TOTAL_IN_THE_ORDER_SUMMARY = By.xpath("//*[@class='total']/dd");
    private static final By CHECKOUT_BUTTON = By.xpath("(//*[@href='/payments/checkout'])[1]");
    //Keys for Summary component
    private static final String DELIVERY_COST_TITLE_IN_THE_ORDER_SUMMARY = "Delivery cost";
    private static final String TOTAL_TITLE_THE_ORDER_SUMMARY = "Total";
    
    public String getPageUrl() {
        return BASKET_PAGE_URL;
    }
    
    public String getDeliveryCostKeyOfTheSummaryComponent(){
        return DELIVERY_COST_TITLE_IN_THE_ORDER_SUMMARY;
    }

    public String getTotalKeyOfTheSummaryComponent(){
        return TOTAL_TITLE_THE_ORDER_SUMMARY;
    }
    
    public String getValueByDeliveryCostKeyOfTheSummaryComponent(){
        return findElement(DELIVERY_COST_IN_THE_ORDER_SUMMARY).getText();
    }

    public String getValueByTotalKeyOfTheSummaryComponent(){
        return findElement(TOTAL_IN_THE_ORDER_SUMMARY).getText();
    }
    
    public void clickOnTheCheckoutButton(){
        findElement(CHECKOUT_BUTTON).click();
    }
}
