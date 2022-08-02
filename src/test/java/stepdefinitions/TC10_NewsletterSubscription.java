package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TC10_NewsletterSubscription {

    @Given("Enter email {string} to subscribe")
    public void enter_email_to_subscribe(String string) {
        WebElement el = Driver.get().findElement(By.id("susbscribe_email"));
        el.sendKeys(string);
    }
}
