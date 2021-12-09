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

    public void clickOnLeftElement(SelenideElement element){
        element.click();
    }

    public void inputDataIntoForm() {
     $("#userName").setValue("TEST NAME");
     $("#userEmail").setValue("email@test.com");
     $("#currentAddress").setValue(" iowa some city some str");
     $("#permanentAddress").setValue("baker st. 221 b");
     actions().moveToElement($("#submit")).click();

    }

    public void checkCheckBox(){
        //из Descktop выбрать commands (должны быть выбраны 3 элемента)

        $(".rct-icon-expand-close").shouldBe(Condition.visible).click();
        $x("//*[contains(text(),'Desktop')]").shouldBe(Condition.visible).click();
        elements(".text-success").shouldHave(CollectionCondition.size(3));
    }

    public void checkRadioButton(){
        //проверка нажатия radiobutton
        $x("//label[@for='yesRadio']").shouldNotBe(Condition.disabled);
        $x("//label[@for='yesRadio']").click();
        $x("//label[@for='yesRadio']").shouldHave(Condition.enabled);
    }

}
