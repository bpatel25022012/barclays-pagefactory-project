package uk.co.barclays.cucumber.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.LoginPage;

/**
 * Created By Bhavesh
 */
public class LoginSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginButton();
    }

    @Then("^I should navigate to page successfully$")
    public void iShouldNavigateToPageSuccessfully() {
        Assert.assertEquals(new LoginPage().getWelcomeText(), "Quick, safe and convenient");
    }


    @And("^I enter surname \"([^\"]*)\"$")
    public void iEnterSurname(String surname)  {
        new LoginPage().enterSurname(surname);

    }

    @And("^I click on next step$")
    public void iClickOnNextStep() {
        new LoginPage().clickOnNextStepBtn();
    }

    @Then("^I should see the error Message$")
    public void iShouldSeeTheErrorMessage() {
        Assert.assertEquals(new LoginPage().getErrorMessage(),"You must enter a membership number");
    }
}
