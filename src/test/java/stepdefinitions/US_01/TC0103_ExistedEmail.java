package stepdefinitions.US_01;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.Driver;

import static utilities.Driver.driver;


public class TC0103_ExistedEmail {
    RegisterPage registerPage = new RegisterPage();


    @When("The user sees the text CHECK24 Kundenkonto anlegen,user enters her or his invalid e-mail address in the input field")
    public void theUserSeesTheTextCHECK24KundenkontoAnlegenUserEntersHerOrHisInvalidEMailAddressInTheInputField() {
        driver.switchTo().frame(registerPage.emailIframe);
        registerPage.emailBox.sendKeys("a@s.com");
    }

    @Then("The should be enabled the anmelden button on the page.")
    public void theShouldBeEnabledTheAnmeldenButtonOnThePage() {
        Assert.assertTrue(registerPage.anmeldenButton.isEnabled());
        Driver.closeDriver();
    }
}
