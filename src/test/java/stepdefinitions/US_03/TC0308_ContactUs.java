package stepdefinitions.US_03;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0308_ContactUs {

    HomePage homePage=new HomePage();

    @Given("The user click to Contact Us link and goes to directed to the relevant page.")
    public void the_user_click_to_contact_us_link_and_goes_to_directed_to_the_relevant_page() {
        ReusableMethods.jsScrollBy(3);
        ReusableMethods.wait(3);
        homePage.contactUsLink.click();
    }
    @Given("The user verifies that the page title is Contact – Antlara Dental Affiliate")
    public void the_user_verifies_that_the_page_title_is_contact_antlara_dental_affiliate() {
        String targetTitle="Contact – Antlara Dental Affiliate";
        ReusableMethods.switchToWindow(targetTitle);
        Assert.assertEquals(targetTitle,Driver.getDriver().getTitle());
    }

}
