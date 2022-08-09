package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {

    public ProductsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public static WebElement getProductAt(int position) {
        return Driver.get().findElements(By.cssSelector(".features_items .col-sm-4")).get(position);
        //return Driver.get().findElement(By.xpath("//*[contains(@class, 'features_items')]/*[contains(@class, 'col-sm-4')]["+position+"]"));
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
