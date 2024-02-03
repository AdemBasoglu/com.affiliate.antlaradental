package stepdefinitions.US_02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;

public class TC0201_ReferAndEarn {
    HomePage homePage = new HomePage();

    @Given("The user should be verify that Refer and Earn input is visible")
    public void the_user_should_be_verify_that_refer_and_earn_input_is_visible() {
        Assert.assertTrue(homePage.referAndEarnInput.isDisplayed());

    }

    @Given("The user should be verify that Refer and Earn input is clickable")
    public void the_user_should_be_verify_that_refer_and_earn_input_is_clickable() {
        Assert.assertTrue(homePage.referAndEarnInput.isEnabled());

    }

    @And("The user should be verify that submit button visible")
    public void theUserShouldBeVerifyThatSubmitButtonVisible() {
        Assert.assertTrue(homePage.submitButton.isDisplayed());

    }

    @And("The user should be verify that submit button clickable")
    public void theUserShouldBeVerifyThatSubmitButtonClickable() {
        Assert.assertTrue(homePage.submitButton.isEnabled());

    }


}
