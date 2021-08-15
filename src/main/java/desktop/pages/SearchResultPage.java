package desktop.pages;

import abstractClasses.fragment.AbstractFragment;
import abstractClasses.page.AbstractPage;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultPage extends AbstractFragment {
    private static final String SEARCH_RESULT_PAGE_URL = "https://www.bookdepository.com/search";
    private static final By BOOK_TITLE = By.xpath("//*[@class='title']");
    private static final By ADD_TO_BASKET_BUTTON = By.xpath("//*[@class='btn btn-sm btn-primary add-to-basket']");
    private static final By PRICE_RANGE_REFINEMENT_FILTER = By.xpath("//*[@id='filterPrice']");
    private static final By AVAILABILITY_REFINEMENT_FILTER = By.xpath("//*[@id='filterAvailability']");
    private static final By LANGUAGE_REFINEMENT_FILTER = By.xpath("//*[@id='filterLang']");
    private static final By FORMAT_REFINEMENT_FILTER = By.xpath("//*[@id='filterFormat']");
    private static final String PRICE_RANGE = "Price Range";
    private static final String AVAILABILITY = "Availability";
    private static final String LANGUAGE = "Language";
    private static final String FORMAT = "Format";
    
    public String getPageUrl() {
        return SEARCH_RESULT_PAGE_URL;
    }
       
    public List<String> findBookTitlesByXpath(){
        return findElements(BOOK_TITLE).stream().map(WebElement::getText).collect(Collectors.toList()); 
    }
        
    public boolean isBooksArePresentOnTheSearchResultPage(List<String> expectedBookTitles, List<String> actualBookTitles){
        for (String expectedBookTitle: expectedBookTitles){
            for (String actualBookTitle: actualBookTitles){
                if (expectedBookTitle.matches(actualBookTitle)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean areOnlyExpectedBookTitlesDisplayedOnTheSearchResultPage(List<String> expectedBookTitles, List<String> actualBookTitles){
        Collections.sort(expectedBookTitles);
        Collections.sort(actualBookTitles);
        return expectedBookTitles.equals(actualBookTitles);
    }
    
    
    public void setPriceRefinementFilter (String priceRefinementFilter){
        selectByVisibleText(PRICE_RANGE_REFINEMENT_FILTER,priceRefinementFilter);
    }

    public void setAvailabilityRefinementFilter (String availabilityRefinementFilter){
        selectByVisibleText(AVAILABILITY_REFINEMENT_FILTER,availabilityRefinementFilter);
    }
    
    public void setLanguageRefinementFilter (String languageRefinementSelector){
        selectByVisibleText(LANGUAGE_REFINEMENT_FILTER,languageRefinementSelector);
    }

    public void setFormateRefinementFilter (String formatRefinementSelector){
        selectByVisibleText(FORMAT_REFINEMENT_FILTER,formatRefinementSelector);
    }

    public void selectRefinementFilters (Map<String, String> refinementFilters){
        setPriceRefinementFilter(refinementFilters.get(PRICE_RANGE));
        setAvailabilityRefinementFilter(refinementFilters.get(AVAILABILITY));
        setLanguageRefinementFilter(refinementFilters.get(LANGUAGE));
        setFormateRefinementFilter(refinementFilters.get(FORMAT));
    }
}
