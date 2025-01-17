package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.EnvDataReader;

public class Hooks {
    // todo: add hooks for pre and post conditions
    private Browser browser = AqualityServices.getBrowser();

    @Before()
    public void setup(){
        browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(EnvDataReader.getEnvData().getHost());
    }

    @After()
    public void tearDown(){
        browser.quit();
    }
}
