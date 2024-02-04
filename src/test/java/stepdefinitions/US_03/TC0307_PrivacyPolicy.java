package stepdefinitions.US_03;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0307_PrivacyPolicy {

    HomePage homePage=new HomePage();

    public void the_user_verifies_that_the_page_title_is_antlara_referral_program_antlara_dental_affiliate() {

    }
    @Given("The user click to Privacy Policy link and goes to directed to the relevant page.")
    public void the_user_click_to_privacy_policy_link_and_goes_to_directed_to_the_relevant_page() {
        ReusableMethods.jsScrollBy(3);
        ReusableMethods.wait(3);
        homePage.privacyPolicyLink.click();
    }
    @Given("The user verifies that the page title is Privacy Policy – Antlara Dental Affiliate")
    public void the_user_verifies_that_the_page_title_is_privacy_policy_antlara_dental_affiliate() {
        String targetTitle="Privacy Policy – Antlara Dental Affiliate";
        ReusableMethods.switchToWindow(targetTitle);
        Assert.assertEquals(targetTitle,Driver.getDriver().getTitle());
    }
}
