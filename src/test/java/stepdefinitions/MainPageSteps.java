package stepdefinitions;

import io.cucumber.java.en.When;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageSteps {
    // todo: implement
    private final MainPage mainPage = new MainPage();

    @When("User clicks on {string} link")
    public void userClicksOnLink(String link){
        step("User clicks on " + link + " navigation link");
        mainPage.clickNavigationLink(link);
    }

}
