package managers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    // Get ExtentReports instance
    public static ExtentReports getExtentReports() {
        if (extent == null) {
            ExtentSparkReporter htmlReporter = new ExtentSparkReporter("target/ExtentReports.html");
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
        }
        return extent;
    }

    // Create a new test instance
    public static ExtentTest createTest(String testName) {
        ExtentTest extentTest = getExtentReports().createTest(testName);
        test.set(extentTest);  // Set the test for the current thread
        return extentTest;
    }

    // Get current test for the current thread
    public static ExtentTest getTest() {
        return test.get();
    }

    // Mark the test as failed
    public static void failTest(String message) {
        getTest().fail(message);
    }

    // Mark the test as passed
    public static void passTest(String message) {
        getTest().pass(message);
    }

    // Log information to the current test
    public static void infoTest(String message) {
        getTest().info(message);
    }

    // Flush the reports after the test is finished
    public static void flush() {
        if (extent != null) {
            extent.flush();
        }
    }
}
