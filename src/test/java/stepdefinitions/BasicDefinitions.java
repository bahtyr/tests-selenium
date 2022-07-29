package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class BasicDefinitions {

    @Given("Launch browser")
    public void launch_browser() {
        Driver.get();
    }

    @Given("Navigate to url {string}")
    public void navigate_to_url(String url) {
        Driver.get().get(url);
    }

    @Given("Click (on) {string} button")
    public void click_on_button(String string) {
        WebElement el = null;
        try {
            el = Driver.get().findElement(By.xpath("//button[contains(text(), '" + string + "')]"));
        } catch (NoSuchElementException e) {
            el = Driver.get().findElement(By.xpath("//a[contains(text(), '" + string + "')]"));
        } finally {
            if (el != null) {
                el.click();
            } else {
                Assert.fail(string + " element not found.");
            }
        }
    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        try {
            WebElement el = Driver.get().findElement(By.xpath("//*[contains(text(), '" + string + "')]"));
            Assert.assertTrue(string + " element is not visible.", el.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail(string + " element not found.");
        }
    }

    @Then("Select checkbox {string}")
    public void select_checkbox(String string) {
        WebElement label = Driver.get().findElement(By.xpath("//label[contains(text(), '" + string + "')]"));
        label.click();
    }

    @Then("Verify that user is navigated to {string}")
    public void verify_that_user_is_navigated_to(String url) {
        System.out.println(Driver.get().getCurrentUrl());
        System.out.println(url);
        Assert.assertEquals(Driver.get().getCurrentUrl(), url);
    }
}
