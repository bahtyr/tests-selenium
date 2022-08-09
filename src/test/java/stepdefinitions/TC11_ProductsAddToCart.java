package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.CartPage;
import pages.ProductsPage;
import utilities.Driver;

public class TC11_ProductsAddToCart {

    CartPage page = new CartPage();

    @Then("Click on Add to Cart on product {int}")
    public void click_on_add_to_cart_on_product(Integer pos) {
        WebElement product = ProductsPage.getProductAt(pos - 1); //get product
        new Actions(Driver.get()).moveToElement(product).perform(); //hover
        WebElement add = product.findElement(By.cssSelector(".overlay-content .add-to-cart"));
        Driver.waiter(2).until(ExpectedConditions.elementToBeClickable(add)); //wait
        add.click(); //click
    }

    @Then("Verify that cart contains {int} products")
    public void verify_that_products_are_added_to_cart(Integer count) {
        //Note: this method only counts unique products
        Assert.assertTrue("Cart does not contain all products", count == page.products.size());
    }
    @Then("Verify that added products are the same in cart")
    public void verify_that_added_products_are_the_same_in_cart() {

    }

}
