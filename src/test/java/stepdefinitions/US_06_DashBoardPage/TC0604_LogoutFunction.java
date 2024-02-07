package stepdefinitions.US_06_DashBoardPage;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.Driver;

public class TC0604_LogoutFunction {
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user clicks Logout link")
    public void the_user_clicks_logout_link() {
        dashboardPage.logOutLink.click();
    }

    @Given("The user goes to login page")
    public void the_user_goes_to_login_page() {
        String targetTitle = "Affiliate Login – Antlara Dental Affiliate";
        Assert.assertEquals(targetTitle, Driver.getDriver().getTitle());
    }
}
