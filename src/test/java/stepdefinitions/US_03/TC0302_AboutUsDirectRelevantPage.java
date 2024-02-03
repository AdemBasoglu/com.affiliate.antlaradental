package stepdefinitions.US_03;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.ReusableMethods;
import static utilities.Driver.getDriver;

public class TC0302_AboutUsDirectRelevantPage {
HomePage homePage=new HomePage();



    @Given("The user click to AboutUs link and goes to directed to the relevant page.")
    public void the_user_click_to_about_us_link_and_goes_to_directed_to_the_relevant_page() {
       homePage.aboutUsLink.click();
       ReusableMethods.wait(5);
    }
    @Given("The user verifies that the page title is  About Healthy Teeth,Dental care in Turkey|Antlara Dental Antalya")
    public void the_user_verifies_that_the_page_title_is_about_healthy_teeth_dental_care_in_turkey_antlara_dental_antalya() {
       String newTab="About Healthy Teeth,Dental care in Turkey|Antlara Dental Antalya";
       ReusableMethods.switchToWindow(newTab);
       ReusableMethods.wait(5);
       Assert.assertEquals(newTab,getDriver().getTitle());


    }
}
