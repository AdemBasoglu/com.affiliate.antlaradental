package stepdefinitions.US_03;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import javax.swing.*;

public class TC0311_Twitter {

    HomePage homePage = new HomePage();
    @Given("The user click to Twitter icon and goes to directed to the relevant page.")
    public void the_user_click_to_twitter_icon_and_goes_to_directed_to_the_relevant_page() {
        ReusableMethods.actionPageDown();
        ReusableMethods.wait(1);
        homePage.twitterIcon.click();
    }


    @And("The user verifies that the Twitter page title")
    public void theUserVerifiesThatTheTwitterPageTitle() {
        String targetTitle = "X. It’s what’s happening / X";
        ReusableMethods.wait(15);
        ReusableMethods.switchToWindow(targetTitle);
        ReusableMethods.wait(15);
        homePage.twitterSignupPopClose.click();
        ReusableMethods.wait(15);
        homePage.twitteracceptCookies.click();
        ReusableMethods.wait(15);
        Assert.assertEquals(targetTitle,Driver.getDriver().getTitle());
    }
}
