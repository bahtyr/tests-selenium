package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TC02_UserLogin {

    @Given("Enter login email and password")
    public void enter_login_email_and_password(DataTable table) {
        WebElement name = Driver.get().findElement(By.xpath("//input[@data-qa='login-email']"));
        WebElement email = Driver.get().findElement(By.xpath("//input[@data-qa='login-password']"));
        name.clear();
        email.clear();
        name.sendKeys(table.row(0).get(0));
        email.sendKeys(table.row(0).get(1));
    }
}
