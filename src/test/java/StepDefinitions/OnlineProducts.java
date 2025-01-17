package StepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Pages.OnlineProductsPage.*;
import static Pages.OnlineProductsPage.get_first_formal_shoe;
import static org.testng.Assert.assertEquals;

public class OnlineProducts {


    @When("User clicks on Formal Shoes drop down")
    public void user_clicks_on_formal_shoes_drop_down() throws InterruptedException {
        click_on_formal_shoes_dropdown();
    }
    @Then("User should be able to view the Products")
    public void user_should_be_able_to_view_the_products() throws InterruptedException {
        get_first_formal_shoe();
        assertEquals(get_first_formal_shoe().trim(),"Classic Cheltenham");
    }

}
