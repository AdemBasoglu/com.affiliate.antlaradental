package stepdefinitions.US_05_LoginPage;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;

public class TC0501_LoginSuccesfullyWithValidUsernameAndPassword {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Given("The user click Login link")
    public void the_user_click_login_link() {
        homePage.loginLink.click();
    }

    @Given("The user writes username")
    public void the_user_writes_username() {
        loginPage.userNameInput.sendKeys(LoginPage.username);

    }

    @Given("The user writes password")
    public void the_user_writes_password() {
        loginPage.passwordInput.sendKeys("As120619");


    }

    @Given("The user click submit button in login page")
    public void the_user_click_submit_button_in_login_page() {
        loginPage.rememberSelectBox.click();
        loginPage.loginButton.submit();

    }

    @Given("The user verify title Affiliate Dashboard – Antlara Dental Affiliate")
    public void the_user_verify_title_affiliate_dashboard_antlara_dental_affiliate() {
        String targetTitle = "Affiliate Dashboard – Antlara Dental Affiliate";
        Assert.assertEquals(targetTitle, Driver.getDriver().getTitle());
    }
}
