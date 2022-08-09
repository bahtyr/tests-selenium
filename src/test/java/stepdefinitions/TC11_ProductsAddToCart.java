package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.CartPage;
import pages.ProductsPage;
import pojos.Cart;
import pojos.Product;
import utilities.Driver;

import java.util.HashMap;

public class TC11_ProductsAddToCart {

    CartPage page = new CartPage();
    Cart cart = new Cart();

    @Then("Click on Add to Cart on product {int}")
    public void click_on_add_to_cart_on_product(Integer pos) {
        //ui select product
        WebElement product = ProductsPage.getProductAt(pos - 1);
        //ui hover
        new Actions(Driver.get()).moveToElement(product).perform();
        //wait & click on add
        WebElement add = product.findElement(By.cssSelector(ProductsPage.CSS_PRODUCT_ADDTOCART));
        Driver.waiter(2).until(ExpectedConditions.elementToBeClickable(add));
        add.click();
        //save product details
        cart.addProduct(ProductsPage.createProductFromElement(product));
    }

    @Then("Verify that cart contains {int} products")
    public void verify_that_products_are_added_to_cart(Integer count) {
        //Note: this method only counts unique products
        Assert.assertTrue("Cart does not contain all products", count == page.products.size());
    }

    @Then("Verify that added products are the same in cart")
    public void verify_that_added_products_are_the_same_in_cart() {
        HashMap<String, Integer> map = new HashMap<>();
        Assert.assertEquals("Cart total price does not match", cart.getTotalPrice(), page.getCart().getTotalPrice());

        for (Product p : cart.getAllProducts())
            map.put(p.getName(), p.getPrice());

        for (Product p : page.getCart().getAllProducts())
            Assert.assertEquals("Product price does not match", p.getPrice(), (int) map.get(p.getName()));
    }
}
