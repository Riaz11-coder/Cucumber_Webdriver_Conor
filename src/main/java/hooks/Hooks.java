package hooks;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import managers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before
    public void setUp() {
        DriverManager.getDriver().manage().window().maximize();

    }

    @AfterStep
    public void takeScreenshot(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) DriverManager.getDriver();
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",screenshot.toString());
        }
    }

    @After
    public void tearDown() {
        DriverManager.removeDriver();
        //ExtentReportManager.flush();
    }
}
