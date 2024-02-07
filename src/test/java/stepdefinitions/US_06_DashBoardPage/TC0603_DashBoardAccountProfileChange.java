package stepdefinitions.US_06_DashBoardPage;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DashboardPage;
import utilities.ReusableMethods;

public class TC0603_DashBoardAccountProfileChange {
    DashboardPage dashboardPage=new DashboardPage();
    Faker faker=new Faker();
    @Given("The user clicks Acoount link")
    public void the_user_clicks_acoount_link() {
       dashboardPage.accountLink.click();
    }
    @Given("The user changes Paypal email")
    public void the_user_changes_paypal_email() {
        dashboardPage.accountPagePaypalInput.sendKeys(faker.internet().safeEmailAddress());
    }
    @Given("The user clicks save profile button")
    public void the_user_clicks_save_profile_button() {
        dashboardPage.savedProfilButton.submit();
    }
    @Given("The user verify succesfully saved")
    public void the_user_verify_succesfully_saved() {
        Assert.assertTrue(dashboardPage.succesfullySavedProfileText.isDisplayed());
    }
}
