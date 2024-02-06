package stepdefinitions.US_05_LoginPage;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0501_LoginSuccesfullyWithValidUsernameAndPassword {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    @Given("The user click Login link")
    public void the_user_click_login_link() {
        homePage.loginLink.click();
        //ReusableMethods.wait(3);
    }
    @Given("The user writes username")
    public void the_user_writes_username() {
        loginPage.userNameInput.sendKeys("adembas");
        ReusableMethods.wait(3);

    }
    @Given("The user writes password")
    public void the_user_writes_password() {
        loginPage.passwordInput.sendKeys("As120619");
        ReusableMethods.wait(3);

    }
    @Given("The user click submit button in login page")
    public void the_user_click_submit_button_in_login_page() {
       loginPage.rememberSelectBox.click();
       loginPage.loginButton.submit();
        ReusableMethods.wait(3);
    }
    @Given("The user verify title Affiliate Dashboard – Antlara Dental Affiliate")
    public void the_user_verify_title_affiliate_dashboard_antlara_dental_affiliate() {
        String targetTitle="Affiliate Dashboard – Antlara Dental Affiliate";
        Assert.assertEquals(targetTitle, Driver.getDriver().getTitle());
    }
}
