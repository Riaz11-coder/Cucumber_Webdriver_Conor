package managers;

import org.openqa.selenium.WebDriver;
import pages.GoogleHomePage;
import pages.PracticeHomePage;

public class PageObjectManager {

    private WebDriver driver;
    private GoogleHomePage googleHomePage;
    private PracticeHomePage practiceHomePage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public GoogleHomePage getGoogleHomePage() {
        if (googleHomePage == null) {
            googleHomePage = new GoogleHomePage(driver);
        }
        return googleHomePage;
    }

    public PracticeHomePage getPracticeHomePage() {
        if (practiceHomePage == null) {
            practiceHomePage = new PracticeHomePage(driver);
        }
        return practiceHomePage;
    }
}
