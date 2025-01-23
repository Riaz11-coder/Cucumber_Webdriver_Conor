package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyReader;

public class GoogleHomePage {

    private WebDriver driver;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchBox = By.name("q");
    private By searchButton = By.name("btnK");

    public void navigateToHomePage() {
        driver.get(PropertyReader.getProperty("google.homepage.url"));
    }

    public void enterSearchQuery(String query) {
        driver.findElement(searchBox).sendKeys(query);
    }

    public void submitSearch() {
        driver.findElement(searchBox).submit();
    }

    public String getFirstResultTitle() {
        WebElement firstResult = driver.findElement(By.cssSelector("h3"));
        return firstResult.getText();
    }
}
