package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pojos.Product;
import utilities.Driver;

public class ProductsPage {

    public ProductsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public static WebElement getProductAt(int position) {
        //return Driver.get().findElements(By.cssSelector(CSS_PRODUCT)).get(position);
        return Driver.get().findElement(By.xpath(XPATH_PRODUCT + (position + 1) + XPATH_PRODUCT_SUFFIX));
    }

    public static Product createProductFromElement(WebElement element) {
        String name = element.findElement(By.cssSelector(CSS_PRODUCT_NAME)).getText();
        String price = element.findElement(By.cssSelector(CSS_PRODUCT_PRICE)).getText().replaceAll("\\D", "");
        return new Product(name, Integer.parseInt(price));
    }

    private static final String XPATH_PRODUCT         = "(//*[contains(@class, 'features_items')]/*[contains(@class, 'col-sm-4')])[";
    private static final String XPATH_PRODUCT_SUFFIX  = "]";
    private static final String CSS_PRODUCT           = ".features_items .col-sm-4";
    private static final String CSS_PRODUCT_NAME      = ".productinfo h2+p";
    private static final String CSS_PRODUCT_PRICE     = ".productinfo h2";
    public static final String CSS_PRODUCT_ADDTOCART  = ".overlay-content .add-to-cart";

    @FindBy(css = ".features_items")                 public WebElement productsList;
    @FindBy(css = ".view-product img")               public WebElement image;
    @FindBy(css = ".product-information h2")         public WebElement name;
    @FindBy(css = ".product-information h2 + p")     public WebElement category;
    @FindBy(css = ".product-information span span")  public WebElement price;
    @FindBy(xpath = "//div[@class='product-information']/p[2]")  public WebElement availability;
    @FindBy(xpath = "//div[@class='product-information']/p[3]")  public WebElement condition;
    @FindBy(xpath = "//div[@class='product-information']/p[4]")  public WebElement brand;
}
