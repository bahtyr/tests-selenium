package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SignupPage {

    public SignupPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@name = 'title']")  public List<WebElement> title;
    @FindBy(css = "#name")           public WebElement name;
    @FindBy(css = "#email")          public WebElement email;
    @FindBy(css = "#password")       public WebElement password;
    @FindBy(css = "#days")           public WebElement dobDay;
    @FindBy(css = "#months")         public WebElement dobMonth;
    @FindBy(css = "#years")          public WebElement dobYear;

    @FindBy(css = "#first_name")     public WebElement firstName;
    @FindBy(css = "#last_name")      public WebElement lastName;
    @FindBy(css = "#company")        public WebElement company;
    @FindBy(css = "#address1")       public WebElement address1;
    @FindBy(css = "#address2")       public WebElement address2;
    @FindBy(css = "#country")        public WebElement country;
    @FindBy(css = "#state")          public WebElement state;
    @FindBy(css = "#city")           public WebElement city;
    @FindBy(css = "#zipcode")        public WebElement zipcode;
    @FindBy(css = "#mobile_number")  public WebElement mobile;
}
