package TestSite.elementsPage;

import TestSite.BaseTest;
import org.junit.jupiter.api.Test;

import static TestSite.elementsPage.ElementsPage.*;

public class ElementsPageTest extends BaseTest {
    private final String URL = "https://demoqa.com/elements";
    ElementsPage elementPage = new ElementsPage(URL);

    @Test
    public void checkTextBox(){
        elementPage.clickOnLeftElement(TEXT_BOX);
        elementPage.inputDataIntoForm();
    }

    @Test
    public void chekBoxes(){
        elementPage.clickOnLeftElement(CHECK_BOX);
        elementPage.checkCheckBox();
    }

    @Test
    public void radioButtons(){
        elementPage.clickOnLeftElement(RADIO_BUTTON);
        elementPage.checkRadioButton();
    }
}
