package stepdefinitions.US_06_DashBoardPage;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.DashboardPage;
import utilities.ReusableMethods;

public class TC0602_DashBoardSwitchLinks {

    DashboardPage dashboardPage = new DashboardPage();

    @And("The user switch succesfully LinksBanner link")
    public void theUserSwitchSuccesfullyLinksBannerLink() {
        dashboardPage.linksAndBannersLink.click();
        Assert.assertTrue(dashboardPage.linksAndBannerTag.isDisplayed());
    }
    @And("The user verify Text Tag,Banners Tag and Banners image are visible and clickable")
    public void theUserVerifyTextTagBannersTagAndBannersImageAreVisibleAndClickable() {
        Assert.assertTrue(dashboardPage.textTag.isDisplayed());
        Assert.assertTrue(dashboardPage.bannersTag.isDisplayed());
    }

    @And("The user switch succesfully Acoount link")
    public void theUserSwitchSuccesfullyAcoountLink() {
        dashboardPage.accountLink.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(dashboardPage.affiliateProfiletTitle.isDisplayed());
    }

    @And("The user switch succesfully Payments link")
    public void theUserSwitchSuccesfullyPaymentsLink() {
        dashboardPage.paymentsLink.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(dashboardPage.paymentsTitle.isDisplayed());
    }

    @And("The user switch succesfully Logout link")
    public void theUserSwitchSuccesfullyLogoutLink() {
        Assert.assertTrue(dashboardPage.logOutLink.isDisplayed());
    }
}
