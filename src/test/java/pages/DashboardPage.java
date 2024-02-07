package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement homeLink;

    @FindBy(xpath = "//a[contains(text(),'Links & Banners')]")
    public WebElement linksAndBannersLink;

    @FindBy(xpath = "//a[normalize-space()='Account']")
    public WebElement accountLink;
    @FindBy(xpath = "//a[normalize-space()='Payments']")
    public WebElement paymentsLink;
    @FindBy(xpath = "    //a[normalize-space()='Logout']")
    public WebElement logOutLink;
    @FindBy(id = "esaf-dashboard-my-affiliate-link-field")
    public WebElement myAffiliateDashboardLink;
    @FindBy(xpath = "//span[@class='esaf-copy-clipboard']")
    public WebElement myAffiliateDashboardCopyLink;
    @FindBy(xpath = "(//span[@class='esaf-affiliate-dashboard-home-stat-value'])[1]")
    public WebElement clicksCount;
    @FindBy(xpath = "(//span[@class='esaf-affiliate-dashboard-home-stat-value'])[2]")
    public WebElement conversionsCount;
    @FindBy(xpath = "(//span[@class='esaf-affiliate-dashboard-home-stat-value'])[3]")
    public WebElement revenueCount;
    @FindBy(xpath = "(//span[@class='esaf-affiliate-dashboard-home-stat-value'])[4]")
    public WebElement commissionsRateCount;
    @FindBy(xpath = "(//span[@class='esaf-affiliate-dashboard-home-stat-value'])[5]")
    public WebElement commissionsCount;
    @FindBy(xpath = "(//span[@class='esaf-affiliate-dashboard-home-stat-value'])[6]")
    public WebElement voidsCount;
    @FindBy(xpath = "(//span[@class='esaf-affiliate-dashboard-home-stat-value'])[7]")
    public WebElement avgEarnsPerClickCount;
    @FindBy(xpath = "(//div[@class='esaf-affiliate-dashboard-home-box-amount'])[1]")
    public WebElement currentBalanceCount;
    @FindBy(xpath = "(//div[@class='esaf-affiliate-dashboard-home-box-amount'])[2]")
    public WebElement estimatedNextPayoutCount;
    @FindBy(xpath = "//div[@class='esaf-affiliate-dashboard-custom-message']")
    public WebElement homeTagWelcomeText;

    @FindBy(xpath = "(//*[text()='Links & Banners'])[2]")
    public WebElement linksAndBannerTag;
    @FindBy(xpath = "//li[@class='esaf-creatives-nav-active']")
    public WebElement bannersTag;
    @FindBy(xpath = "//li[@class='esaf-creatives-nav-active']")
    public WebElement textTag;

    @FindBy(xpath = "//img[@class='esaf-banner-link-get-html-code entered litespeed-loaded']\n")
    public WebElement bannerImage;
    @FindBy(xpath = "//h3[normalize-space()='Affiliate Profile']")
    public WebElement affiliateProfiletTitle;
    @FindBy(xpath = "//h3[normalize-space()='Payment History']")
    public WebElement paymentsTitle;
    @FindBy(id = "esaf-dashboard-paypal-email")
    public WebElement accountPagePaypalInput;
    @FindBy(xpath = "//button[normalize-space()='Save Profile']")
    public WebElement savedProfilButton;
    @FindBy(id = "esaf-account-saved")
    public WebElement succesfullySavedProfileText;










}
