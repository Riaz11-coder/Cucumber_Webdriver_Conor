package steps;

import context.ScenarioContext;
import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.picocontainer.annotations.Inject;
import pages.GoogleHomePage;
import utils.PropertyReader;


public class GoogleHomePageSteps {
    private GoogleHomePage googleHomePage;
    private ScenarioContext scenarioContext;

    public GoogleHomePageSteps(TestContext testContext) {
        this.googleHomePage = testContext.getPageObjectManager().getGoogleHomePage();
        this.scenarioContext = testContext.getScenarioContext();
    }

    @Given("I am on the Google homepage")
    public void i_am_on_the_google_homepage() {
        googleHomePage.navigateToHomePage();
    }

    @When("I search for {string}")
    public void i_search_for(String query) {
        googleHomePage.enterSearchQuery(query);
        googleHomePage.submitSearch();
        scenarioContext.setContext("SEARCH_QUERY", query);
    }

    @Then("I should see results related to {string}")
    public void i_should_see_results_related_to(String expected) {
        String actualQuery = (String) scenarioContext.getContext("SEARCH_QUERY");
        String firstResult = googleHomePage.getFirstResultTitle();
        Assertions.assertTrue(firstResult.toLowerCase().contains(expected.toLowerCase()),
                "Expected query: " + expected + ", but found: " + actualQuery);
    }
}
