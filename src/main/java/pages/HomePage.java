package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By searchIcon = By.cssSelector(".search-toggle");
    private By searchInput = By.cssSelector("input[type='search']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSearch() {
        driver.findElement(searchIcon).click();
    }

    public void search(String term) {
        driver.findElement(searchInput).sendKeys(term + Keys.ENTER);
    }
}