package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import pages.ContactUsPage;

public class TC06_ContactUsForm {

    ContactUsPage page = new ContactUsPage();
    Faker faker = new Faker();

    @Then("Enter contact form details")
    public void enter_contact_form_details() {
        page.name.sendKeys(faker.name().fullName());
        page.email.sendKeys(faker.internet().emailAddress());
        page.subject.sendKeys(faker.lorem().characters(5, 15));
        page.message.sendKeys(faker.lorem().paragraph(3));
    }

    @Then("Upload a file to contact form")
    public void upload_a_file_to_contact_form() {
        //TODO upload file
    }
}
