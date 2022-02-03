package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user is on page")
    public void user_is_on_page() {
        System.out.println("user is on page");

    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("user enters username and password");

    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("clicks on login button");

    }

    @Then("user is navigated to the page")
    public void user_is_navigated_to_the_page() {
        System.out.println("user is navigated to the page");

    }

}
