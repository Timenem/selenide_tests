package TestSite.practiceForm;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class FormPage {

    public FormPage(String URL){open(URL);}
    public static SelenideElement PRACTICE_FORM  = $x("//span[text()='Practice Form']");
    public void clickOnLeftElement(SelenideElement element){
        element.click();
    }

    public void inputDataIntoForm() {
        $("#firstName").setValue("First NAME");
        $("#lastName").setValue("LastName");
        $("#userEmail").setValue("email@test.com");
        $x("//label[@for='gender-radio-1']").click();
        $("#userNumber").setValue("+7111-84-56-651");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(2);
        $(".react-datepicker__year-select").selectOption("1994");
        $("#dateOfBirthInput").pressEnter();
        $x("//label[@for='hobbies-checkbox-1']").scrollTo().click();
        $x("//label[@for='hobbies-checkbox-2']").click();
        //загрузка изображения
        $x("//label[@for='uploadPicture']").scrollTo().click();
        File file = new File("src/main/resources/toyota.jpg");
        $("#uploadPicture").uploadFile(file);
        $("#currentAddress").setValue("baker street 221 b");
        //$("#state").find("Uttar Pradesh").click();
        //$("#city").find("Lucknow").click();
        actions().moveToElement($("#submit")).click();
    }
}