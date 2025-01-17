package StepDefinitions;

import io.cucumber.java.en.Given;
import static Pages.HomePage.*;


public class Home {

    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        click_on_humburger_menu();
        click_on_signLink();
    }
    @Given("User navigates to the Online products page")
    public void user_navigates_to_the_online_products_page() throws InterruptedException {
        click_on_humburger_menu();
        click_on_online_products();
    }

}
