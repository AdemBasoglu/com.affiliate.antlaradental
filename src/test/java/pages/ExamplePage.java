package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExamplePage {

    public ExamplePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Geht klar']")
    public WebElement cookiesAccept;

    @FindBy(xpath = "(//*[text()='Merkzettel'])[1]")
    public WebElement linkMerkzettel;

    @FindBy(xpath = "//*[span='Melden Sie sich an, um Ihre Merkzettel auf allen Geräten zu speichern.']")
    public WebElement linkNoteList;
}
