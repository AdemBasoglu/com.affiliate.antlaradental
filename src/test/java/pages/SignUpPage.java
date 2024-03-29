package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUpPage {


    public SignUpPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "    //h1[normalize-space()='Affiliate Signup']")
    public WebElement affiliateSignupText;
    @FindBy(id = "first_name")
    public WebElement firstNameInput;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement agreeBox;
    @FindBy(xpath = "//button[normalize-space()='Sign Up']")
    public WebElement signUpButton;
    @FindBy(xpath = "//*[text()='Log in to your Affiliate Dashboard']")
    public WebElement signUpSuccesfulyText;
    @FindBy(xpath = "//div[@class='esaf-form-errors']")
    public WebElement signupErrorText;
    @FindBy(xpath = "//*[text()='Required and must be a valid email address']")
    public WebElement requiredMailMessageText;














}
