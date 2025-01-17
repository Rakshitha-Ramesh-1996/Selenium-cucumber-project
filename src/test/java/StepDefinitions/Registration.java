package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.LoginPage.*;
import static Pages.RegistrationPage.*;

public class Registration {

    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() throws InterruptedException {
        click_on_new_registeration_button();
    }
    @Then("User should be able to view the Registration page")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        validateUserRegisterationPage();
    }

}
