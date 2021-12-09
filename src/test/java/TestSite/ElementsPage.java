package TestSite;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class ElementsPage {

    public ElementsPage(String URL){
        Selenide.open(URL);
    }

    public static SelenideElement TEXT_BOX  = $x("//span[text()='Text Box']");
    public static SelenideElement CHECK_BOX  = $x("//span[text()='Check Box']");
    public static SelenideElement RADIO_BUTTON = $x("//span[text()='Radio Button']");
    public static SelenideElement WEB_TABLES  = $x("//span[text()='Web Tables']");
    public static SelenideElement UPLOAD_DOWNLOAD = $x("//span[text()='Upload and Download']");

    public void clickOnLeftElement(SelenideElement element){
        element.click();
    }

    public static SelenideElement FULL_NAME = $("#userName");

    public void inputDataIntoForm() {
     $("#userName").setValue("TEST NAME");
     $("#userEmail").setValue("email@test.com");
     $("#currentAddress").setValue(" iowa some city some str");
     $("#permanentAddress").setValue("baker st. 221 b");
     actions().moveToElement($("#submit")).click();

    }

}
