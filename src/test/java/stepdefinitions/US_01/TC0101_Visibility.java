package stepdefinitions.US_01;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TC0101_Visibility {
    HomePage homePage = new HomePage();


    @Given("The user goes to home page")
    public void theUserGoesToHomePage() {
        ReusableMethods.waitForPageToLoad(3);
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @Given("The user should be verify that About Us, Dashboard, Login, Signup titles and Antlara Dental logo are visible")
    public void the_user_should_be_verify_that_about_us_dashboard_login_signup_titles_and_antlara_dental_logo_are_visible() {
        Assert.assertTrue(homePage.aboutUsLink.isDisplayed());
        Assert.assertTrue(homePage.dashboardLink.isDisplayed());
        Assert.assertTrue(homePage.loginLink.isDisplayed());
        Assert.assertTrue(homePage.signupLink.isDisplayed());
        Assert.assertTrue(homePage.antlaraDentalLogo.isDisplayed());
    }
    @Given("The user should be verify that How it Works, Privacy Policy,Contact Us Links are visible")
    public void the_user_should_be_verify_that_how_it_works_privacy_policy_contact_us_links_are_visible() {
        ReusableMethods.jsScrollBy(3);
        ReusableMethods.waitForVisibility(homePage.howItWorksLink,3);
        Assert.assertTrue(homePage.howItWorksLink.isDisplayed());
        Assert.assertTrue(homePage.privacyPolicyLink.isDisplayed());
        Assert.assertTrue(homePage.contactUsLink.isDisplayed());

    }
    @Then("The user should be verify that Facebook,Instagram, Twitter, LinkedIn,Youtube icons and Antlara Dental logo are visible")
    public void the_user_should_be_verify_that_facebook_instagram_twitter_linked_in_youtube_icons_and_antlara_dental_logo_are_visible() {
       Assert.assertTrue(homePage.facebookIcon.isDisplayed());
       Assert.assertTrue(homePage.instagramIcon.isDisplayed());
       Assert.assertTrue(homePage.twitterIcon.isDisplayed());
       Assert.assertTrue(homePage.linkedInIcon.isDisplayed());
       Assert.assertTrue(homePage.youtubeIcon.isDisplayed());

    }
    @Then("The user close window")
    public void the_user_close_window() {
        Driver.closeDriver();
    }


}
