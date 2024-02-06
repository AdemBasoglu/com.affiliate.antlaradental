package stepdefinitions.US_05_LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0502_LoginNotSuccesfullyWithValidUsernameAndInvalidPassword {
    LoginPage loginPage=new LoginPage();
    @Given("The user writes invalid password")
    public void the_user_writes_invalid_password() {
        loginPage.passwordInput.sendKeys("12345");
    }
    @Given("The user should see error message")
    public void the_user_should_see_error_message() {
        Assert.assertTrue(loginPage.loginErrorText.isDisplayed());
    }



}
