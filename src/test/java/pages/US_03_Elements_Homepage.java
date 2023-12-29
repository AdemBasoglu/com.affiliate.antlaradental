package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_03_Elements_Homepage extends ReusableMethods {


    public US_03_Elements_Homepage() {PageFactory.initElements(Driver.getDriver(),this);}

  @FindBy(id = "c24-nav-ele c24-nav-")
  private List<WebElement> elements;

  @FindBy( id="c24-subnav c24-hover-layer clearfix")
  private List<WebElement> elements_dropDownsMenu;




   public List<WebElement> getElements() {
       return elements;
   }

   public List<WebElement> getElements_dropDownsMenu() {
       return elements_dropDownsMenu;
    }
}
