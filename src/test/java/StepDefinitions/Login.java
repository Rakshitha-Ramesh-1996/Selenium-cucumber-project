package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.LoginPage.*;
import static Pages.RegistrationPage.*;

public class Login {

    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        enter_username_password();
    }
    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException {
        visibility_product_formal_shoes();
        visibility_product_sports();
        visibility_product_sneakers();
    }

}
