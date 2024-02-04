package stepdefinitions.US_03;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0310_Instagram {

    HomePage homePage = new HomePage();
    @Given("The user click to Instagram icon and goes to directed to the relevant page.")
    public void the_user_click_to_instagram_icon_and_goes_to_directed_to_the_relevant_page() {
        ReusableMethods.jsScrollBy(4);
        ReusableMethods.wait(3);
        homePage.instagramIcon.click();
    }



    @And("The user verifies that the instagram page title is Antlara Dental Affiliate")
    public void theUserVerifiesThatTheInstagramPageTitleIsAntlaraDentalAffiliate() {
        String targetTitle = "Antlara Dental Affiliate";
        ReusableMethods.switchToWindow(targetTitle);
        ReusableMethods.wait(2);
        Assert.assertEquals(targetTitle,Driver.getDriver().getTitle());
    }
}
