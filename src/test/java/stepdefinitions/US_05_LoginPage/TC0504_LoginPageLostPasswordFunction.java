package stepdefinitions.US_05_LoginPage;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.LoginPage;
import pages.SignUpPage;

public class TC0504_LoginPageLostPasswordFunction {
    SignUpPage signUpPage=new SignUpPage();
    LoginPage loginPage=new LoginPage();

    @Given("The user clicks lost password link")
    public void the_user_clicks_lost_password_link() {
       loginPage.lostPasswordLink.click();
    }
    @Given("The user verify title Request a Password Reset")
    public void the_user_verify_title_request_a_password_reset() {
        Assert.assertTrue(loginPage.requestPasswordText.isDisplayed());
    }
    @Given("The user writes valid email or username in the input")
    public void the_user_writes_valid_email_or_username_in_the_input() {
        loginPage.requestPasswordInput.sendKeys("adembas");
    }
    @Given("The user clicks Request Password Reset Button")
    public void the_user_clicks_request_password_reset_button() {
        loginPage.requestPasswordResetButton.submit();
    }
    @Given("The user should see Successfully requested password reset message")
    public void the_user_should_see_successfully_requested_password_reset_message() {
        Assert.assertTrue(loginPage.requestPasswordSuccesfullyText.isDisplayed());
    }

}
