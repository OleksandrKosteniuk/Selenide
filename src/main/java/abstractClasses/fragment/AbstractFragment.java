package abstractClasses.fragment;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverWaiter;

import java.util.List;

import static driver.DriverManager.getDriver;

public abstract class AbstractFragment extends WebDriverWaiter {

    private WebElement rootElement;

    public AbstractFragment() {
        PageFactory.initElements(getDriver(), this);
    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getRootElement() {
        return rootElement;
    }
    
    public Select newSelect (By by){
        return new Select(DriverManager.getDriver().findElement(by));
    } 
    
    public void selectByVisibleText(By by, String text){
        newSelect(by).selectByVisibleText(text);
    }

    public WebElement findElement(By by){
        return DriverManager.getDriver().findElement(by);
    }

    public List<WebElement> findElements(By by){
        return DriverManager.getDriver().findElements(by);
    }
    
    
}
