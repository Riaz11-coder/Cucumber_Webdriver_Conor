package hooks;

import com.aventstack.extentreports.ExtentTest;
import managers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.ExtentReportManager;

public class Hooks {

    private static ExtentTest test;

    @Before
    public void setUp() {
        DriverManager.getDriver().manage().window().maximize();
        test = ExtentReportManager.createTest("Cucumber Test");
    }

    @After
    public void tearDown() {
        DriverManager.removeDriver();
        ExtentReportManager.flush();
    }
}
