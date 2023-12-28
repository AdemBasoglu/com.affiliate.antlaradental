package stepdefinitions.US_05;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.JSUtils;

public class TC_02_Nachhaltigkeit {
    HomePage homePage = new HomePage();


    @Then("The page should have the title  “Ausgezeichnetes Engagement”.")
    public void the_page_should_have_the_title_ausgezeichnetes_engagement() {
        JSUtils.scrollIntoViewJS(homePage.Ausgezeichnetes);
        Assert.assertTrue(homePage.Ausgezeichnetes.isDisplayed());
    }

}
