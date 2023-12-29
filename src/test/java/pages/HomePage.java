package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='Geht klar'] ")
    public WebElement gehtKlarButton;

    @FindBy(xpath = "//span[@class='c24-customer-hover c24-header-hover'] ")
    public WebElement meinKontoLink;

    @FindBy(xpath = "//a[@class='c24-meinkonto-reflink c24-meinkonto-register-link c24-uliloginlayer-register-opener'] ")
    public WebElement startenSieHierLink;
    @FindBy(xpath = "(//*[text()='Nachhaltigkeit'][1])[1]")
    public WebElement Nachhaltigkeit;

    @FindBy(xpath = "//*[text()='Nachhaltige Unternehmensführung']")
    public WebElement NUnternehmensführung;

    @FindBy(xpath = "//*[text()='Ausgezeichnetes Engagement']")
    public WebElement Ausgezeichnetes;






}
