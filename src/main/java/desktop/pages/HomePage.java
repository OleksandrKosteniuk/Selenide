package desktop.pages;

import abstractClasses.fragment.AbstractFragment;
import abstractClasses.page.AbstractPage;
import driver.DriverManager;

public class HomePage extends AbstractPage {
    private static final String HOME_PAGE_URL = "https://www.bookdepository.com/";
    
    public String getPageUrl() {
        return HOME_PAGE_URL;
    }
}
