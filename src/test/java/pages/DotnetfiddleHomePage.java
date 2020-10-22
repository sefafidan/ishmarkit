package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class DotnetfiddleHomePage {
    public DotnetfiddleHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="run-button")
    public WebElement runButton;

    @FindBy(id="output")
    public WebElement outputText;

    @FindBy(id="save-button")
    public WebElement saveButton;

    @FindBy(id="login-modal-label")
    public WebElement loginScreen;

    public void navigateToHomePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("ihs_url"));
    }

}
