package stepdefinitions.US_01;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.Driver;


public class TC0104_LongPassword {
    Faker faker = new Faker();
    RegisterPage registerPage = new RegisterPage();


    @And("The user enters a password in the Passwort field that longer than 50 number.")
    public void theUserEntersAPasswordInThePasswortFieldThatLongerThan50Number() {
        registerPage.passwort.sendKeys("3749058326482390171564902837465123085912746308251693470347589126743018258392764015");

    }

    @Then("The should be sees the text on the page Achtung! Die Grenze von {int} Zeichen wurde erreicht!")
    public void theShouldBeSeesTheTextOnThePageAchtungDieGrenzeVonZeichenWurdeErreicht(int arg0) {
        String expectedText = "Achtung! Die Grenze von 50 Zeichen wurde erreicht!";
        Assert.assertEquals(expectedText, registerPage.longPasswordText.getText());
        Driver.closeDriver();
    }
}
