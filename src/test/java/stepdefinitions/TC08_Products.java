package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProductsPage;

public class TC08_Products {

    ProductsPage page = new ProductsPage();

    @Then("Verify that the products list is visible")
    public void verify_that_the_products_list_is_visible() {
        Assert.assertTrue("'Product-productsList' is not visible.", page.productsList.isDisplayed());
    }

    @Then("Verify that product details are visible")
    public void verify_that_product_details_are_visible() {
        Assert.assertTrue("'Product-image' is not visible.", page.image.isDisplayed());
        Assert.assertTrue("'Product-name' is not visible.", page.name.isDisplayed());
        Assert.assertTrue("'Product-category' is not visible.", page.category.isDisplayed());
        Assert.assertTrue("'Product-price' is not visible.", page.price.isDisplayed());
        boolean b1 = page.availability.isDisplayed() && page.availability.getText().length() > "Availability:".length() + 2;
        boolean b2 = page.condition.isDisplayed() && page.condition.getText().length() > "Condition:".length() + 2;
        boolean b3 = page.brand.isDisplayed() && page.brand.getText().length() > "Brand:".length() + 2;
        Assert.assertTrue("'Product-availability' is not visible.", b1);
        Assert.assertTrue("'Product-condition' is not visible.", b2);
        Assert.assertTrue("'Product-brand' is not visible.", b3);
    }
}
