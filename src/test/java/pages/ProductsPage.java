package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {

    public ProductsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".features_items")                 public WebElement productsList;
    @FindBy(css = ".view-product img")               public WebElement image;
    @FindBy(css = ".product-information h2")         public WebElement name;
    @FindBy(css = ".product-information h2 + p")     public WebElement category;
    @FindBy(css = ".product-information span span")  public WebElement price;
    @FindBy(xpath = "//div[@class='product-information']/p[2]")  public WebElement availability;
    @FindBy(xpath = "//div[@class='product-information']/p[3]")  public WebElement condition;
    @FindBy(xpath = "//div[@class='product-information']/p[4]")  public WebElement brand;
}
