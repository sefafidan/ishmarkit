package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DotnetfiddleHomePage;
import utilities.TestBase;

public class ihs_test2_step_definitions extends TestBase {

    DotnetfiddleHomePage homePage=new DotnetfiddleHomePage();

    @When("I click on Save button")
    public void i_click_on_Save_button()  {
        homePage.saveButton.click();
    }
    @Then("verify that the Log in window appeared")
    public void verify_that_the_Log_in_window_appeared() {
        TestBase.waitForVisibility(homePage.loginScreen,20);
       boolean isLoginWindowAppeared= homePage.loginScreen.isDisplayed();
       Assert.assertTrue(isLoginWindowAppeared);
    }
}
