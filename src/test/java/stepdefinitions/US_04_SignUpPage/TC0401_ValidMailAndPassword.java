package stepdefinitions.US_04_SignUpPage;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.SignUpPage;
import utilities.ReusableMethods;

import javax.swing.*;
import java.awt.*;

import static utilities.Driver.driver;

public class TC0401_ValidMailAndPassword {
    SignUpPage signUpPage=new SignUpPage();
    HomePage homePage=new HomePage();
    Faker faker =new Faker();
    Actions actions;

    @Given("The user click sigup link")
    public void the_user_click_sigup_link() {
        homePage.signupLink.click();
    }
    @Given("The user fill in the form with correct information")
    public void the_user_fill_in_the_form_with_correct_information() {
       actions=new Actions(driver);
       String fakerEmail=faker.internet().safeEmailAddress();
       String fakerPassword=faker.internet().password();
       String fakerFirstName=faker.name().firstName();
       actions.moveToElement(signUpPage.firstNameInput).click()
               .sendKeys(fakerFirstName)
               .sendKeys(Keys.TAB)
               .sendKeys(faker.name().lastName())
               .sendKeys(Keys.TAB)
               .sendKeys(fakerFirstName+"king")
               .sendKeys(Keys.TAB)
               .sendKeys(fakerEmail)
               .sendKeys(Keys.TAB)
               .sendKeys(faker.finance().iban())
               .sendKeys(Keys.TAB)
               .sendKeys("123")
               .sendKeys(Keys.TAB)
               .sendKeys(fakerEmail)
               .sendKeys(Keys.TAB)
               .sendKeys(fakerPassword)
               .sendKeys(Keys.TAB)
               .sendKeys(fakerPassword)
               .perform();
    }
    @Given("The user click agree box")
    public void the_user_click_agree_box() {
        ReusableMethods.actionPageDown();
        ReusableMethods.wait(2);
        signUpPage.agreeBox.click();

    }
    @Given("The user click submit button in signup page")
    public void the_user_click_submit_button_in_signup_page() {
        signUpPage.signUpButton.submit();
        ReusableMethods.wait(3);
    }
    @Given("The user verify Thanks for Signing Up to Our Affiliate Program!")
    public void the_user_verify_thanks_for_signing_up_to_our_affiliate_program() {
        signUpPage.signUpSuccesfulyText.isDisplayed();
    }



}
