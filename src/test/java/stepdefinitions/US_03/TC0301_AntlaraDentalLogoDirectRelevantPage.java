package stepdefinitions.US_03;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;

public class TC0301_AntlaraDentalLogoDirectRelevantPage {
    HomePage homePage = new HomePage();

    @Given("The user click to AntlaraDental Logo and goes to directed to the relevant page.")
    public void the_user_click_to_antlara_dental_logo_and_goes_to_directed_to_the_relevant_page() {
        homePage.antlaraDentalLogo.click();
    }
    @Given("The user verifies that the page title is Antlara Dental Affiliate")
    public void the_user_verifies_that_the_page_title_is_antlara_dental_affiliate() {
        Assert.assertEquals("Antlara Dental Affiliate",Driver.driver.getTitle());
    }


}
