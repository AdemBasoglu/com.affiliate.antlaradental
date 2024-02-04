package stepdefinitions.US_03;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0309_Facebook {

    HomePage homePage = new HomePage();

    @Given("The user click to Facebook icon and goes to directed to the relevant page.")
    public void the_user_click_to_facebook_icon_and_goes_to_directed_to_the_relevant_page() {
        ReusableMethods.jsScrollBy(3);
        ReusableMethods.wait(3);
        homePage.facebookIcon.click();
    }

    @Given("The user verifies that the page title contains Facebook")
    public void the_user_verifies_that_the_page_title_contains_facebook() {
        String targetTitle = "Facebook";
        ReusableMethods.switchToWindow(targetTitle);
        ReusableMethods.wait(2);
        homePage.facebookAcceptCookies.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Facebook"));
    }
}
