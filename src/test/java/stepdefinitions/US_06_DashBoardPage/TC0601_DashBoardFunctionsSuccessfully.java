package stepdefinitions.US_06_DashBoardPage;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DashboardPage;
import utilities.ReusableMethods;

public class TC0601_DashBoardFunctionsSuccessfully {

DashboardPage dashboardPage=new DashboardPage();

    @Given("The user verify Home, LinksBanner, Acoount,Payments,Logout links are visiable and clickable")
    public void the_user_verify_home_links_banner_acoount_payments_logout_links_are_visiable_and_clickable() {
        Assert.assertTrue(dashboardPage.homeLink.isDisplayed());
        Assert.assertTrue(dashboardPage.homeLink.isEnabled());
        Assert.assertTrue(dashboardPage.linksAndBannersLink.isDisplayed());
        Assert.assertTrue(dashboardPage.linksAndBannersLink.isEnabled());
        Assert.assertTrue(dashboardPage.accountLink.isDisplayed());
        Assert.assertTrue(dashboardPage.accountLink.isEnabled());
        Assert.assertTrue(dashboardPage.paymentsLink.isDisplayed());
        Assert.assertTrue(dashboardPage.paymentsLink.isEnabled());
        Assert.assertTrue(dashboardPage.logOutLink.isDisplayed());
        Assert.assertTrue(dashboardPage.logOutLink.isEnabled());

    }
    @Given("The user verify My Affiliate Link,My Affiliate Copy Link,Current Balance,Estimated Next Payout are visiable")
    public void the_user_verify_my_affiliate_link_my_affiliate_copy_link_current_balance_estimated_next_payout_are_visiable() {
       Assert.assertTrue(dashboardPage.myAffiliateDashboardLink.isDisplayed());
       Assert.assertTrue(dashboardPage.myAffiliateDashboardCopyLink.isDisplayed());
       ReusableMethods.keysPageDown();
       Assert.assertTrue(dashboardPage.currentBalanceCount.isDisplayed());
       Assert.assertTrue(dashboardPage.estimatedNextPayoutCount.isDisplayed());
        ReusableMethods.keysPageDown();
    }
    @Given("The user verifyClicks,Conversions,Revenue,Commission Rate,Commissions,Voids,Avg. Earns Per Click are visiable")
    public void the_user_verify_clicks_conversions_revenue_commission_rate_commissions_voids_avg_earns_per_click_are_visiable() {
        Assert.assertTrue(dashboardPage.clicksCount.isDisplayed());
        Assert.assertTrue(dashboardPage.conversionsCount.isDisplayed());
        Assert.assertTrue(dashboardPage.revenueCount.isDisplayed());
        Assert.assertTrue(dashboardPage.commissionsRateCount.isDisplayed());
        Assert.assertTrue(dashboardPage.commissionsCount.isDisplayed());
        Assert.assertTrue(dashboardPage.voidsCount.isDisplayed());
        Assert.assertTrue(dashboardPage.avgEarnsPerClickCount.isDisplayed());

    }



}
