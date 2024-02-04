package stepdefinitions.US_03;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0313_Youtube {

    HomePage homePage = new HomePage();
    @Given("The user click to Youtube icon and goes to directed to the relevant page.")
    public void the_user_click_to_youtube_icon_and_goes_to_directed_to_the_relevant_page() {
        ReusableMethods.actionPageDown();
        ReusableMethods.wait(1);
        homePage.youtubeIcon.click();
    }
    @Given("The user verifies that the Youtube page title")
    public void the_user_verifies_that_the_youtube_page_title() {
        String targetTitle = "Before you continue to YouTube";
        ReusableMethods.wait(5);
        ReusableMethods.switchToWindow(targetTitle);
        Assert.assertEquals(targetTitle, Driver.getDriver().getTitle());
    }
}
