package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @Test
    void baseTest() {
        //Открыть Гитхаб
        open("https://github.com/");
        //Ввести в поиск название страницы "Docent321/qa_guru_2"
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("delkabo/qa-g-6-Junit-1");
        $(".header-search-input").submit();
        //Проверка, что искомый репозиторий есть на странице
        $(".repo-list").should(text("delkabo/qa-g-6-Junit-1"));
        $(By.linkText("delkabo/qa-g-6-Junit-1")).click();
        //Проверить наличие поля Issue
        $("#issues-tab").should(text("issues"));
    }

}
