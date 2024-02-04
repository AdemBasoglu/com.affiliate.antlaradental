package stepdefinitions.US_02;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ReusableMethods;

public class TC0202_ReferAndEarnInputFilled {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    Faker faker=new Faker();

    @Given("The user write a valid email")
    public void the_user_write_a_valid_email() {
        homePage.referAndEarnInput.sendKeys(faker.internet().emailAddress());
    }

    @Given("The user click submit button")
    public void the_user_click_submit_button() {
        homePage.submitButton.click();
        ReusableMethods.wait(10);
        homePage.submitButton.click();
    }

    @Given("The user should be verifying that user sees the Affiliate Sign Up banner.")
    public void the_user_should_be_verifying_that_user_sees_the_affiliate_sign_up_banner() {
        ReusableMethods.wait(3);
        Assert.assertTrue(registerPage.affiliateSignupText.isDisplayed());
    }

}
