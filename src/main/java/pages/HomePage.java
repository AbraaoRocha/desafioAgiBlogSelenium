package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(css = ".search-toggle")
    private WebElement searchIcon;

    @FindBy(css = "input[type='search']")
    private WebElement searchInput;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openSearch() {
        searchIcon.click();
    }

    public void search(String term) {
        searchInput.sendKeys(term + Keys.ENTER);
    }
}