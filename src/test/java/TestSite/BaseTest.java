package TestSite;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.time.Duration;
import java.time.temporal.ChronoUnit;


public class BaseTest {

    public static void setConfig(){

        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        Configuration.browser = "firefox";
        Configuration.driverManagerEnabled = true;
        Configuration.downloadsFolder = "build/downloads/imgs";
        Configuration.timeout = Duration.of(2, ChronoUnit.SECONDS).toMillis();
        Configuration.screenshots = false;
    }

    @BeforeAll
    public static void init(){
        setConfig();
    }


    @AfterAll
    public void tearDown(){
        Selenide.closeWebDriver();
    }

    public void openLink(String text){
        Selenide.open(text);
    }
}
