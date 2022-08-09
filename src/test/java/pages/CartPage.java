package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#cart_info_table")
    WebElement table;

    @FindBy(xpath = "//tbody/tr[contains(@id, 'product')]")
    public List<WebElement> products;
}
