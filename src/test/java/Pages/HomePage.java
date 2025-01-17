package Pages;

import Utilities.BrowserDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BrowserDriver {

    public static String hamburger_menu = "//*[@id=\"menuToggle\"]//input";
    public static String signIn_link = "Sign In Portal";
    public static String online_product_link = "Online Products";

    public static void click_on_humburger_menu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu)).click();
    }

    public static void click_on_signLink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_link)).click();
    }

    public static void click_on_online_products() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(online_product_link)).click();
    }
}
