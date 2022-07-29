package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {

    public ContactUsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@name = 'name']")          public WebElement name;
    @FindBy(xpath = "//*[@name = 'email']")         public WebElement email;
    @FindBy(xpath = "//*[@name = 'subject']")       public WebElement subject;
    @FindBy(xpath = "//*[@name = 'message']")       public WebElement message;
    @FindBy(xpath = "//*[@name = 'upload_file']")   public WebElement upload;
}
