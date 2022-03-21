package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonSteps {
AmazonPage amazonPage=new AmazonPage();

    @When("Go to {string}")
    public void goTo(String URL) {
        Driver.getDriver().get(ConfigReader.getProperty(URL));
    }

    @And("Search {string}")
    public void search(String object) {
        amazonPage.searchBox.sendKeys(object+ Keys.ENTER);    }


    @When("Select the first product listed")
    public void selectTheFirstProductListed() {
        amazonPage.firstResultLink.click();
    }

    @Then("Verify that the title of the selected product includes {string}")
    public void verifyThatTheTitleOfTheSelectedProductIncludes(String productTitle) {
        Assert.assertTrue(amazonPage.selectedProduct.getText().contains(productTitle));
    }

    @And("close to page")
    public void closeToPage() {
        //Driver.closeDriver();
    }



}
