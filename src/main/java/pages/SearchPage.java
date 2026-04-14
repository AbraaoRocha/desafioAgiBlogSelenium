package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SearchPage {

    private WebDriver driver;

    private By results = By.cssSelector("article");
    private By noResults = By.xpath("//*[contains(text(),'Nenhum resultado')]");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean hasResults() {
        List<?> elements = driver.findElements(results);
        return elements.size() > 0;
    }

    public boolean hasNoResultsMessage() {
        return driver.findElements(noResults).size() > 0;
    }
}