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
    HomePage homePage=new HomePage();
    @Given("The user writes invalid password")
    public void the_user_writes_invalid_password() {
        loginPage.passwordInput.sendKeys("12345");
    }
    @Given("The user should see error message")
    public void the_user_should_see_error_message() {
        Assert.assertTrue(loginPage.loginErrorText.isDisplayed());
    }
    @And("The user writes invalid username")
    public void theUserWritesInvalidUsername() {
        loginPage.userNameInput.sendKeys("newUser");
    }

    @And("The user writes valid password")
    public void theUserWritesValidPassword() {
        loginPage.passwordInput.sendKeys("As120619");

    }


}
