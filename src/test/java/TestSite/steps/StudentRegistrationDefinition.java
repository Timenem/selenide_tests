package TestSite.steps;

import TestSite.BaseTest;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class StudentRegistrationDefinition  extends BaseTest {
    String link = "https://demoqa.com/automation-practice-form";

    @Given("go to form page")
    public void openAuthPage() {
        openLink(link);
    }


    @And("Name should be {string}")
    public void nameShouldBe(String name){
        $("#firstName").setValue(name);
    }

    @And("Last name should be {string}")
    public void lastNameShouldBe(String lastName) {
        $("#lastName").setValue(lastName);

    }

    @And("Email should be {string}")
    public void emailNameShouldBe(String lastName) {
        $("#userEmail").setValue(lastName);

    }
    @And("Gender should be Male")
    public void genderShouldBe() {
        $x("//label[@for='gender-radio-1']").click();
    }

    @And("Mobile should be {string}")
    public void mobileShouldBe(String phone) {
        $("#userNumber").setValue(phone);
    }

    @And("Date of birth should be 19 Feb 1994")
    public void dateOfBirthShouldBe() {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(2);
        $(".react-datepicker__year-select").selectOption("1994");
        $("#dateOfBirthInput").pressEnter();
    }

    @And("Hobbies should be Sports and Reading")
    public void hobbiesShouldBe() {
        $x("//label[@for='hobbies-checkbox-1']").scrollTo().click();
        $x("//label[@for='hobbies-checkbox-2']").click();
    }

    @And("Picture should be downloaded")
    public void pictureShouldBeDownloaded() {
        $x("//label[@for='uploadPicture']").scrollTo().click();
        File file = new File("src/main/resources/toyota.jpg");
        $("#uploadPicture").uploadFile(file);
    }

    @And("Current {string} address should be {string}")
    public void currentAddressShouldBe(String arg0, String arg1) {
        $(arg0).setValue(arg1);
    }

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        actions().moveToElement($(arg0)).click();

    }
}

