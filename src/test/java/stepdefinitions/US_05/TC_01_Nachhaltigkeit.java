package stepdefinitions.US_05;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.JSUtils;

public class TC_01_Nachhaltigkeit {
    HomePage homePage = new HomePage();
    ReusableMethods reusableMethods;

    @Then("The user clicks on the Nachhaltigkeit link")
    public void the_user_clicks_on_the_nachhaltigkeit_link() {
        homePage.Nachhaltigkeit.click();
        reusableMethods.wait(5);

    }
    @Then("The page should have the title  “Nachhaltige Unternehmensführung”.")
    public void the_page_should_have_the_title_nachhaltige_unternehmensführung() {
        JSUtils.scrollIntoViewJS(homePage.NUnternehmensführung);
        Assert.assertTrue(homePage.NUnternehmensführung.isDisplayed());
    }
    @Then("Close app")
    public void close_app() {

        Driver.getDriver().quit();
    }
}
