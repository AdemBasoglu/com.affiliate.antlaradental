package stepdefinitions.US_06_DashBoardPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DashboardPage;
import utilities.ReusableMethods;

public class TC0605_DasboardCounter {
    DashboardPage dashboardPage=new DashboardPage();
    @Given("The user verify clicks counter bigger then zero")
    public void the_user_verify_clicks_counter_bigger_then_zero() {
        double targetcount=ReusableMethods.getTextToDouble(dashboardPage.clicksCount);
        Assert.assertTrue(targetcount>0);
    }
    @And("The user verify clicks conversions bigger then zero")
    public void theUserVerifyClicksConversionsBiggerThenZero() {
        double targetcount=ReusableMethods.getTextToDouble(dashboardPage.conversionsCount);
        Assert.assertTrue(targetcount>0);
    }
    @Given("The user verify revenue counter bigger then zero")
    public void the_user_verify_revenue_counter_bigger_then_zero() {
        ReusableMethods.keysPageDown();
        double targetcount=ReusableMethods.getTextToDouble(dashboardPage.revenueCount);
        Assert.assertTrue(targetcount>0);
    }
    @Given("The user verify commissions counter bigger then zero")
    public void the_user_verify_commissions_counter_bigger_then_zero() {
        double targetcount=ReusableMethods.getTextToDouble(dashboardPage.commissionsCount);
        Assert.assertTrue(targetcount>0);
    }
    @Given("The user verify avg earns per click counter bigger then zero")
    public void the_user_verify_avg_earns_per_click_counter_bigger_then_zero() {
        double targetcount=ReusableMethods.getTextToDouble(dashboardPage.avgEarnsPerClickCount);
        Assert.assertTrue(targetcount>0);
    }



}
