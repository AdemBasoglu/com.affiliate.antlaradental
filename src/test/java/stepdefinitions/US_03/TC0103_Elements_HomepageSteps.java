package stepdefinitions.US_03;

import io.cucumber.java.en.Given;
import pages.US_03_Elements_Homepage;

public class TC0103_Elements_HomepageSteps {

    US_03_Elements_Homepage elements_homepage;

    public TC0103_Elements_HomepageSteps(US_03_Elements_Homepage elements_homepage) {
        this.elements_homepage = elements_homepage;
    }



    @Given("Control the element on the homepage is clickable and available for dropdowns")
    public void controlTheElementOnTheHomepageIsClickableAndAvailableForDropdowns() {
        elements_homepage.listElementsIsclickable(elements_homepage.getElements());

        elements_homepage.hoverElementandDropdownsMenuVisibility(elements_homepage.getElements_dropDownsMenu());



    }


}
