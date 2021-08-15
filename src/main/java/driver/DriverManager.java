package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import static driver.CapabilitiesHelper.getChromeOptions;


public class DriverManager {

    private static WebDriver instance;
    private static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
    private static final int IMPLICITLY_WAIT_TIMEOUT = 10;
    private static final int EXPLICITLY_WAIT_TIMEOUT = 10;
    private static final int PAGE_LOAD_TIMEOUT = 20;

    private DriverManager() {
    }

    static {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }
    
    public static void setupDriver() {
    }

    public static WebDriver getDriver() {
        if (instance == null) {
            instance = new ChromeDriver(getChromeOptions());
            instance.manage().window().maximize();
            instance.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_TIMEOUT, TimeUnit.SECONDS);
            instance.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        }
        return instance;
    }

    public static void quitDriver() {
        Optional.ofNullable(getDriver()).ifPresent(webDriver -> {
            webDriver.quit();
            webDriverThreadLocal.remove();
        });
    }
    
    
   WebDriverWait wait = new WebDriverWait(getDriver(),EXPLICITLY_WAIT_TIMEOUT);
    
}
