package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
    @FindBy(xpath = "//li[@class='wp-social-link wp-social-link-x  wp-block-social-link']")
    public WebElement twitterIcon;
    @FindBy(xpath = "//li[@class='wp-social-link wp-social-link-linkedin  wp-block-social-link']")
    public WebElement linkedInIcon;
    @FindBy(xpath = "//li[@class='wp-social-link wp-social-link-youtube  wp-block-social-link']")
    public WebElement youtubeIcon;

    @FindBy(xpath = "//input[@id='wpforms-24-field_1']")
    public WebElement referAndEarnInput;

    @FindBy(xpath = "//button[@id='wpforms-submit-24']")
    public WebElement submitButton;

    @FindBy(xpath = "//button[normalize-space()='Allow all cookies'])[1]")
    public WebElement facebookAcceptCookies;


}
