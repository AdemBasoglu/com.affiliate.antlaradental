package stepdefinitions.US_05_LoginPage;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.LoginPage;
import pages.SignUpPage;

public class TC0505_RegisterLinkFunction {
    SignUpPage signUpPage=new SignUpPage();
    LoginPage loginPage=new LoginPage();

    @Given("The user clicks register link")
    public void the_user_clicks_register_link() {
       loginPage.registerLinkLoginPage.click();
    }
    @Given("The user verify title Affiliate Signup")
    public void the_user_verify_title_affiliate_signup() {
    Assert.assertTrue(signUpPage.affiliateSignupText.isDisplayed());
    }
}
