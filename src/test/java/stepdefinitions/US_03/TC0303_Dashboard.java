package stepdefinitions.US_03;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0303_Dashboard {

    HomePage homePage=new HomePage();

    @Given("The user click to Dashboard link and goes to directed to the relevant page.")
    public void the_user_click_to_dashboard_link_and_goes_to_directed_to_the_relevant_page() {
       homePage.dashboardLink.click();
        ReusableMethods.wait(3);
    }
    @Given("The user verifies that the page title is  Affiliate Dashboard – Antlara Dental Affiliate")
    public void the_user_verifies_that_the_page_title_is_affiliate_dashboard_antlara_dental_affiliate() {
       String targetTitle="Affiliate Dashboard – Antlara Dental Affiliate";
        ReusableMethods.switchToWindow(targetTitle);
        Assert.assertEquals(targetTitle, Driver.getDriver().getTitle());
    }
}
