package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.SignupPage;
import utilities.Driver;
import utilities.Radio;

import java.util.List;

public class TC01_RegisterUser {

    SignupPage page;
    Faker faker = new Faker();

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
    }

    @Then("Enter signup name and email")
    public void enter_signup_name_and_email(DataTable table) {
        WebElement name = Driver.get().findElement(By.xpath("//input[@data-qa='signup-name']"));
        WebElement email = Driver.get().findElement(By.xpath("//input[@data-qa='signup-email']"));
        if ("faker".equals(table.row(0).get(0))) {
            name.sendKeys(faker.name().username());
            email.sendKeys(faker.internet().emailAddress());
        } else {
            name.sendKeys(table.row(0).get(0));
            email.sendKeys(table.row(0).get(1));
        }
    }

    @Then("Fill user details part1")
    public void fill_user_details_part1(DataTable table) {
        page = new SignupPage();
        List<String> list = table.row(0);
        new Radio(page.title).selectByValue(list.get(0));
        page.name.sendKeys(list.get(1));
        page.password.sendKeys(list.get(2));
        new Select(page.dobDay).selectByValue(list.get(3));
        new Select(page.dobMonth).selectByValue(list.get(4));
        new Select(page.dobYear).selectByValue(list.get(5));
    }

    @Then("Fill user details part2")
    public void fill_user_details_part2() {
        page.firstName.sendKeys(faker.name().firstName());
        page.lastName.sendKeys(faker.name().lastName());
        page.company.sendKeys(faker.company().name());
        page.address1.sendKeys(faker.address().streetAddress());
        page.address2.sendKeys(faker.address().streetAddress());
        new Select(page.country).selectByIndex(1);
        page.state.sendKeys(faker.address().state());
        page.city.sendKeys(faker.address().city());
        page.zipcode.sendKeys(faker.address().zipCode());
        page.mobile.sendKeys(faker.phoneNumber().phoneNumber());
    }

}
