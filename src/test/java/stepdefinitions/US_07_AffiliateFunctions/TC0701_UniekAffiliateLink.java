package stepdefinitions.US_07_AffiliateFunctions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DashboardPage;
import pages.LoginPage;

public class TC0701_UniekAffiliateLink {
    DashboardPage dashboardPage=new DashboardPage();

    @Given("The user's affiliate link should include username")
    public void the_user_s_affiliate_link_should_include_username() {
        String linkText=dashboardPage.myAffiliateDashboardLink.getAttribute("value");
        System.out.println("linkText = " + linkText);
        Assert.assertEquals("https://affiliate.antlaradental.com/contact/?aff="+LoginPage.username,linkText);
    }
}
