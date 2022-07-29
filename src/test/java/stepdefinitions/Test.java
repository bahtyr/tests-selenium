package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class Test {

    @Given("say {string}")
    public void say(String str) {
        System.out.println("Hello " + str);
        Driver.get().get("https://www.google.com");
    }
}
