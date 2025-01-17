package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DataTablesPage;
import utils.StringUtils;
import utils.TestDataReader;

import static io.qameta.allure.Allure.step;

public class DataTableSteps {
    // todo: implement
    private final DataTablesPage dataTablePage = new DataTablesPage();

    @Then("the sum of the values should equal what's due")
    public void theSumOfTheValuesShouldEqual() {
        double actualSum = 0.0;
        for (String str_value : dataTablePage.getFirstDueList()) {
            actualSum += StringUtils.getDoubleFromString(str_value);
        }
        step("calculated sum: " + actualSum);
        step("new checking if equal to expected: " + TestDataReader.getDataTableData().getExpectedDueSum());
        Assert.assertEquals(TestDataReader.getDataTableData().getExpectedDueSum(), actualSum, "The sum of the values is not equal to the expected amount");
    }
}
