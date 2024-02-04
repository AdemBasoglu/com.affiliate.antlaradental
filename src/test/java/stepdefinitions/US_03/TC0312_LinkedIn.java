package stepdefinitions.US_03;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0312_LinkedIn {

    HomePage homePage = new HomePage();

    @Given("The user click to LinkedIn icon and goes to directed to the relevant page.")
    public void the_user_click_to_linked_in_icon_and_goes_to_directed_to_the_relevant_page() {
        ReusableMethods.actionPageDown();
        ReusableMethods.wait(1);
        homePage.linkedInIcon.click();
    }

    @Given("The user verifies that the LinkedIn page title")
    public void the_user_verifies_that_the_linked_in_page_title() {
        String targetTitle = "Antlara Dental Clinic | LinkedIn";
        ReusableMethods.wait(5);
        ReusableMethods.switchToWindow(targetTitle);
        Assert.assertEquals(targetTitle, Driver.getDriver().getTitle());
    }
}
