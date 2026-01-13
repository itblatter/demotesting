package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080"; // устанавливаем разрешение браузера 1920х1080
        Configuration.baseUrl = "https://demoqa.com"; // абсолютный параметр
        Configuration.pageLoadStrategy = "eager"; // стратегия загрузки страницы (не дожидаемся)
        Configuration.holdBrowserOpen = true; // не закрывать браузер после завершения теста
    }

    @Test
    void fillFormTest() {
        open("/text-box");

        $("#userName").setValue("IT");
        $("#userEmail").setValue("itbl@gmail.com");
        $("#currentAddress").setValue("Wall Street");
        $("#permanentAddress").setValue("Permanent Street");

        $("#submit").scrollTo().shouldBe(visible, enabled).click();

        $("#output #name").shouldHave(text("IT"));
        $("#output #email").shouldHave(text("itbl@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Wall Street"));
        $("#output #permanentAddress").shouldHave(text("Permanent Street"));
    }
}
