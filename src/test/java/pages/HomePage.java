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

    @FindBy(xpath = "//*[text()='Mein Konto']")
    public WebElement meinKontoLink;

    @FindBy(xpath = "//*[text()='Starten Sie hier.'] ")
    public WebElement startenSieHierLink;
  
    @FindBy(xpath = "(//*[text()='Nachhaltigkeit'][1])[1]")
    public WebElement Nachhaltigkeit;
  
    @FindBy(xpath = "//*[text()='Internet']")
    public WebElement Internet;

    @FindBy(xpath = "//*[text()='Nachhaltige Unternehmensführung']")
    public WebElement NUnternehmensführung;

    @FindBy(xpath = "//*[text()='Ausgezeichnetes Engagement']")
    public WebElement Ausgezeichnetes;
  
    @FindBy(xpath = "//*[@class='c24-search-input hits-search-element']")
    public WebElement searchBox ;

}
