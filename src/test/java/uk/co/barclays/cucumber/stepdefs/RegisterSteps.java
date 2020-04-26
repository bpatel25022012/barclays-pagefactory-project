package uk.co.barclays.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.RegisterPage;

/**
 * Created By Bhavesh
 */
public class RegisterSteps {
    @When("^I click on Register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals(new RegisterPage().getWelcomeText(),"Register for Online Banking");
    }
    @And("^I click on start button$")
    public void iClickOnStartButton() {
        new RegisterPage().clickOnStartBtn();
    }

    @Then("^I should navigate to your details page successfully$")
    public void iShouldNavigateToYourDetailsPageSuccessfully() {
        Assert.assertEquals(new RegisterPage().getRegisterPageText(),"Your details");
    }

}
