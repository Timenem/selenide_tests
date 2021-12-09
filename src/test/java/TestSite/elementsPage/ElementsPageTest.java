package TestSite.elementsPage;

import TestSite.BaseTest;
import TestSite.ElementsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static TestSite.ElementsPage.*;
import static com.codeborne.selenide.Selenide.actions;

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
}
