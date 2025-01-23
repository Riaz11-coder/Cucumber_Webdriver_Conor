package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyReader;

public class PracticeHomePage {

    private WebDriver driver;

    public PracticeHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By registerLink = By.linkText("Register");
    private By forgotPasswordLink = By.linkText("Forgot password?");

    // Navigation Menu Items
    private By notesLink = By.linkText("Notes");
    private By fileUploadLink = By.linkText("File Upload");
    private By formValidationLink = By.linkText("Form Validation");
    private By dynamicTableLink = By.linkText("Dynamic Table");
    private By downloadLink = By.linkText("Download");
    private By dragAndDropLink = By.linkText("Drag and Drop");
    private By iframeLink = By.linkText("Iframe");
    private By toDoListLink = By.linkText("To Do List");
    private By jQueryUiMenuLink = By.linkText("JQuery UI Menu");
    private By modalDialogLink = By.linkText("Modal Dialog");
    private By progressBarLink = By.linkText("Progress Bar");
    private By toolTipLink = By.linkText("Tool Tip");
    private By datepickerLink = By.linkText("Datepicker");
    private By autoCompleteLink = By.linkText("Auto Complete");
    private By sortableListLink = By.linkText("Sortable List");
    private By apiCallsLink = By.linkText("API Calls");

    // Messages and Alerts
    private By errorMessage = By.className("alert-danger");
    private By successMessage = By.className("alert-success");

    // Navigation Methods
    public void navigateToHomePage() {
        driver.get(PropertyReader.getProperty("practice.homepage.url"));
    }

    // Login Methods
    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    // Navigation Link Methods
    public void clickRegisterLink() {
        driver.findElement(registerLink).click();
    }

    public void clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
    }

    public void clickNotesLink() {
        driver.findElement(notesLink).click();
    }

    public void clickFileUploadLink() {
        driver.findElement(fileUploadLink).click();
    }

    public void clickFormValidationLink() {
        driver.findElement(formValidationLink).click();
    }

    public void clickDynamicTableLink() {
        driver.findElement(dynamicTableLink).click();
    }

    public void clickDownloadLink() {
        driver.findElement(downloadLink).click();
    }

    public void clickDragAndDropLink() {
        driver.findElement(dragAndDropLink).click();
    }

    public void clickIframeLink() {
        driver.findElement(iframeLink).click();
    }

    public void clickToDoListLink() {
        driver.findElement(toDoListLink).click();
    }

    public void clickJQueryUiMenuLink() {
        driver.findElement(jQueryUiMenuLink).click();
    }

    public void clickModalDialogLink() {
        driver.findElement(modalDialogLink).click();
    }

    public void clickProgressBarLink() {
        driver.findElement(progressBarLink).click();
    }

    public void clickToolTipLink() {
        driver.findElement(toolTipLink).click();
    }

    public void clickDatepickerLink() {
        driver.findElement(datepickerLink).click();
    }

    public void clickAutoCompleteLink() {
        driver.findElement(autoCompleteLink).click();
    }

    public void clickSortableListLink() {
        driver.findElement(sortableListLink).click();
    }

    public void clickApiCallsLink() {
        driver.findElement(apiCallsLink).click();
    }

    // Verification Methods
    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }

    public boolean isLoginButtonDisplayed() {
        return driver.findElement(loginButton).isDisplayed();
    }

    public boolean isEmailInputDisplayed() {
        return driver.findElement(emailInput).isDisplayed();
    }

    // Helper Methods
    public void clearLoginFields() {
        driver.findElement(emailInput).clear();
        driver.findElement(passwordInput).clear();
    }
}
