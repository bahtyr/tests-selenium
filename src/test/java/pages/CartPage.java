package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pojos.Cart;
import pojos.Product;
import utilities.Driver;

import java.util.List;

public class CartPage {

    private Cart cart;

    public CartPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public Cart getCart() {
        createCartFromPage();
        return cart;
    }

    public void createCartFromPage() {
        cart = new Cart();
        for (WebElement element : products)
            cart.addProduct(createProductFromElement(element));
    }

    public Product createProductFromElement(WebElement element) {
        String name = element.findElement(By.cssSelector(CSS_PRODUCT_NAME)).getText();
        String price = element.findElement(By.cssSelector(CSS_PRODUCT_PRICE)).getText().replaceAll("\\D", "");
        return new Product(name, Integer.parseInt(price));
    }

    private static final String CSS_PRODUCT_NAME = "h4";
    private static final String CSS_PRODUCT_PRICE = ".cart_price p";

    @FindBy(css = "#cart_info_table")                        public WebElement table;
    @FindBy(xpath = "//tbody/tr[contains(@id, 'product')]")  public List<WebElement> products;
}
