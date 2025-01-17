package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.JavaScriptAlertsPage;

import static io.qameta.allure.Allure.step;

public class JavaScriptAlertPageSteps {
    // todo: implement
    private final JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();

    @Then("alert page should be displayed")
    public void alertPageShouldBeDisplayed() {
        step("alert page is displayed");
        Assert.assertTrue(javaScriptAlertsPage.state().waitForDisplayed(), "Alert page is not displayed");
    }

    @When("user clicks on the alert button")
    public void userClicksOnTheAlertButton() {
        step("clicked FOR a JS alert");
        javaScriptAlertsPage.clickForJsAlertBtn();
    }

    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        step("Success message is displayed");
        Assert.assertTrue(javaScriptAlertsPage.isSuccessLabelDisplayed(), "Success message is not displayed");
    }
}
