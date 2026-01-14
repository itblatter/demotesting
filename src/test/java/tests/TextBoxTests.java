package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

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
        open("/automation-practice-form");

        $("#firstName").setValue("Jeka");
        $("#lastName").setValue("Gigant");
        $("#userEmail").setValue("JekaITCoach@gmail.farm");
        $x("//label[.='Female']").click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("October");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--010").click();
        $("#subjectsInput").setValue("Biology").pressEnter();
        $("#subjectsInput").setValue("History").pressEnter();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $x("//label[.='Music']").click();
        $x("//label[.='Reading']").click();
        $x("//label[.='Sports']").click();
        $("#uploadPicture").uploadFile(
                new File("/Users/ITBlatter/IdeaProjects/demotesting/src/test/resources/citilink.png")
        );
        $("#currentAddress").setValue("Gigant");
        $("#state").click();
        $x("//div[contains(@id,'react-select') and text()='Uttar Pradesh']").click();
        $("#city").click();
        $x("//div[contains(@id,'react-select') and text()='Agra']").click();
        $("#submit").click();

    }
}
