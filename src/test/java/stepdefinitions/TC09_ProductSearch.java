package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class TC09_ProductSearch {

    @Given("Search for {string} in products")
    public void search_for_in_products(String string) {
        Driver.get().findElement(By.cssSelector("#search_product")).sendKeys("tshirt");

    }
    @Then("Verify {string} exists in product search results")
    public void verify_exists_in_product_search_results(String string) {
        List<WebElement> relevantResults = Driver.get().findElements(By.xpath("//div[@class = 'single-products']//p[contains(text(), 'shirt')]"));
        Assert.assertTrue("Search did not find any relevant items.", relevantResults.size() > 0);
    }
}
