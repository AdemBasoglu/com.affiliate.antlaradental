package stepdefinitions.US_03;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0305_SignUp {

    HomePage homePage=new HomePage();


    @Given("The user click to Signup link and goes to directed to the relevant page.")
    public void the_user_click_to_signup_link_and_goes_to_directed_to_the_relevant_page() {
        homePage.signupLink.click();
        ReusableMethods.wait(3);
    }
    @Given("The user verifies that the page title is Affiliate Signup – Antlara Dental Affiliate")
    public void the_user_verifies_that_the_page_title_is_affiliate_signup_antlara_dental_affiliate() {
        String targetTitle="Affiliate Signup – Antlara Dental Affiliate";
        ReusableMethods.switchToWindow(targetTitle);
        Assert.assertEquals(targetTitle, Driver.getDriver().getTitle());

    }
}
