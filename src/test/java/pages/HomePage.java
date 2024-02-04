package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//span[normalize-space()='About Us']")
    public WebElement aboutUsLink;
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    public WebElement dashboardLink;
    @FindBy(xpath = "//span[normalize-space()='Login']")
    public WebElement loginLink;
    @FindBy(xpath = "//span[normalize-space()='Signup']")
    public WebElement signupLink;
    @FindBy(xpath = "(//img[@alt='Antlara Dental Affiliate'])[1]")
    public WebElement antlaraDentalLogo;
    @FindBy(xpath = "//span[normalize-space()='How it Works']")
    public WebElement howItWorksLink;
    @FindBy(xpath = "(//span[normalize-space()='Privacy Policy'])[1]")
    public WebElement privacyPolicyLink;
    @FindBy(xpath = "//span[normalize-space()='Contact Us']")
    public WebElement contactUsLink;
    @FindBy(xpath = "(//*[name()='svg'])[3]")
    public WebElement facebookIcon;
    @FindBy(xpath = "(//*[name()='svg'])[4]")
    public WebElement instagramIcon;
    @FindBy(xpath = "(//*[name()='path'])[4]")
    public WebElement twitterIcon;
    @FindBy(xpath = "(//*[name()='svg'])[6]")
    public WebElement linkedInIcon;
    @FindBy(xpath = "(//*[name()='path'])[6]")
    public WebElement youtubeIcon;

    @FindBy(xpath = "//input[@id='wpforms-24-field_1']")
    public WebElement referAndEarnInput;

    @FindBy(xpath = "//button[@id='wpforms-submit-24']")
    public WebElement submitButton;

    @FindBy(xpath = "//h1[normalize-space()='Antlara Dental Clinic']")
    public WebElement aboutUsTitleText;
    @FindBy(xpath = "//button[normalize-space()='Allow all cookies'])[1]")
    public WebElement facebookAcceptCookies;
    @FindBy(xpath = "//*[name()='svg'][@class='r-4qtqp9 r-yyyyoo r-dnmrzs r-bnwqim r-1plcrui r-lrvibr r-z80fyv r-19wmn03'])[1]")
    public WebElement twitterSignupPopClose;
    @FindBy(xpath = "//span[contains(text(),'Accept all cookies')]")
    public WebElement twitteracceptCookies;






}
