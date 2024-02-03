package stepdefinitions.US_01;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.ReusableMethods;

public class TC0102_Clickability {
    HomePage homePage=new HomePage();


    @Given("The user should be verify that About Us, Dashboard, Login, Signup titles and Antlara Dental logo are clickable")
    public void the_user_should_be_verify_that_about_us_dashboard_login_signup_titles_and_antlara_dental_logo_are_clickable() {
        Assert.assertTrue(homePage.aboutUsLink.isEnabled());
        Assert.assertTrue(homePage.dashboardLink.isEnabled());
        Assert.assertTrue(homePage.loginLink.isEnabled());
        Assert.assertTrue(homePage.signupLink.isEnabled());
        Assert.assertTrue(homePage.antlaraDentalLogo.isEnabled());
    }
    @Given("The user should be verify that How it Works, Privacy Policy,Contact Us Links are clickable")
    public void the_user_should_be_verify_that_how_it_works_privacy_policy_contact_us_links_are_clickable() {
        ReusableMethods.jsScrollBy(3);
        ReusableMethods.waitForVisibility(homePage.howItWorksLink,3);
        Assert.assertTrue(homePage.howItWorksLink.isEnabled());
        Assert.assertTrue(homePage.privacyPolicyLink.isEnabled());
        Assert.assertTrue(homePage.contactUsLink.isEnabled());

    }
    @Then("The user should be verify that Facebook,Instagram, Twitter, LinkedIn,Youtube icons and Antlara Dental logo are clickable")
    public void the_user_should_be_verify_that_facebook_instagram_twitter_linked_in_youtube_icons_and_antlara_dental_logo_are_clickable() {
        Assert.assertTrue(homePage.facebookIcon.isEnabled());
        Assert.assertTrue(homePage.instagramIcon.isEnabled());
        Assert.assertTrue(homePage.twitterIcon.isEnabled());
        Assert.assertTrue(homePage.linkedInIcon.isEnabled());
        Assert.assertTrue(homePage.youtubeIcon.isEnabled());

    }

}
