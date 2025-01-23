package context;

import managers.DriverManager;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class TestContext {
    private WebDriver driver;
    private PageObjectManager pageObjectManager;
    private ScenarioContext scenarioContext;

    public TestContext() {
        driver = DriverManager.getDriver(); // Your WebDriver setup
        pageObjectManager = new PageObjectManager(driver);
        scenarioContext = new ScenarioContext();
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
