package Pages;

import Utilities.BrowserDriver;
import org.openqa.selenium.By;

import static org.testng.Assert.assertEquals;

public class LoginPage extends BrowserDriver {

    public static String userName = "usr";
    public static String password = "pwd";
    public static String login = "//*[@id=\"second_form\"]/input";
    public static String sports="//*[@id=\"ShoeType\" and text()='Sports']";
    public static String formalShoes="//*[@id=\"ShoeType\" and text()='Formal Shoes']";
    public static String sneakers="//*[@id=\"ShoeType\" and text()='Sneakers']";
    public static String newRegisterationButton="NewRegistration";

    public static void enter_username_password() throws InterruptedException {
        driver.findElement(By.id(userName)).sendKeys("Raksha");
        driver.findElement(By.id(password)).sendKeys("Password");
        driver.findElement(By.xpath(login)).click();
    }

    public static void visibility_product_sports() throws InterruptedException {
    String actualProductCategory_ss = driver.findElement(By.xpath(sports)).getText();
    assertEquals(actualProductCategory_ss,"Sports");
    }

    public static void visibility_product_formal_shoes() throws InterruptedException {
        String actualProductCategory_fs = driver.findElement(By.xpath(formalShoes)).getText();
        assertEquals(actualProductCategory_fs,"Formal Shoes");
    }

    public static void visibility_product_sneakers() throws InterruptedException {
        String actualProductCategory_s = driver.findElement(By.xpath(sneakers)).getText();
        assertEquals(actualProductCategory_s,"Sneakers");
    }
    public static void click_on_new_registeration_button() throws InterruptedException {
        driver.findElement(By.id(newRegisterationButton)).click();
    }

}
