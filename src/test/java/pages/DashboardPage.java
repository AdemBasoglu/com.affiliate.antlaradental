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

    @FindBy(xpath = "//a[normalize-space()='Links & Banners']")
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


}
