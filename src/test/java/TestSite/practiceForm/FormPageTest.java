package TestSite.practiceForm;

import TestSite.BaseTest;
import org.junit.jupiter.api.Test;

import static TestSite.practiceForm.FormPage.PRACTICE_FORM;

public class FormPageTest extends BaseTest {
        private final String URL = "https://demoqa.com/forms";
        FormPage formPage = new FormPage(URL);

        @Test
        public void practiceFormTest(){
            formPage.clickOnLeftElement(PRACTICE_FORM);
            formPage.inputDataIntoForm();
        }

}
