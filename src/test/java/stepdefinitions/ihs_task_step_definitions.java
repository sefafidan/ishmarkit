package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DotnetfiddleHomePage;

public class ihs_task_step_definitions {

    //Creating homepage object
    DotnetfiddleHomePage homePage=new DotnetfiddleHomePage();

    @Given("user navigates to dotnetfiddle page")
    public void user_navigates_to_dotnetfiddle_page() {
        homePage.navigateToHomePage();
    }

    @Given("user clicks on Run button")
    public void user_clicks_on_button() {
        homePage.runButton.click();

    }

    @Then("verify the output window text is {string}")
    public void verify_the_output_window_text_is(String expectedOutputText) {
        String actualOutputText=homePage.outputText.getText();
        Assert.assertEquals(actualOutputText,expectedOutputText);
        System.out.println("Actual Text: " +actualOutputText);
    }


}
