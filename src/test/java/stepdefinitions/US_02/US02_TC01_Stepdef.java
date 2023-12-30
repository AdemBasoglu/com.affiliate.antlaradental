package stepdefinitions.US_02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US02_TC01_Stepdef {
    HomePage homePage = new HomePage();
    @Given("Der Benutzer geht zur Website")
    public void derBenutzerGehtZurWebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @And("Der Benutzer wartet {int} sekunden")
    public void derBenutzerWartetSekunden(int sekunden) {
        ReusableMethods.wait(sekunden);
    }

    @And("Der Benutzer sucht nach {string} im SearchBox")
    public void derBenutzerSuchtNachImSearchBox(String etwas) {
        homePage.searchBox.sendKeys(etwas, Keys.ENTER);
    }

    @Then("Überprüft, ob die Seitenuberschrift {string} enthält")
    public void überprüftObDieSeitenuberschriftEnthält(String etwas) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(etwas));
    }

    @And("Der Benutzer schließt die Webseite")
    public void derBenutzerSchließtDieWebseite() {
        Driver.closeDriver();
    }

    @When("Cookies werden angeklickt.")
    public void cookiesWerdenAngeklickt() {
        homePage.gehtKlarButton.click();
    }
}
