package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    private WebDriver driver;

    @FindBy(css = "article")
    private List<WebElement> results;

    @FindBy(xpath = "//*[contains(text(),'Nenhum resultado')]")
    private WebElement noResultsMessage;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean hasResults() {
        return results.size() > 0;
    }

    public boolean hasNoResultsMessage() {
        return noResultsMessage.isDisplayed();
    }
}