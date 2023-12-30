package stepdefinitions.US_01;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.Driver;


public class TC0102_RegisterInvalid {
    Faker faker = new Faker();
    RegisterPage registerPage = new RegisterPage();

    @And("The user enters the different password again in the Passwort wiederholen field.")
    public void theUserEntersTheDifferentPasswordAgainInThePasswortWiederholenField() {
        registerPage.passwortWiederholen.sendKeys(faker.internet().password(8, 50));
    }

    @Then("The should be sees the text on the page Die Passwörter stimmen nicht überein")
    public void theShouldBeSeesTheTextOnThePageDiePassworterStimmenNichtUberein() {
        String expectedText = "Die Passwörter stimmen nicht überein";
        Assert.assertEquals(expectedText, registerPage.invalidPasswordText.getText());
        Driver.closeDriver();
    }


}
