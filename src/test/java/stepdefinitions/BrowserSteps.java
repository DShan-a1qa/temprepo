package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.And;

import static io.qameta.allure.Allure.step;

public class BrowserSteps {
    // todo: implement
    @And("user accepts the alert")
    public void userAcceptsTheAlert() {
        step("user accepts the alert");
        AqualityServices.getBrowser().getDriver().switchTo().alert().accept();
    }
}
