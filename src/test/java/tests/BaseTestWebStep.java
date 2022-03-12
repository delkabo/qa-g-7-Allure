package tests;


import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class BaseTestWebStep {

    private static final String REPO = "delkabo/qa-g-6-Junit-1";

    @Test
    void webSteps() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.searchForRepository(REPO);
        steps.checkRepository(REPO);
        steps.openRepository(REPO);
        steps.checkIssueTab();
    }
}
