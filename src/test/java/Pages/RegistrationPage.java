package Pages;

import Utilities.BrowserDriver;
import org.openqa.selenium.By;

import static org.testng.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String userRegistrationPage="/html/body/center/h1";


    public static void validateUserRegisterationPage() throws InterruptedException {
        String userRegistration = driver.findElement(By.xpath(userRegistrationPage)).getText();
        assertEquals(userRegistration,"User Registration Page");
    }
}
