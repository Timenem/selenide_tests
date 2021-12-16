package TestSite.steps;

import TestSite.BaseTest;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.$;

public class AuthorisatioDef  extends BaseTest {
    @Before
    public void initConfig(){
        setConfig();
    }

    @Given("Страница авторизации")
    public void openAuthPage() {
        openLink("https://demoqa.com/login");
    }

    @Then("Ввод {string} в поле логин")
    public void enterLogin(String arg0) {
        $("#userName").setValue(arg0);

    }

    @Then("Ввод {string} в поле пароль")
    public void enterPassword(String arg0) {
        $("#password").setValue(arg0);
    }

    @Then("Нажать на кнопку Login")
    public void pressButton() {
        $("#login").click();
    }
}
